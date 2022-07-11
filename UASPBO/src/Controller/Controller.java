/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CategoryUser;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Mena
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhoto(rs.getString("photo"));
                user.setIdCategory(rs.getInt("idcategory"));
                user.setPassword("password");
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }
    
    public static ArrayList<CategoryUser> getCategory() {
        ArrayList<CategoryUser> category = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM category";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CategoryUser c = new CategoryUser();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                category.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (category);
    }
}
