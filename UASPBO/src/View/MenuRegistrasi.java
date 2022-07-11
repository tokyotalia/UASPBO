/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Mena
 */
public class MenuRegistrasi extends JFrame implements ActionListener {
    
    private JFrame MenuRegistrasiScreen;
    private JLabel emaillabel, namelabel, passwordlabel, photolabel, categorylabel;
    private JTextField email, name;
    private JPasswordField password;
    private JFileChooser photo;
    private JComboBox category;
    private JButton register, back;
    
    public MenuRegistrasi() {
        MenuRegistrasiScreen = new JFrame("Register");
        MenuRegistrasiScreen.setSize(400, 900);
        MenuRegistrasiScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MenuRegistrasiScreen.setLocationRelativeTo(null);
        
        namelabel = new JLabel("Nama :");
        namelabel.setBounds(45, 20, 100, 30);
        
        name = new JTextField();
        name.setBounds(150, 20, 200, 30);
        
        emaillabel = new JLabel("Email :");
        emaillabel.setBounds(45, 60, 100, 30);
        
        email = new JTextField();
        email.setBounds(150, 60, 200, 30);
        
        passwordlabel = new JLabel("Password :");
        passwordlabel.setBounds(45, 100, 100, 30);
        
        password = new JPasswordField();
        password.setBounds(150, 100, 200, 30);
        
        photolabel = new JLabel("Insert Photo :");
        photolabel.setBounds(45, 140, 100, 30);
        
        photo = new JFileChooser("");
        photo.setBounds(30, 170, 350, 380);
        
        categorylabel = new JLabel("Insert Category :");
        categorylabel.setBounds(45, 550, 100, 30);
        
        
        register = new JButton("Register");
        register.setBounds(45,750,300,30);
        register.addActionListener(this);
        
        back = new JButton("Lihat Data Pengguna");
        back.setBounds(45,800,300,30);
        back.addActionListener(this);
        
        MenuRegistrasiScreen.add(namelabel);
        MenuRegistrasiScreen.add(name);
        MenuRegistrasiScreen.add(emaillabel);
        MenuRegistrasiScreen.add(email);
        MenuRegistrasiScreen.add(passwordlabel);
        MenuRegistrasiScreen.add(password);
        MenuRegistrasiScreen.add(photolabel);
        MenuRegistrasiScreen.add(photo);
        MenuRegistrasiScreen.add(categorylabel);
        
        MenuRegistrasiScreen.add(register);
        MenuRegistrasiScreen.add(back);
        
        MenuRegistrasiScreen.setLayout(null);
        MenuRegistrasiScreen.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
