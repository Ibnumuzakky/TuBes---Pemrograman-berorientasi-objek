/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import Model.Model_Penggalangdana;
import java.util.List;
/**
 *
 * @author telcay
 */
public class Model_EventGalangdana extends Model_Penggalangdana{
    private Model_Penerima penerima;
    private ArrayList<Model_Donasi> donasi;
    private Date TglMulai,TglSelesai;
    private Double targetDana;
    private String kategori;
    private String judul;
    private int target;
    private String nama;
    private Date dateLahir;
    private String tglLahir;
    private String notlp;
    private String lokasi;
    private String dateMulai;
    private String dateAkhir;
    private String idPerusahaan;
    private String usernamepembuat; 
    private String Status,user;
    private Model_Penggalangdana PD;


    
    public Model_EventGalangdana(Model_Penerima penerima, ArrayList<Model_Donasi> donasi, Date TglMulai, Date TglSelesai, Double targetDana) {
   
        this.penerima = penerima;
        this.donasi = donasi;
        this.TglMulai = TglMulai;
        this.TglSelesai = TglSelesai;
        this.targetDana = targetDana;
    }

    public Model_EventGalangdana(String penerima, String kategori, String judul, int target, String pembuat, String tglLahir, String notlp, String lokasi, String dateMulai, String dateAkhir,String IDPERUSAHAAN,String status) {
        this.nama = penerima;
        this.kategori = kategori;
        this.judul = judul;
        this.target = target;
        this.tglLahir = tglLahir;
        this.notlp = notlp;
        this.lokasi = lokasi;
        this.dateMulai = dateMulai;
        this.dateAkhir = dateAkhir;
        this.idPerusahaan = IDPERUSAHAAN;
        this.usernamepembuat = pembuat;
        this.Status = status;
    }

    public Model_Penerima getPenerima() {
        return penerima;
    }

    public ArrayList<Model_Donasi> getDonasi() {
        return donasi;
    }

    public Date getTglMulai() {
        return TglMulai;
    }

    public Date getTglSelesai() {
        return TglSelesai;
    }

    public Double getTargetDana() {
        return targetDana;
    }

    public String getKategori() {
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public int getTarget() {
        return target;
    }

    public String getNama() {
        return nama;
    }

    public Date getDateLahir() {
        return dateLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getNotlp() {
        return notlp;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getDateMulai() {
        return dateMulai;
    }

    public String getDateAkhir() {
        return dateAkhir;
    }

    public String getIdPerusahaan() {
        return idPerusahaan;
    }

    public String getUsernamepembuat() {
        return usernamepembuat;
    }

    public String getStatus() {
        return Status;
    }

    public Model_Penggalangdana getPD() {
        return PD;
    }

    public void setPenerima(Model_Penerima penerima) {
        this.penerima = penerima;
    }

    public void setDonasi(ArrayList<Model_Donasi> donasi) {
        this.donasi = donasi;
    }

    public void setTglMulai(Date TglMulai) {
        this.TglMulai = TglMulai;
    }

    public void setTglSelesai(Date TglSelesai) {
        this.TglSelesai = TglSelesai;
    }

    public void setTargetDana(Double targetDana) {
        this.targetDana = targetDana;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDateLahir(Date dateLahir) {
        this.dateLahir = dateLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setDateMulai(String dateMulai) {
        this.dateMulai = dateMulai;
    }

    public void setDateAkhir(String dateAkhir) {
        this.dateAkhir = dateAkhir;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public void setUsernamepembuat(String usernamepembuat) {
        this.usernamepembuat = usernamepembuat;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setPD(Model_Penggalangdana PD) {
        this.PD = PD;
    }
    
    public String[] printUserDonaturbynama() {
        String[] data = new String[PD.getIndeks()];
        System.out.println(PD.getIndeks());
        int i =0;
        for( Model_EventGalangdana a: super.penggalangdana){
            data[i] = a.getJudul(this);
            i++;
        }
        return data;
    }
    
    
    public void createDonasi(Model_Donasi a){
        donasi.add(a);
//        donasi.get(0).getDonatur().nama;
//        donasi.
    }
    public void createPenerimaPersonal(Model_Penerima pe){
       
    }
    public  void createPenerimaLembaga(Model_Lembaga pe){
        this.penerima = pe;
    }
    public String PrintData(Model_EventGalangdana p) {
        return  "Nama: " + p.getNama()
                + "\nEmail: " + p.getNama()
                + "\nUsername: " + p.getUsernamepembuat()
                + "\nAlamat: " + p.getLokasi()
               + "\nNo HP: " + p.getNotlp()
                +"\nTanggal lahir 2 : "+p.getStatus();
                
    }
    
}
