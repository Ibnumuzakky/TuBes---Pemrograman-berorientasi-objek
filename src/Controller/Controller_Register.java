/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import Model.Model_Donatur;
import Model.Model_Penggalangdana;
import View.GUI_Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import Model.Database;
import java.text.SimpleDateFormat;


/**
 *
 * @author telcay
 */
public class Controller_Register extends MouseAdapter implements ActionListener {
    
    GUI_Register view;
    Application model;
    Controller_Login CL;
    private Database db;
    
    public Controller_Register(Application model) {
        this.model = model;
        view = new GUI_Register();
        db = new Database();
        view.setVisible(true);
        view.addActionListener(this);
        view.addmouseadapter(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnRegisterDonatur())) {
            String nama = view.getNama();
            String email = view.getEmail();
            String username = view.getUsername();
            String alamat = view.getAlamat();
            String password = view.getPass();
            String gender = view.getGender();
            String nohp = view.getNo_HP();
            String tempat = view.getTempatLahir();
            SimpleDateFormat formatbaru = new SimpleDateFormat("yyyy-MM-dd");
            Date date = view.getjDateLahir();
            String tglbaru = formatbaru.format(date);
            Model_Donatur a = new Model_Donatur( nama,  email,  username,  alamat,  password,  gender,  nohp, tempat,tglbaru);
            model.daftarDonatur(a);
            db.addDonatur(a);
            view.resetView();
            view.setListNama(model.printUserDonaturbynama());
            
        }
        if (source.equals(view.getBtnRegisterPenggalangDana())) {
            String nama = view.getNama();
            String email = view.getEmail();
            String username = view.getUsername();
            String alamat = view.getAlamat();
            String password = view.getPass();
            String gender = view.getGender();
            String nohp = view.getNo_HP();
            String tempat = view.getTempatLahir();
            Date Date = view.getjDateLahir();
            SimpleDateFormat formatbaru = new SimpleDateFormat("yyyy-MM-dd");
            Date date = view.getjDateLahir();
            String tglbaru = formatbaru.format(date);
            Model_Penggalangdana a = new Model_Penggalangdana( nama,  email,  username,  alamat,  password,  gender,  nohp,  tglbaru, tempat);
            model.daftarPenggalangdana(a);
            db.addPenggalangdana(a);
            view.resetView();
            view.setListPenggalang(model.printUserPenggalangdanabyNama());
        }
        if (source.equals(view.getBtnBacktologin())) {
            view.dispose();
            CL = new Controller_Login(model);
            CL.actionPerformed(e);
        }
        
    }
    public void mousePressed(MouseEvent me) {
        Object source = me.getSource();
        
        if (source.equals(view.getListuser())) {
            int i = view.getIndex();
            System.out.println("hili");
            view.setText(model.getDonatur(i).PrintData());
        }
        if (source.equals(view.getListPenggalang())) {
            int i = view.getIndexpenggalang();
            view.setTextPenggalang(model.getPenggalangdana(i).PrintData());
        }
        
    }
    
}
