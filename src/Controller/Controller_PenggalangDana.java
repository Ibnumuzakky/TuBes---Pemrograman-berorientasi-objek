/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.Database;
import Model.Model_Penggalangdana;
import View.GUI_PenggalangDana;
import Model.Model_EventGalangdana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rivannurihsan
 */
public class Controller_PenggalangDana extends MouseAdapter implements ActionListener {
    GUI_PenggalangDana view;
    Application model;
    Model_Penggalangdana mdl;
    Model_EventGalangdana evnt;
    Controller_Login CL;
    private String usernamelogin;
    private Database db;
    private String nama,email,password,tempatlahir,alamat,gender;
    private String tglLahir;
    private String notlp;
    private String lokasi;
    private String Judul_Event;
    private String tanggalMulai,tanggalAkhir;
    private String idPerusahaan;
    private String Pembuatevent;
    private String kategori,username,status;
    private String targetdonasi;
    private int jmldonasi;

    public Controller_PenggalangDana(Application model,String username) {
       this.model = model;
       this.mdl = new Model_Penggalangdana();
       view = new GUI_PenggalangDana();
       view.setVisible(true);
       view.addActionListener(this);
       view.addMouseAdapter(this);
       this.usernamelogin = username;
       db = new Database();
       db.loadEventdanPenerima();
       db.loadPenggalangdana();
       tablePenerima();
       loadTablekonfirmasi();
       loadTablePenggalangdana();
    }
    
    public void tablePenerima(){
        DefaultTableModel a = new DefaultTableModel(new String[]{"Nama", "Tanggal_Lahir", "notlp", "Lokasi", "Judul_Event", "TanggalMulai", "TanggalBerakhir", "ID_Perusahaan","PembuatEvent"}, 0);
        db.getEventgalangdanadanpenerimaNULL();
        db.loadEventdanPenerima();
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
            a.addRow(new Object[]{b.getKategori(), b.getJudul(), b.getTarget(), b.getNama(), b.getTglLahir(), b.getNotlp(), b.getLokasi(), b.getDateMulai(), b.getDateAkhir(),b.getIdPerusahaan(),b.getUsernamepembuat(),b.getStatus()});
            System.out.println("aku" + b.getAlamat());
        }
        System.out.println("yaampun");
        
        view.setTevent(a);
    }
    public void loadTablePenggalangdana() {
        DefaultTableModel a = new DefaultTableModel(new String[]{"Nama", "Email", "Username", "Alamat", "Password","Gender", "No_Hp", "Tempat_Lahir", "Date"}, 0);
        db.getpenggalangdanaNULL();
        db.loadPenggalangdana();
        ArrayList<Model_Penggalangdana> penggalang = db.getPenggalangdana();
        
        System.out.println("size "+penggalang.size());
        System.out.println("username : "+ usernamelogin);
        for (Model_Penggalangdana b : penggalang) {
            System.out.println("b :"+b.getUsername());
            if (b.getUsername().equals(usernamelogin)) {
                a.addRow(new Object[]{b.getNama(), b.getEmail(), b.getUsername(), b.getAlamat(), b.getPassword(),b.getGender(), b.getNohp(),b.getDate(), b.getTempat()});
                System.out.println("aku" + b.getAlamat());
            }
            
        }
        System.out.println("yaampun");

        view.setTbPenggalang(a);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        //=============================== MENU GALANGDANA===============================
        if (source.equals(view.getBtnSubmit())) {
            String kategori = view.getCbKategori();
            String judul = view.getTfJudul();
            int target = view.getTfTarget();
            String nama = view.getTfNamaPenerima();
            SimpleDateFormat formatbaru = new SimpleDateFormat("yyyy-MM-dd");
            Date dateLahir = view.getjDateLahir();
            String tglLahir = formatbaru.format(dateLahir);
            String notlp = view.getTfNotlpPenerima();
            String lokasi = view.getTfLokasiPenerima();
            Date mulai = view.getjDatebefore();
            String dateMulai = formatbaru.format(mulai);
            Date akhir = view.getjDateAfter();
            String dateAkhir = formatbaru.format(akhir);
            String idPerusahaan = view.getTfIdPerusahaan();
            String usernamepembuat = this.usernamelogin; 
            String status =null;
            System.out.println(dateMulai);
            Model_EventGalangdana a = new Model_EventGalangdana(nama, kategori, judul, target, usernamepembuat, tglLahir, notlp, lokasi, dateMulai, dateAkhir, idPerusahaan,status);
            System.out.println("hasil = :"+a.getDateMulai());
            mdl.createEvent(a);
            db.addEventPenggalangandana(a);
            
            view.resetView();
            System.out.println(mdl.getIndeks());
            //System.out.println(evnt.printUserDonaturbynama());
            try {
                view.setListEventAnda(evnt.printUserDonaturbynama());
            } catch (Exception ew) {
                System.out.println("yaallah");
            }
            
        }
        if (source.equals(view.getTbUbah())) {
//            nama = view.getTfNama();
            tglLahir = view.getTfTglLahir();
            notlp = view.getTfNoTlp();
            lokasi = view.getTfLokasi();
            Judul_Event = view.getTfJudulEvent();
            tanggalMulai = view.getTfTglMulai();
            tanggalAkhir = view.getTfTglAkhir();
            idPerusahaan = view.getTfIdperusahaan2();
            Pembuatevent = view.getTfPembuatevent();
            evnt = new Model_EventGalangdana(nama, kategori, Judul_Event, 0, usernamelogin, tglLahir, notlp, lokasi, tanggalMulai, tanggalAkhir, idPerusahaan, status);
            db.updatePenggalang(evnt);
            tablePenerima();
       loadTablekonfirmasi();
       loadTablePenggalangdana();
        }
        if (source.equals(view.getButtonupdate())) {
            jmldonasi = Integer.parseInt(view.getjTxTargetDonasi());
            tglLahir = view.getjTxTanggalLahir();
            notlp = view.getjTxNotelpon();
            lokasi = view.getjTxLokasi();
            Judul_Event = view.getjTxJudulevent();
            tanggalMulai = view.getjTxTanggalMulai();
            tanggalAkhir = view.getjTxTanggalAkhir();
            evnt = new Model_EventGalangdana(nama, kategori, Judul_Event, jmldonasi, username, tglLahir, notlp, lokasi, tanggalMulai, tanggalAkhir, idPerusahaan, status);
            db.updateEventPenggalang(evnt);
            tablePenerima();
       loadTablekonfirmasi();
       loadTablePenggalangdana();
        }if (source.equals(view.getButtondelete())) {
            System.out.println("ada sampe sini");
            evnt = new Model_EventGalangdana(nama, kategori, Judul_Event, jmldonasi, username, tglLahir, notlp, lokasi, tanggalMulai, tanggalAkhir, idPerusahaan, status);
            System.out.println("adaan "+evnt.getJudul());
            db.deleteevent(evnt);
            tablePenerima();
       loadTablekonfirmasi();
       loadTablePenggalangdana();
        }if (source.equals(view.getTbDelete())) {
            System.out.println("ada sampe sini");
            evnt = new Model_EventGalangdana(nama, kategori, Judul_Event, jmldonasi, username, tglLahir, notlp, lokasi, tanggalMulai, tanggalAkhir, idPerusahaan, status);
            System.out.println("adaan "+evnt.getJudul());
            db.deleteevent(evnt);
            tablePenerima();
       loadTablekonfirmasi();
       loadTablePenggalangdana();
        }if (source.equals(view.getBtnUPDATEAKUN())) {
            nama = view.getDatanama();
            email = view.getDataemail();
            alamat = view.getDataalamat();
            password = view.getDatapassword();
            gender =view.getDatagender();
            notlp = view.getDatanohp();
            tempatlahir = view.getDatatempatlahir1();
            tglLahir = view.getDatatanggallahir();
            Model_Penggalangdana p = new Model_Penggalangdana(nama, email, username, alamat, password, gender, notlp, tglLahir, tempatlahir);
            db.updateakunPenggalangdana(p); // tinnggal test
            tablePenerima();
       loadTablekonfirmasi();
       loadTablePenggalangdana();
        }
        if (source.equals(view.getLOGOUT())) {
            view.dispose();
            CL = new Controller_Login(model);
        }
    }
     public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getjTablePenerima())) {
            int i =view.getSelectedkonfir();
            nama = view.getjTablePenerima().getModel().getValueAt(i, 0).toString();
            tglLahir = view.getjTablePenerima().getModel().getValueAt(i, 1).toString();
            notlp = view.getjTablePenerima().getModel().getValueAt(i, 2).toString();
            lokasi = view.getjTablePenerima().getModel().getValueAt(i, 3).toString();
            Judul_Event = view.getjTablePenerima().getModel().getValueAt(i, 4).toString();
            tanggalMulai = view.getjTablePenerima().getModel().getValueAt(i, 5).toString();
            tanggalAkhir = view.getjTablePenerima().getModel().getValueAt(i, 6).toString();
            idPerusahaan = view.getjTablePenerima().getModel().getValueAt(i, 7).toString();
            Pembuatevent = view.getjTablePenerima().getModel().getValueAt(i, 8).toString();
            view.setTfNama(nama);
            view.setTfTglLahir(tglLahir);
            view.setTfNoTlp(notlp);
            view.setTfLokasi(lokasi);
            view.setTfJudulevent(Judul_Event);
            view.setTfTglMulai(tanggalMulai);
            view.setTfTglAkhir(tanggalAkhir);
            view.setTfIdperusahaan2(idPerusahaan);
            view.setTfPembuatevent(Pembuatevent);
            
        }if (source.equals(view.getjTableevent())) {
             int i =view.getSelectedkonfirevent();
             kategori = view.getjTableevent().getModel().getValueAt(i, 0).toString();
             Judul_Event = view.getjTableevent().getModel().getValueAt(i, 1).toString();
             targetdonasi = view.getjTableevent().getModel().getValueAt(i, 2).toString();
             nama = view.getjTableevent().getModel().getValueAt(i, 3).toString();
            tglLahir = view.getjTableevent().getModel().getValueAt(i, 4).toString();
            notlp = view.getjTableevent().getModel().getValueAt(i, 5).toString();
            lokasi = view.getjTableevent().getModel().getValueAt(i, 6).toString();
           
            tanggalMulai = view.getjTableevent().getModel().getValueAt(i, 7).toString();
            tanggalAkhir = view.getjTableevent().getModel().getValueAt(i, 8).toString();
            idPerusahaan = view.getjTableevent().getModel().getValueAt(i, 9).toString();
 //           Pembuatevent = view.getjTableevent().getModel().getValueAt(i, 10).toString();
  //          status = view.getjTableevent().getModel().getValueAt(i, 11).toString();
            view.setJtxKategori(kategori);
            view.setjTxJudulevent(Judul_Event);
            view.setjTxTargetDonasi(targetdonasi);
            view.setjTxNama(nama);
            view.setjTxTanggalLahir(tanggalAkhir);
            view.setjTxNotelpon(notlp);
            view.setjTxLokasi(lokasi);
            view.setjTxTanggalMulai(tanggalMulai);
            view.setjTxTanggalAkhir(tanggalAkhir);
//            view.setjTxidPerusahaan(idPerusahaan);
//            view.setjTxUsername(username);
         }
         if (source.equals(view.getjTablePenggalang())) {
             int i = view.getSelectedpenggalang();
            nama =view.getjTablePenggalang().getModel().getValueAt(i, 0).toString();
            email = view.getjTablePenggalang().getModel().getValueAt(i, 1).toString();
            username = view.getjTablePenggalang().getModel().getValueAt(i, 2).toString();
            alamat = view.getjTablePenggalang().getModel().getValueAt(i, 3).toString();
            password = view.getjTablePenggalang().getModel().getValueAt(i, 4).toString();
            gender =view.getjTablePenggalang().getModel().getValueAt(i, 5).toString();
            notlp = view.getjTablePenggalang().getModel().getValueAt(i, 6).toString();
            tempatlahir = view.getjTablePenggalang().getModel().getValueAt(i, 7).toString();
            tglLahir = view.getjTablePenggalang().getModel().getValueAt(i, 8).toString();
            view.setDatanama(nama);
            view.setDataemail(email);
            view.setDataalamat(alamat);
            view.setDatapassword(password);
            view.setDatagender(gender);
            view.setDatanohp(kategori);
            view.setDatatempatlahir1(tempatlahir);
            view.setDatatanggallahir(tglLahir);
         }
    }
}
