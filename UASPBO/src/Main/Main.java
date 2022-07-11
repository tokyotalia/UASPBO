/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.Controller;
import Model.User;
import View.MainMenu;
import java.util.ArrayList;

/**
 *
 * @author Mena
 */
public class Main {
    
    public Main() {
        Controller controller =  new Controller();
        ArrayList<User> user = controller.getAllUsers();
        
        new MainMenu();
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
