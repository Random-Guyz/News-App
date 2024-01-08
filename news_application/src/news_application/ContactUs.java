package news_application;
import javax.swing.*;
import java.awt.*;

public class ContactUs extends JFrame{

    ContactUs()
    {
setVisible(true);
setLayout(null);
 setSize(450,400);
       // setLocation(350, 150);
        setTitle("Contact Us");
        getContentPane().setBackground(Color.WHITE);
        setLocationRelativeTo(null);

         JLabel lblcu = new JLabel("⚫ Contact Us");
        lblcu.setBounds(10, 5,150,35);
         lblcu.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(lblcu);
        
         JLabel lblhd = new JLabel("⚫ Contact an");
        lblhd.setBounds(1, 50,150,35);
         lblhd.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(lblhd);
        
         JLabel lblhdd = new JLabel("editor :");
        lblhdd.setBounds(110, 50,150,35);
         lblhdd.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(lblhdd);
        
          JLabel lblco1 = new JLabel("To send an email");
        lblco1.setBounds(1, 70,150,35);
         lblco1.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
        add(lblco1);
        
         JLabel lblco2 = new JLabel(" to an editor");
        lblco2.setBounds(115, 70,150,35);
         lblco2.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
        add(lblco2);
        
         JLabel lblco3 = new JLabel(" at NBC News Digital,");
        lblco3.setBounds(195, 70,150,35);
         lblco3.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
        add(lblco3);
        
       JLabel lblco4 = new JLabel("please email");
      lblco4.setBounds(335, 70,150,35);
      lblco4.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco4);
     
        JLabel lblco5 = new JLabel("us @ randomguyz@");
      lblco5.setBounds(1, 85,150,35);
      lblco5.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco5);
        
       JLabel lblco6 = new JLabel("gmail.com ");
      lblco6.setBounds(135, 85,150,35);
      lblco6.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco6);
        
     
        JLabel lblhd1 = new JLabel("⚫ Submit feedback");
        lblhd1.setBounds(1, 110,150,35);
         lblhd1.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(lblhd1);
        
         JLabel lblhd2 = new JLabel("or report an error :");
        lblhd2.setBounds(155, 110,150,35);
         lblhd2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(lblhd2);
        
          JLabel lblco7 = new JLabel("To report an error");
      lblco7.setBounds(1, 130,150,35);
      lblco7.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco7);
       
        JLabel lblco8 = new JLabel("or comment on RGN");
      lblco8.setBounds(125, 130,150,35);
      lblco8.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco8);
        
        JLabel lblco9 = new JLabel("ewz please email");
      lblco9.setBounds(260, 130,150,35);
      lblco9.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco9);
     
     JLabel lblco10 = new JLabel("us @ randomguyz@");
      lblco10.setBounds(1, 145,150,35);
      lblco10.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco10);
     
     JLabel textLabel = new JLabel("gmail.com");
    textLabel.setBounds(135, 145,150,35);
    textLabel.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(textLabel);
    
      JLabel txtLabel1 = new JLabel("⚫ Press inquiries :");
    txtLabel1.setBounds(1, 170,150,35);
    txtLabel1.setFont(new Font("Tahoma", Font.BOLD, 15));
     add(txtLabel1);

     
JLabel lblco11 = new JLabel("For press inquiries");
      lblco11.setBounds(1, 190,150,35);
      lblco11.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco11);
        
JLabel lblco12 = new JLabel("only,please call the");
      lblco12.setBounds(120, 190,150,35);
      lblco12.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco12);
             
JLabel lblco13 = new JLabel("24/7 PR hotline");
      lblco13.setBounds(245, 190,150,35);
      lblco13.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco13);
     
     JLabel lblco14 = new JLabel("at 212-413-");
      lblco14.setBounds(345,190,150,35);
      lblco14.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco14);
     
     JLabel lblco15 = new JLabel("6142 or e-mail");
      lblco15.setBounds(1, 205,150,35);
      lblco15.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco15);
     
          JLabel lblco16 = new JLabel("randomguyz@gmai");
      lblco16.setBounds(100,205,150,35);
      lblco16.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
     add(lblco16);
    
        JLabel lblco17 = new JLabel("l.com");
      lblco17.setBounds(227,205,150,35);
      lblco17.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco17);
    
      JLabel txtLabel8 = new JLabel("⚫ Receiving Unw");
    txtLabel8.setBounds(1, 230,150,35);
    txtLabel8.setFont(new Font("Tahoma", Font.BOLD, 15));
     add(txtLabel8);
     
     JLabel txtLabel9 = new JLabel("anted emails :");
    txtLabel9.setBounds(130, 230,150,35);
    txtLabel9.setFont(new Font("Tahoma", Font.BOLD, 15));
     add(txtLabel9);
     
      JLabel lblco18 = new JLabel("If you are");
      lblco18.setBounds(1,250,150,35);
      lblco18.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco18);
     
   JLabel lblco19 = new JLabel("receiving unwanted");
      lblco19.setBounds(70,250,150,35);
      lblco19.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco19);
    
    
    JLabel lblco20 = new JLabel("headlines from");
      lblco20.setBounds(200,250,150,35);
      lblco20.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco20);
    
    JLabel lblco21 = new JLabel("RGNewz your email" );
      lblco21.setBounds(300,250,150,35);
      lblco21.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco21);
    
    JLabel lblco22 = new JLabel("client maybe susbsc");
      lblco22.setBounds(1,265,150,35);
      lblco22.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco22);
    
    JLabel lblco23 = new JLabel("ribed to one of our");
      lblco23.setBounds(130,265,150,35);
      lblco23.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco23);
    
    JLabel lblco24 = new JLabel("RSS.");
      lblco24.setBounds(255,265,150,35);
      lblco24.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco24);
    
    JLabel lblco25 = new JLabel("Please contact us");
      lblco25.setBounds(1,280,150,35);
      lblco25.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco25);
    
    JLabel lblco26 = new JLabel(" @ 6564872354");
      lblco26.setBounds(115,280,150,35);
      lblco26.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco26);
    
   JLabel lblco27 = new JLabel("⚫ Contactno:");
     lblco27.setBounds(1,305,150,35);
     lblco27.setFont(new Font("Tahoma", Font.BOLD, 15));
    add(lblco27); 
    JLabel lblco28 = new JLabel(" 5465465");
     lblco28.setBounds(100,305,150,35);
     lblco28.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco28);
    
     JLabel lblco29 = new JLabel("5465465");
     lblco29.setBounds(160,305,150,35);
     lblco29.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco29);
    
     JLabel lblco30 = new JLabel("⚫ Email: ");
     lblco30.setBounds(1,325,150,35);
       lblco30.setFont(new Font("Tahoma", Font.BOLD, 15));
    add(lblco30); 
    JLabel lblco31 = new JLabel(" randomguyz@");
     lblco31.setBounds(65,325,150,35);
     lblco31.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco31);
    
    JLabel lblco32 = new JLabel("gmail.com");
     lblco32.setBounds(160,325,150,35);
     lblco32.setFont(new Font("Tahoma", Font.ROMAN_BASELINE, 15));
    add(lblco32);
    }
    
    
        
       
    public static void main(String args[])
    {
        new ContactUs();
    }
}
