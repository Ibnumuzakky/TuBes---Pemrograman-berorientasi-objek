/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Controller_Login;
import Model.Application;


/**
 *
 * @author telcay
 */
public class Main {
    public static void main(String[] args) {
        Application model = new Application();
        Controller_Login CR = new Controller_Login(model);
    }
}