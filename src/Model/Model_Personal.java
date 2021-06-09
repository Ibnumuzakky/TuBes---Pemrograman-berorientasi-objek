/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author telcay
 */
public class Model_Personal extends Model_Penerima{
    private String nama;
    private Date tgllahir;
    private String alamat;
    private String nohp;
    private String Tempat;
    private Date tglsebelum;
    private Date tglsesudah;
    private ArrayList<Model_Personal> ListPersonal;

    public Model_Personal(String nama, String email, String username, String alamat, String password, String gender, String nohp, String TBT, String Tempat) {
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
        this.Tempat = Tempat;
    }

    public String getNama() {
        return nama;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public String getTempat() {
        return Tempat;
    }

    public Date getTglsebelum() {
        return tglsebelum;
    }

    public Date getTglsesudah() {
        return tglsesudah;
    }

    public ArrayList<Model_Personal> getListPersonal() {
        return ListPersonal;
    }
    

    
    @Override
    public void Penerima() {
        ListPersonal.add(this);
    }
    
}
