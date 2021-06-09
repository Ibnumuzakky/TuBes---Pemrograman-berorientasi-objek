/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author telcay
 */
public class Model_Penggalangdana {
    private String nama;
    private String email;
    private String username;
    private String alamat;
    private String password;
    private String gender;
    private String nohp;
    private String Tgl;
    private String Bulan;
    private String Tahun;
    private String Tempat;
    private String Date;
   ArrayList<Model_EventGalangdana> penggalangdana;

    public Model_Penggalangdana(String nama, String email, String username, String alamat, String password, String gender, String nohp, String TBT, String Tempat) {
        this.nama = nama;
        this.email = email;
        this.username = username;
        this.alamat = alamat;
        this.password = password;
        this.gender = gender;
        this.nohp = nohp;
        this.Tempat = Tempat;
        this.Date = TBT;
    }
    public Model_Penggalangdana() { 
        penggalangdana = new ArrayList<>();
        
    }   
    public Model_Penggalangdana(String username, String password) {
        
        this.username = username;
        this.password = password;
    }
    public int getIndeks(){
        return penggalangdana.size();
    }
    public String getJudul(Model_EventGalangdana galangdana){
        return galangdana.getJudul(galangdana);
    }
    public void createEvent(Model_EventGalangdana galangdana){
        penggalangdana.add(galangdana);
    }
    public String getNama() {
        return nama;
    }

    public ArrayList<Model_EventGalangdana> getPenggalangdana() {
        return penggalangdana;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getNohp() {
        return nohp;
    }

    public String getTgl() {
        return Tgl;
    }

    public String getBulan() {
        return Bulan;
    }

    public String getTahun() {
        return Tahun;
    }

    public String getTempat() {
        return Tempat;
    }
    public String getDate() {
        return Date;
    }
    public String PrintData() {
        return  "Nama: " + getNama()
                + "\nEmail: " + getEmail()
                + "\nUsername: " + getUsername()
                + "\nAlamat: " + getAlamat()
                + "\nPassword: " + getPassword()
               + "\nGender: " + getGender()
               + "\nNo HP: " + getNohp()
               +"\nTanggal lahir 2 : "+getDate();
                
    }
}
