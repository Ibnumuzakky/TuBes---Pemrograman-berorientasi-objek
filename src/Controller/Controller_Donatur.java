/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.Database;
import Model.Model_Donasi;
import Model.Model_Donatur;
import Model.Model_EventGalangdana;
import Model.Model_Penggalangdana;
import View.GUI_Donatur;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rivannurihsan
 */
public class Controller_Donatur extends MouseAdapter implements ActionListener{
    GUI_Donatur view;
    Application model;
    Model_Donatur dntr;
    Controller_Login CL;
    private Database db;
    private String nama,email,password,tempatlahir,alamat,gender,judulEvent;
    private String tglLahir;
    private String notlp;
    private String usernamelogin;
    private String username;
    private String namaevent;
    private int nominal;
    private String simpannominal;
    public Controller_Donatur(Application model,String user) {
        this.model = model;
        view = new GUI_Donatur();
        view.setVisible(true);
        view.addActionListener(this);
        view.addmouseadapter(this);
        this.usernamelogin = user;
        db = new Database();
        db.loadDonatur();
        loadTableDnatur();
        loadTablekonfirmasi();
        loadTabledonasi();
    }
    public void loadTableDnatur() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"Nama", "Email", "Username", "Alamat", "Password","Gender", "No_Hp", "Tempat_Lahir", "Date"}, 0);
        ArrayList<Model_Donatur> donatur = db.getDonatur();
        db.getdonaturnull();
        db.loadDonatur();
        System.out.println("size "+donatur.size());
        for (Model_Donatur b : donatur) {
            System.out.println("b :"+b.getUsername());
            if (b.getUsername().equals(usernamelogin)) {
                a.addRow(new Object[]{b.getNama(), b.getEmail(), b.getUsername(), b.getAlamat(), b.getPassword(),b.getGender(), b.getNohp(),b.getDate(), b.getTempat()});
                System.out.println("aku" + b.getAlamat());
            }
            
        }
        System.out.println("yaampun");

        view.setTbdonatur(a);
    }
    public void loadTablekonfirmasi() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"kategori", "judul_event", "target_donasi", "nama", "tanggalLahir", "notlp", "lokasi", "TanggalMulai","tanggalBerakhir","id_perusahaan","Username","Status"}, 0);
        int baris = a.getRowCount();
        db.getEventgalangdanadanpenerimaNULL();
        db.loadEventdanPenerima();
        ArrayList<Model_EventGalangdana> eventgalangdana = db.getEventgalangdanadanpenerima();
        for (Model_EventGalangdana b : eventgalangdana) {
            a.addRow(new Object[]{b.getKategori(), b.getJudul(), b.getTarget(), b.getNama(), b.getTglLahir(), b.getNotlp(), b.getLokasi(), b.getDateMulai(), b.getDateAkhir(),b.getIdPerusahaan(),b.getUsernamepembuat(),b.getStatus()});
            System.out.println("aku" + b.getAlamat());
        }
        System.out.println("yaampun");
        
        view.setTbEvent(a);
    }
    public void loadTabledonasi() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"judul_event", "username", "namadonatur", "uangdonasi"}, 0);
        int baris = a.getRowCount();
        db.getdonasinull();
        db.loaddatadonasi();
        ArrayList<Model_Donasi> donasi = db.getdonasi();
        for (Model_Donasi b : donasi) {
            a.addRow(new Object[]{b.getJudul(), b.getUsername(), b.getNamadonatur(), b.getNominal()});
            System.out.println("aku" + b.getJudul());
        }
        System.out.println("yaampun");
        
        view.setTbupdate(a);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBUTTONUPDATEAKUN())) {
            nama = view.getDataNama();
            email = view.getDataEmail();
            alamat = view.getDataAlamat();
            password = view.getDataPassword();
            gender =view.getDataGender();
            notlp = view.getDataNohp();
            tempatlahir = view.getDataTempatLahir();
            tglLahir = view.getDataTglLahir();
            System.out.println(tglLahir);
            System.out.println(tempatlahir);
            Model_Donatur p = new Model_Donatur(nama, email, username, alamat, password, gender, notlp, tglLahir, tempatlahir);
            db.updateAkunDonatur(p);
            loadTableDnatur();
            loadTabledonasi();
            loadTablekonfirmasi();
        }if (source.equals(view.getAddDonasiatGalanggdana())) {
            nama = view.getNAMADONATURatGalangdana();
            int jml = Integer.parseInt(view.getJumlahDonasiatgalangdana());
            db.addDataDonasi(namaevent, usernamelogin, nama, jml);
            System.out.println("asup");
            loadTableDnatur();
            loadTabledonasi();
            loadTablekonfirmasi();
        }if (source.equals(view.getUPDATEEVNTMU())) {
            System.out.println("masuk");
            judulEvent = view.getDataupdateevnt();
            username = view.getDataupdateusername();
            nama = view.getDataupdatedonatur();
            nominal = Integer.parseInt(view.getDataupdateuangdonasi());
            Model_Donasi p = new Model_Donasi(judulEvent, username, nama, nominal);
            db.updatedonasi(p);
            loadTableDnatur();
            loadTabledonasi();
            loadTablekonfirmasi();
        }if (source.equals(view.getLOGOUT())) {
            view.dispose();
            CL = new Controller_Login(model);
        }
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getjTabledonatur())) {
             int i = view.getSelecteddonatur();
            nama =view.getjTabledonatur().getModel().getValueAt(i, 0).toString();
            email = view.getjTabledonatur().getModel().getValueAt(i, 1).toString();
            username = view.getjTabledonatur().getModel().getValueAt(i, 2).toString();
            alamat = view.getjTabledonatur().getModel().getValueAt(i, 3).toString();
            password = view.getjTabledonatur().getModel().getValueAt(i, 4).toString();
            gender =view.getjTabledonatur().getModel().getValueAt(i, 5).toString();
            notlp = view.getjTabledonatur().getModel().getValueAt(i, 6).toString();
            tempatlahir = view.getjTabledonatur().getModel().getValueAt(i, 7).toString();
            tglLahir = view.getjTabledonatur().getModel().getValueAt(i, 8).toString();
            view.setDataNama(nama);
            view.setDataEmail(email);
            view.setDataAlamat(alamat);
            view.setDataPassword(password);
            view.setDataGender(gender);
            view.setDataNohp(notlp);
            view.setDataTempatLahir(tempatlahir);
            view.setDataTglLahir(tglLahir);
            view.setDataUsername(username);
         }if (source.equals(view.getjTableEvent())) {
            int i = view.getSelectedkonfirevent();
            namaevent = view.getjTableEvent().getModel().getValueAt(i, 1).toString();
            view.setNamaEventatgalangdana(namaevent);
        }
         if (source.equals(view.getjTableUpdate())) {
            int i = view.getSelectedUpdate();
            judulEvent = view.getjTableUpdate().getModel().getValueAt(i, 0).toString();
            username = view.getjTableUpdate().getModel().getValueAt(i, 1).toString();
            nama = view.getjTableUpdate().getModel().getValueAt(i, 2).toString();
            
            simpannominal = view.getjTableUpdate().getModel().getValueAt(i, 3).toString();
            //simpannominal =  String.valueOf(nominal);
             System.out.println(simpannominal);
            view.setDataupdateusername(username);
            view.setDataupdatedonatur(nama);
            view.setDataupdateevnt(judulEvent);
            view.setDataupdateuangdonasi(simpannominal);
         }
    }
}
