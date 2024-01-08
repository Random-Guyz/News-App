package news_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.ResultSet;


public class Signup extends JFrame implements ActionListener{
    
    JTextField tfemail, tffullname,tfusername,tfpassword;
    JButton signup,clear,login;
    Signup()
    {
        
         setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
        setTitle("Signup");
        setLayout(null);
          getContentPane().setBackground(Color.WHITE);
    
    
        
         JLabel lblemail = new JLabel("Email Or Phone");
        lblemail.setBounds(10, 10,150,35);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(100, 15, 150, 25);
        add(tfemail);
        
            JLabel lblfullname = new JLabel("Fullname");
        lblfullname.setBounds(10, 55,150,35);
        add(lblfullname);
        
        tffullname = new JTextField();
        tffullname.setBounds(100, 55, 150, 25);
        add(tffullname);
        
             JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(10, 95,150,35);
        add(lblusername);
        
       tfusername = new JTextField();
        tfusername.setBounds(100, 95, 150, 25);
        add(tfusername);
        
             JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(10, 135,150,35);
        add(lblpassword);
        
       tfpassword = new JPasswordField();
        tfpassword.setBounds(100, 135, 150, 20);
        add(tfpassword);
        
        signup = new JButton("Signup");
        signup.setBounds(20, 180, 120, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        signup.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(signup);
        

        
         clear = new JButton("Clear");
        clear.setBounds(150, 180, 120, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        clear.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(clear);
        
                  login = new JButton("Login");
        login.setBounds(80, 220, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
       login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
    }   
        public void actionPerformed(ActionEvent ae) {

        //  String formno = first;
          String email = tfemail.getText();
          String fullname = tffullname.getText();
     String username = tfusername.getText();
     String password = tfpassword.getText();
        if(ae.getSource() == signup)  
        {
          try{

              if(email.equals("")|| fullname.equals("") ||username.equals("") || password.equals("") ){
                  JOptionPane.showMessageDialog(null, "Fill all the required fields");
              }else{
                  Conn c = new Conn();
                  String query = "insert into signup values('"+email+"','"+fullname+"','"+username+"','"+password+"')";
                  c.s.executeUpdate(query); 
                  setVisible(false);
                  new Login();
              }

          }
          catch(Exception e){
               e.printStackTrace();
          }

      }
           else if (ae.getSource() == clear) {
                tfemail.setText("");
               tffullname.setText("");
                tfusername.setText("");
               tfpassword.setText("");

  //setVisible(false);//cancel for this
          }
          else if (ae.getSource() == login){
             setVisible(false);
             new  Login();

          }
      }

            public static void main(String args[])
            {
                new Signup();
            }
    
}