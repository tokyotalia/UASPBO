/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Mena
 */
public class MainMenu extends JFrame implements ActionListener {
    
    private JFrame MainMenuScreen;
    private JButton login, register, lihatdata;
    
    public MainMenu() {
        MainMenuScreen = new JFrame("Main Menu");
        MainMenuScreen.setSize(400, 250);
        MainMenuScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainMenuScreen.setLocationRelativeTo(null);
        
        login = new JButton("Login");
        login.setBounds(45,45,300,30);
        login.addActionListener(this);
        
        register = new JButton("Register");
        register.setBounds(45,90,300,30);
        register.addActionListener(this);
        
        lihatdata = new JButton("Lihat Data Pengguna");
        lihatdata.setBounds(45,135,300,30);
        lihatdata.addActionListener(this);
        
        MainMenuScreen.add(login);
        MainMenuScreen.add(register);
        MainMenuScreen.add(lihatdata);
        
        MainMenuScreen.setLayout(null);
        MainMenuScreen.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch(command){
            case "Login":
                new MenuLogin();
                MainMenuScreen.setVisible(false);
                break;
            case "Register":
                new MenuRegistrasi();
                MainMenuScreen.setVisible(false);
                break;
            case "Lihat Data Pengguna":
                new LihatData();
                MainMenuScreen.setVisible(false);
                break;
        }
        
    }
    
}
