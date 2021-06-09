/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Application;
import View.GUI_Login;
import View.GUI_Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rivannurihsan
 */
public class Controller_Login implements ActionListener{
    GUI_Login view;
    Application model;
    Controller_Register CR;
    Controller_Donatur CD;
    Controller_PenggalangDana CPD;
    Controller_Admin CA;
    
    public Controller_Login(Application model){
        this.model = model;
        view = new GUI_Login();
        view.setVisible(true);
        view.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getLoginBtn())){
            System.out.println(view.getUsername()+"-"+view.getPassword());
            if (model.loginUser(view.getUsername(), view.getPassword())) {
                view.dispose();
                CD = new Controller_Donatur(model,view.getUsername());
                //CD.actionPerformed(e);
            }else{
                System.out.println(model.loginUser(view.getUsername(), view.getPassword()));
                view.showMessage("USer Tidak Ditemukan", "Error", 0);
            }
            //ngecek view.getusername sama password
            //dicek ada gak didatabase, kalo ada lanjut view selanjutnya
        }
        if(source.equals(view.getBtnLoginPenggalangdana())){
            System.out.println(view.getUsername()+"-"+view.getPassword());
            if (model.loginPenggalangdana(view.getUsername(), view.getPassword())) {
                view.dispose();
                CPD = new Controller_PenggalangDana(model,view.getUsername());
                CPD.actionPerformed(e);
            }else{
                System.out.println(model.loginUser(view.getUsername(), view.getPassword()));
                view.showMessage("USer Tidak Ditemukan", "Error", 0);
            }
            //ngecek view.getusername sama password
            //dicek ada gak didatabase, kalo ada lanjut view selanjutnya
        }
        if(source.equals(view.getAdminBtn())){
            System.out.println(view.getUsername()+"-"+view.getPassword());
            if (model.loginAdmin(view.getUsername(), view.getPassword())) {
                view.dispose();
                CA = new Controller_Admin(model);
                //CD.actionPerformed(e);
            }else{
                System.out.println(model.loginUser(view.getUsername(), view.getPassword()));
                view.showMessage("USer Tidak Ditemukan", "Error", 0);
            }
            //ngecek view.getusername sama password
            //dicek ada gak didatabase, kalo ada lanjut view selanjutnya
        }
        if(source.equals(view.getregisterBtn())){
            view.dispose();
            CR = new Controller_Register(model);
            CR.actionPerformed(e);
        }
        if(source.equals(view.getAdminBtn())){
            System.out.println("Button admin diklik");
        }
    }
}
