
package news_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login, clear,signup;
    JTextField tfusername, tfpassword;
    
    Login () {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(180, 140, 120, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        clear.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(clear);
        
        signup = new JButton("Signup");
       signup.setBounds(110, 180, 120, 30);
       signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        signup.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(signup);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
        setTitle("Login Page");
    }
    
   public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from signup where username='"+username+"' and password='"+password+"'";
         //   String query2  = "select * from signup where username ='"+username+"' and password='"+password+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                 //ResultSet rs1 = c.s.executeQuery(query2);
                if (rs.next()) {
                    setVisible(false);
                    new niteshhome();//calling home page
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                   // setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == clear) {
             tfusername.setText("");
             tfpassword.setText("");
//setVisible(false);//cancel for this
        }
        else if (ae.getSource() == signup){
            setVisible(false);
    new Signup();

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}