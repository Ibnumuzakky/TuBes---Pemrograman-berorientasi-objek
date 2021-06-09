/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.Database;
import Model.Model_Donatur;
import Model.Model_EventGalangdana;
import Model.Model_Penggalangdana;
import View.GUI_Administrator;
import View.GUI_PenggalangDana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rivannurihsan
 */
public class Controller_Admin extends  MouseAdapter implements ActionListener {

    GUI_Administrator view;
    Application model;
    private Database db;
    Model_EventGalangdana event;
    private List<Model_EventGalangdana> listeventACC;
    private String simpanNoHP;
    Controller_Login CL;
    public Controller_Admin(Application model) {
        db = new Database();
        view = new GUI_Administrator();
        view.setVisible(true);
        view.addActionListener(this);
        view.addMouseAdapter(this);
        db.loadDonatur();
        db.loadPenggalangdana();
        db.loadEventdanPenerima();
        
        loadTablePenggalangdana();
        loadTable();
        loadTablePenerima();
        loadTablekonfirmasi();
       
        System.out.println("ga kjesini kan");
        
    }

    public void loadTable() {
        DefaultTableModel mod = new DefaultTableModel(new String[]{"Nama", "Email", "Username", "Alamat", "Gender", "No_Hp", "Tempat_Lahir", "Date"}, 0);
        ArrayList<Model_Donatur> donatur = db.getDonatur();
        for (Model_Donatur b : donatur) {
            mod.addRow(new Object[]{b.getNama(), b.getEmail(), b.getUsername(), b.getAlamat(), b.getPassword(), b.getGender(), b.getNohp(), b.getTempat(), b.getDate()});
            System.out.println("aku" + b.getAlamat());
        }
        System.out.println("yaampun");
        view.setTbDonatur(mod);
    }
    public void loadTablePenggalangdana() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"Nama", "Email", "Username", "Alamat", "Gender", "No_Hp", "Tempat_Lahir", "Date"}, 0);
        ArrayList<Model_Penggalangdana> penggalang = db.getPenggalangdana();
        for (Model_Penggalangdana b : penggalang) {
            a.addRow(new Object[]{b.getNama(), b.getEmail(), b.getUsername(), b.getAlamat(), b.getPassword(), b.getGender(), b.getNohp(), b.getTempat(), b.getDate()});
            System.out.println("aku" + b.getAlamat());
        }
        System.out.println("yaampun");

        view.setTbPenggalang(a);
    }
    public void loadTablePenerima() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"Nama", "Tanggal_Lahir", "notlp", "Lokasi", "Judul_Event", "TanggalMulai", "TanggalBerakhir", "ID_Perusahaan","PembuatEvent"}, 0);
        ArrayList<Model_EventGalangdana> penerima = db.getEventgalangdanadanpenerima();
        for (Model_EventGalangdana b : penerima) {
            a.addRow(new Object[]{b.getNama(), b.getTglLahir(), b.getNotlp(), b.getLokasi(), b.getJudul(), b.getDateMulai(), b.getDateAkhir(), b.getIdPerusahaan(), b.getUsernamepembuat()});
            System.out.println("nama "+b.getNama()
                                +"Tanggal_lahir "+b.getTglLahir());
        }
        System.out.println("yaampun");

        view.setTbPenerima(a);
    }
    public void loadTablekonfirmasi() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"kategori", "judul_event", "target_donasi", "nama", "tanggalLahir", "notlp", "lokasi", "TanggalMulai","tanggalBerakhir","id_perusahaan","Username","Status"}, 0);
        int baris = a.getRowCount();
        db.getEventgalangdanadanpenerimaNULL();
        db.loadEventdanPenerima();
        ArrayList<Model_EventGalangdana> eventgalangdana = db.getEventgalangdanadanpenerima();
        for (Model_EventGalangdana b : eventgalangdana) {
            a.addRow(new Object[]{b.getKategori(), b.getJudul(), b.getTarget(), b.getNama(), b.getTglLahir(), b.getNotlp(), b.getLokasi(), b.getDateMulai(), b.getDateAkhir(),b.getIdPerusahaan(),b.getUsername(),b.getStatus()});
            System.out.println("aku" + b.getAlamat());
        }
        System.out.println("yaampun");
        
        view.setTbkonfirmasi(a);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnkonfirm())) {
           System.out.println("ini hp : "+simpanNoHP);
            db.tampilkanEvent(simpanNoHP);
            loadTablekonfirmasi();
            db.loadEventdanPenerima();
//            view.setBLMACC(model.geteventBLMACC());
//            view.setSudahAcc(model.getEventTelahAcc());
            System.out.println("asup");
            
        }if (source.equals(view.getLOGOUT())) {
            view.dispose();
            CL = new Controller_Login(model);
        }
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getJtbkonfir())) {
            int i = view.getSelectedkonfir();
            System.out.println("hore");
            System.out.println("ini i : "+i);
            simpanNoHP = view.getJtbkonfir().getModel().getValueAt(i, 5).toString();
            System.out.println("nohp"+simpanNoHP);
            
        }
    }
}
