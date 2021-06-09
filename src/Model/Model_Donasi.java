/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author telcay
 */
public class Model_Donasi {
    private Model_Donatur donatur;
    private int nominal;
    private String judul; 
    private String Username;
    private String namadonatur; 

    public Model_Donasi(String judul, String Username,String namadonatur, int nominal) {
        this.judul = judul;
        this.nominal = nominal;
        this.Username = Username;
        this.namadonatur = namadonatur;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getNamadonatur() {
        return namadonatur;
    }

    public void setNamadonatur(String namadonatur) {
        this.namadonatur = namadonatur;
    }
    
    public void addDonatur(Model_Donatur donatur){
        this.donatur = donatur;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    
    public Model_Donatur getDonatur() {
        return donatur;
    }

    public double getNominal() {
        return nominal;
    }
   
}
