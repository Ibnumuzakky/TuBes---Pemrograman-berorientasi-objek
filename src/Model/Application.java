/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telcay
 */
public class Application {

    private ArrayList<Model_Penggalangdana> Penggalangdana; //daftardonatur
    private ArrayList<Model_Donatur> Donatur; //daftaradmin
    private Database db = new Database();
    private List<Model_EventGalangdana> listevent;
    private List<Model_EventGalangdana> listeventACC;
    public Application() {
         db.connect();
         listevent=new ArrayList();
        Penggalangdana = new ArrayList<>();
        Donatur = new ArrayList<>();
    }
    public void loadevent(){
        listevent = db.getEventgalangdanadanpenerima();
    }
    public void loadeventacc(){
        listeventACC = db.getEventgalangdanadanpenerima();
    }
    public void daftarDonatur(Model_Donatur a) {
        Donatur.add(a);
        
    }

    public void daftarPenggalangdana(Model_Penggalangdana a) {
        Penggalangdana.add(a);
        //db.addPenggalangdana(a);
    }
    public boolean loginUser(String username, String password) {
        System.out.println(username+password);
        return db.LoginDonatur(username, password);
    }
    public boolean loginPenggalangdana(String username, String password) {
        System.out.println(username+password);
        return db.LoginPenggalangdana(username, password);
    }
    public boolean loginAdmin(String username, String password) {
        System.out.println(username+password);
        return db.LoginAdmin(username, password);
    }
    //public void daftarUser()
    public ArrayList<Model_Donatur> getDonatur() {
        return Donatur;
    }

    public ArrayList<Model_Penggalangdana> getPenggalangdana() {
        return Penggalangdana;
    }

    public Model_Donatur getDonatur(int index) {
        return Donatur.get(index);
    }

    public Model_Penggalangdana getPenggalangdana(int index) {
        return Penggalangdana.get(index);
    }

    public String[] printUserDonaturbynama() {
        String[] data = new String[Donatur.size()];
        int i =0;
        for(Model_Donatur a : Donatur){
            data[i] = a.nama;
            i++;
        }
        return data;
    }
    
    public String[] printUserPenggalangdanabyNama() {
        String[] data = new String[Penggalangdana.size()];
        int i =0;
        for(Model_Penggalangdana a : Penggalangdana){
            data[i] = a.getNama();
            i++;
        }
        return data;
    }
    public String[] geteventBLMACC(){
        loadevent();
        db.loadEventdanPenerima();
        String[] daftarListEvent = new String[listevent.size()];
        for (int i = 0; i < listevent.size(); i++) {
            if ("Belum_Acc".equals(listevent.get(i).getStatus())) {
                daftarListEvent[i]=listevent.get(i).getJudul();
            }
        }
        return daftarListEvent;
    }
    public String[] getEventTelahAcc(){
        loadeventacc();
        db.getEventgalangdanadanpenerimaNULL();
        db.loadEventdanPenerima();
        int newsize= 0;
        String[] daftarListEventACC = new String[listeventACC.size()];
        for (int i = 0; i < listeventACC.size(); i++) {
            if ("Sudah_ACC".equals(listeventACC.get(i).getStatus())) {
                daftarListEventACC[i]=listeventACC.get(i).getJudul();
                newsize++;
            }
        }
        return daftarListEventACC;
    }
    
}
