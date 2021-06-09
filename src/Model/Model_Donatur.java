/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author telcay
 */
public class Model_Donatur {
    public String nama;
    public String email;
    public String username;
    public String alamat;
    public String password;
    public String gender;
    public String nohp;
    public String Tgl;
    public String Bulan;
    public String Tahun;
    public String Tempat;
    public String Date;

    public Model_Donatur(String nama, String email, String username, String alamat, String password, String gender, String nohp,String Tempat,String date) {
        this.nama = nama;
        this.email = email;
        this.username = username;
        this.alamat = alamat;
        this.password = password;
        this.gender = gender;
        this.nohp = nohp;
        this.Tempat = Tempat;
        this.Date = date;
    }

    public Model_Donatur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getNama() {
        return nama;
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
