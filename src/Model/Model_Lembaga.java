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
public class Model_Lembaga extends Model_Penerima{
    private String nama;
    private Date tgllahir;
    private String alamat;
    private String nohp;
    private String Tempat;
    private Date tglsebelum;
    private Date tglsesudah;
    private String idPerusahaan;
    private ArrayList<Model_Lembaga> ListLembaga;

    public Model_Lembaga(String nama, Date tgllahir, String alamat, String nohp, String Tempat, Date tglsebelum, Date tglsesudah, String idPerusahaan, ArrayList<Model_Lembaga> ListLembaga) {
        this.nama = nama;
        this.tgllahir = tgllahir;
        this.alamat = alamat;
        this.nohp = nohp;
        this.Tempat = Tempat;
        this.tglsebelum = tglsebelum;
        this.tglsesudah = tglsesudah;
        this.idPerusahaan = idPerusahaan;
        this.ListLembaga = ListLembaga;
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

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public ArrayList<Model_Lembaga> getListLembaga() {
        return ListLembaga;
    }

    
    @Override
    public void Penerima() {
        ListLembaga.add(this);
    }
}
