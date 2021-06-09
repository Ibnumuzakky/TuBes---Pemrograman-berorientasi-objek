/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author telcay
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Model_Donatur> donatur = new ArrayList<>();
    private ArrayList<Model_Penggalangdana> penggalangdana = new ArrayList<>();
    private ArrayList<Model_EventGalangdana> EventGalangDana = new ArrayList<>();
    private ArrayList<Model_Donasi> donasi = new ArrayList<>();
    Connection con;
    
    
    public void connect(){
        String url = "jdbc:mysql://localhost:3306/TugasBesarDonasiOnline";
        String user = "root";
        String pass = "";
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
           stmt = conn.createStatement();
            System.out.println("asup");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("teu asup");
        }
    }
    
    public void disconnect(){
       try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        int row;
        try {
           row = stmt.executeUpdate(query);
           if (row > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("gaada");
        }
        
        return cek;
    }
    public boolean LoginDonatur(String username, String password){
        connect();
        boolean ditemukan = false;
        String a = "SELECT * FROM Akun_Donatur;";
        System.out.println(a);
        System.out.println("keteranga pass user: "+username+"-"+password);
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(a);
            while (rs.next()) {                
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    ditemukan = true;
                    System.out.println("found");
                }else{
                    System.out.println("NotFound");
                }
            }
            
        } catch (Exception e) {
            System.out.println("not found");
        }
        return ditemukan;
    }
    public boolean LoginPenggalangdana(String username, String password){
        connect();
        boolean ditemukan = false;
        String a = "SELECT * FROM Akun_Penggalangdana;";
        System.out.println(a);
        System.out.println("keteranga pass user: "+username+"-"+password);
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(a);
            while (rs.next()) {                
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    ditemukan = true;
                    System.out.println("found");
                }else{
                    System.out.println("NotFound");
                }
            }
            
        } catch (Exception e) {
            System.out.println("not found");
        }
        return ditemukan;
    }
    public boolean LoginAdmin(String username, String password){
        connect();
        boolean ditemukan = false;
        String a = "SELECT * FROM Akun_Admin;";
        System.out.println(a);
        System.out.println("keteranga pass user: "+username+"-"+password);
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(a);
            while (rs.next()) {                
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    ditemukan = true;
                    System.out.println("found");
                }else{
                    System.out.println("NotFound");
                }
            }
            
        } catch (Exception e) {
            System.out.println("not found");
        }
        return ditemukan;
    }
    public void loadDonatur(){
        connect();
        String x = "SELECT * FROM Akun_Donatur";
        System.out.println(x);
        try {
            rs = stmt.executeQuery(x);
            while (rs.next()){
                donatur.add(new Model_Donatur(rs.getString("nama"), 
                        rs.getString("email"), rs.getString("username"), 
                        rs.getString("alamat"), rs.getString("password"), 
                        rs.getString("gender"), rs.getString("nohp"), 
                        rs.getString("tempat"), rs.getString("date")));
            }
            System.out.println("ayadidieu");
        } catch (SQLException e) {
            System.out.println("euweuh");
        }
    }
    public ArrayList<Model_Donatur> getDonatur(){
        return donatur;
    }
    public void getdonaturnull() {
        donatur.clear();
    }
    public void loadPenggalangdana(){
        connect();
        String b = "SELECT * FROM Akun_PenggalangDana";
        System.out.println(b);
        try {
            rs = stmt.executeQuery(b);
            while (rs.next()){
                penggalangdana.add(new Model_Penggalangdana(rs.getString("nama"), 
                        rs.getString("email"), rs.getString("username"), 
                        rs.getString("alamat"), rs.getString("password"), 
                        rs.getString("gender"), rs.getString("nohp"), 
                        rs.getString("tempat"), rs.getString("date")));
            
            }
            System.out.println("sup");
        } catch (SQLException e) {
            System.out.println("euweuh");
        }
    }
    public void loaddatadonasi(){
        connect();
        String b = "SELECT * FROM Data_donasi_donatur";
        System.out.println(b);
        try {
            rs = stmt.executeQuery(b);
            while (rs.next()){
                donasi.add(new Model_Donasi(rs.getString("judul_event"), 
                        rs.getString("username"), rs.getString("namadonatur"), 
                        rs.getInt("uangdonasi")));
            }
            System.out.println("sup");
        } catch (SQLException e) {
            System.out.println("euweuh");
        }
    }
    public ArrayList<Model_Donasi> getdonasi() {
        return donasi;
    }
    public void getdonasinull() {
        donasi.clear();
    }
    public ArrayList<Model_Penggalangdana> getPenggalangdana() {
        return penggalangdana;
    }public void getpenggalangdanaNULL() {
        penggalangdana.clear();
    }
    public void loadEventdanPenerima(){
        connect();
        String c = "SELECT DISTINCT * FROM Event_GalangDana";
        System.out.println(c);
        try {
            rs = stmt.executeQuery(c);
            while (rs.next()){
                EventGalangDana.add(new Model_EventGalangdana(rs.getString("nama"), 
                        rs.getString("kategori"),rs.getString("judul_event"),rs.getInt("target_donasi"),
                        rs.getString("username"), rs.getString("tanggalLahir"), rs.getString("notlp"),
                        rs.getString("lokasi"), rs.getString("tanggalMulai"),
                        rs.getString("tanggalBerakhir"), rs.getString("id_perusahaan"), rs.getString("Status")));
            
            }
            System.out.println("sup");
        } catch (SQLException e) {
            System.out.println("euweuh");
        }
    }
    public ArrayList<Model_EventGalangdana> getEventgalangdanadanpenerima() {
        return EventGalangDana;
    }
    public void getEventgalangdanadanpenerimaNULL() {
        EventGalangDana.clear();
    }
    public void tampilkanEvent(String noHP){
        connect();
        String query = "UPDATE Event_GalangDana set Status = 'Sudah_ACC' where notlp = '"+noHP+"';";
        loadEventdanPenerima();
        try {
            System.out.println(query);
            stmt = conn.createStatement();
            stmt.execute(query);
            System.out.println("berubah mang");
        } catch (SQLException e) {
            System.out.println("teu aya");;
        }
        
    }
    public void addPenggalangdana(Model_Penggalangdana b){
        connect();
        String x= "INSERT INTO Akun_Penggalangdana values ('"
              + b.getNama()+ "','"
              + b.getEmail()+ "','"
              + b.getUsername()+ "','"
              + b.getAlamat()+ "','"
              + b.getPassword()+ "','"
              + b.getGender()+ "','"
              + b.getNohp()+ "','"
              + b.getTempat()+ "','"
              + b.getDate()+ "')";
        try {
             
              System.out.println(x);
               stmt.execute(x);
               
          } catch (Exception e) {
          }
    }
    public void updatedonasi(Model_Donasi b){
        connect();
        try {
            String query = "UPDATE Data_donasi_donatur SET namadonatur='"+b.getNamadonatur()
                +"',uangdonasi = '"+b.getNominal()+"' where judul_event = '"+b.getJudul()+"'";
            System.out.println(query);
        stmt = conn.createStatement();
        stmt.execute(query);
            System.out.println("keupdate");
        } catch (Exception e) {
            System.out.println("gakeupdate");
        }
        
    }
    public void updatePenggalang(Model_EventGalangdana b){
        connect();
        try {
            String query = "UPDATE Event_GalangDana SET nama='"+b.getNama()
                +"',tanggalLahir = '"+b.getTglLahir()+"',notlp = '"+b.getNotlp()
                +"',lokasi ='"+b.getLokasi()+"',tanggalMulai='"+b.getDateMulai()
                +"',tanggalBerakhir = '"+b.getDateAkhir()+"',judul_event ='"+b.getJudul()+"' where nama = '"+b.getNama()+"'";
            System.out.println(query);
        stmt = conn.createStatement();
        stmt.execute(query);
            System.out.println("keupdate");
        } catch (Exception e) {
            System.out.println("gakeupdate");
        }
        
    }
    public void updateakunPenggalangdana(Model_Penggalangdana b){
        connect();
        try {
            String query = "UPDATE Akun_Penggalangdana SET nama='"+b.getNama()
                +"',date = '"+b.getDate()+"',nohp = '"+b.getNohp()
                +"',tempat ='"+b.getTempat()+"',gender='"+b.getGender()
                +"',password = '"+b.getPassword()+"',alamat='"
                +b.getAlamat()+"' where username = '"+b.getUsername()+"'";
            System.out.println(query);
        stmt = conn.createStatement();
        stmt.execute(query);
            System.out.println("keupdate");
        } catch (Exception e) {
            System.out.println("gakeupdate");
        }
        
    }
    public void updateEventPenggalang(Model_EventGalangdana b){
        connect();
        try {
            String query = "UPDATE Event_GalangDana SET nama='"+b.getNama()
                +"',tanggalLahir = '"+b.getTglLahir()+"',notlp = '"+b.getNotlp()
                +"',lokasi ='"+b.getLokasi()+"',tanggalMulai='"+b.getDateMulai()
                +"',tanggalBerakhir = '"+b.getDateAkhir()+"',id_perusahaan='"
                +b.getIdPerusahaan()+"',judul_event ='"+b.getJudul()+"',kategori ='"+b.getKategori()+"',target_donasi ='"+b.getTarget()+"' where nama = '"+b.getNama()+"'";
            System.out.println(query);
        stmt = conn.createStatement();
        stmt.execute(query);
            System.out.println("keupdate");
        } catch (Exception e) {
            System.out.println("gakeupdate");
        }
        
    }
    public void updateAkunDonatur(Model_Donatur b){
        connect();
        try {
            String query = "UPDATE Akun_Donatur SET nama='"+b.getNama()
                +"',date = '"+b.getDate()+"',nohp = '"+b.getNohp()
                +"',tempat ='"+b.getTempat()+"',gender='"+b.getGender()
                +"',password ='"+b.getPassword()+"',alamat='"
                +b.getAlamat()+"' where username = '"+b.getUsername()+"'";
            System.out.println(query);
        stmt = conn.createStatement();
        stmt.execute(query);
            System.out.println("keupdate");
        } catch (Exception e) {
            System.out.println("gakeupdate");
        }
        
    }
    public void deleteevent(Model_EventGalangdana p) {
        connect();
        String query = "DELETE FROM Event_GalangDana WHERE judul_event = '"+p.getJudul()+"'"
                    +"and nama ='"+p.getNama()+"'";
        try{
            stmt = conn.createStatement();
            
            System.out.println(query);
            stmt.execute(query);
            System.out.println("Terdelete");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("gakedelete");
        }
    }
    public void addDonatur(Model_Donatur b){
        connect();
        String x= "INSERT INTO Akun_Donatur values ('"
              + b.getNama()+ "','"
              + b.getEmail()+ "','"
              + b.getUsername()+ "','"
              + b.getAlamat()+ "','"
              + b.getPassword()+ "','"
              + b.getGender()+ "','"
              + b.getNohp()+ "','"
              + b.getTempat()+ "','"
              + b.getDate()+ "')";
        try {
             
              System.out.println(x);
               stmt.execute(x);
               
          } catch (Exception e) {
          }
    }
    public void addEventPenggalangandana(Model_EventGalangdana a){
        connect();
        String x= "INSERT INTO Event_GalangDana values ('"
                + a.getKategori()+"','"
                + a.getJudul()+"','"
                + a.getTarget()+"','"
                + a.getNama()+"','"
                + a.getTglLahir()+"','"
                + a.getNotlp()+"','"
                + a.getLokasi()+"','"
                + a.getDateMulai()+"','"
                + a.getDateAkhir()+"','"
                + a.getIdPerusahaan()+"','"
                + a.getUsernamepembuat()+"','"
                +"Belum_Acc')";
        try {
            System.out.println(x);
               stmt.execute(x);
        } catch (Exception e) {
            System.out.println("teuasup mang");
        }
    }
    public void addDataDonasi(String Judul, String Username,String Donatur,int uang){
        connect();
        String x= "INSERT INTO Data_donasi_donatur values ('"
                +Judul+"','"+Username+"','"+Donatur+"','"+uang+"')";
        try {
            System.out.println(x);
            stmt.execute(x);
            System.out.println("nambah bos ku");
        } catch (SQLException e) {
            System.out.println("cobalagi mamang gagal");
        }
    }
}
