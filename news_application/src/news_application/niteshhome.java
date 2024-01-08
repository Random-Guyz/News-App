package news_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import javax.swing.JFrame;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;

 public class niteshhome extends JFrame implements ActionListener
 {
     
       niteshhome(){
        setLayout(null);
      setSize(1540, 850);
    //  setLocation(0,0);
       setTitle("Home Page");
        
     // JMenu home,cat,abt,cont;
     //JMenuItem i1,i2,i3;
       JFrame fr = new JFrame("Nova News"); //
        
        //Menu bar
        JMenuBar mb = new JMenuBar();
        mb.setBounds(10000, 10000, 10000, 10000);
        
         JMenu home = new JMenu("Home");
        // home.setForeground(Color.blue);
         home.addActionListener(this);
        mb.add(home);
        
         JMenu cat = new JMenu("Categories");
         // cat.setForeground(Color.red);
          cat.addActionListener(this);
        mb.add(cat);
        
        JMenuItem catt = new JMenuItem("Categories");
         // catt.setForeground(Color.red);
          catt.addActionListener(this);
        cat.add(catt);

         JMenu abt = new JMenu("About us");
         abt.addActionListener(this);
         // abt.setForeground(Color.blue);
        mb.add(abt);
        
        JMenuItem abtt = new JMenuItem("About us");
        abtt.addActionListener(this);
        abt.add(abtt);
        
        JMenu cont = new JMenu("Contact us");
       cont.addActionListener(this);
       //     cont.setForeground(Color.red);
        mb.add(cont);
        
        JMenuItem cot = new JMenuItem("Contact us");
        //cot.setBackground(Color.WHITE);
        cot.addActionListener(this);
        cont.add(cot);
//        
          JMenu log = new JMenu("Logout");
          log.addActionListener(this);
        //   log.setForeground(Color.blue);
        mb.add(log);
        
         JMenuItem examinationdetails = new JMenuItem("Logout Here");
       // examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        log.add(examinationdetails);
        
          JMenu utl = new JMenu("Utility");
          utl.addActionListener(this);
        // utl.setForeground(Color.DARK_GRAY);
        mb.add(utl);
        
        JMenuItem notepad = new JMenuItem("Notepad");
       // notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utl.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
       // calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utl.add(calc);
        
        
        
        JMenu exit = new JMenu("Exit");
        // exit.setForeground(Color.red);
            exit.addActionListener(this);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        //ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        // menu items in categories
//        JMenuItem i1 = new JMenuItem("Sports");
//        JMenuItem i2 = new JMenuItem("Technology");
//        JMenuItem i3 = new JMenuItem("Business");
//        JMenuItem i4 = new JMenuItem("Entertainment");
//        JMenuItem i5 = new JMenuItem("Science");
        
//        cat.add(i1);
//        cat.add(i2);
//        cat.add(i3);
//        cat.add(i4);
//        cat.add(i5);
       
        // Images 
       ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icons/head1.jpg"));
        Image im2 = im1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im3 = new ImageIcon(im2);
        JLabel image = new JLabel(im3);
        image.setBounds(350, 0, 1500, 500);
        add(image);
        
        ImageIcon im4 = new ImageIcon(ClassLoader.getSystemResource("icons/head3.jpg"));
        Image im5 = im4.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im6 = new ImageIcon(im5);
        JLabel image1 = new JLabel(im6);
        image1.setBounds(350, 0, 1500, 1000);
        add(image1);
        
        ImageIcon im7 = new ImageIcon(ClassLoader.getSystemResource("icons/head2.jpg"));
        Image im8 = im7.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im9 = new ImageIcon(im8);
        JLabel image2 = new JLabel(im9);
        image2.setBounds(350, 0, 2000, 500);
        add(image2);
        
        ImageIcon im10 = new ImageIcon(ClassLoader.getSystemResource("icons/head4.jpg"));
        Image im11 = im10.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon im12 = new ImageIcon(im11);
        JLabel image3 = new JLabel(im12);
        image3.setBounds(350, 0, 2000, 1000);
        add(image3);
        
        ImageIcon im13 = new ImageIcon(ClassLoader.getSystemResource("icons/head5.jpg"));
        Image im14 = im13.getImage().getScaledInstance(200, 139, Image.SCALE_DEFAULT);
        ImageIcon im15 = new ImageIcon(im14);
        JLabel image4 = new JLabel(im15);
        image4.setBounds(350, 0, 1750, 1350);
        add(image4);
        
        /*ImageIcon im16 = new ImageIcon(ClassLoader.getSystemResource("icons/sport.jpg"));
        Image im17 = im16.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon im18 = new ImageIcon(im17);
        JLabel image5 = new JLabel(im18);
        image5.setBounds(350, 0, 2600, 2350);
        add(image5);*/
        
         
       getContentPane().setBackground(Color.LIGHT_GRAY );
        
       //content
       JLabel text3 = new JLabel("⚫ HEADLINES");
       JLabel text1 = new JLabel("⚫ COVID-19:  India reports 529 cases; Delhi sees first case of new");
       JLabel text9 = new JLabel("variant.");
       JLabel text2 = new JLabel("⚫ Bengaluru: Starbucks, House of Masaba stores targeted by ");
       JLabel text7 = new JLabel("pro-Kannada protesters.");
       JLabel text4 = new JLabel("⚫ Fight Terrorists But Don't Hurt Countrymen\": Rajnath Singh To Army");
        JLabel text10 = new JLabel(" In J&K.");
        JLabel text5 = new JLabel("⚫ Over 25 hospitalised after Ammonia gas leak from Chennai fertilizer ");
       JLabel text6 = new JLabel("unit; firm issues statement.");  
       JLabel text8 = new JLabel("⚫ 110 Flights, 25 Trains Hit By Dense Fog In Delhi, Visibility Near Zero");  
        
        text3.setBounds(100,80,1800,100);
        text1.setBounds(80, 60, 1200, 400);
        text9.setBounds(80, 60, 1200, 480);
        text2.setBounds(80, 60, 1200, 630);
        text7.setBounds(80,60, 1200, 710);
        text4.setBounds(80,60,1200,860);
        text10.setBounds(80,60,1200,940);
        text5.setBounds(80,60,1200,1100);
        text6.setBounds(80,60,1200,1190);
         text8.setBounds(80,60,1200,1340);
        
        add(text1);
        add(text2);
        add(text3);
       add(text4);
       add(text5);
       add(text6);
       add(text7);
       add(text8);
       add(text9);
       add(text10);
       
       
        setJMenuBar(mb);
        
        //font
        text3.setForeground(Color.BLUE );
        text3.setFont(new Font("Tahoma", Font.BOLD, 75));
        text1.setForeground(Color.BLACK);
        text1.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text2.setForeground(Color.BLACK);
        text2.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text4.setForeground(Color.BLACK);
        text4.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text5.setForeground(Color.BLACK);
        text5.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text6.setForeground(Color.BLACK);
        text6.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text7.setForeground(Color.BLACK);
        text7.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text8.setForeground(Color.BLACK);
        text8.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text9.setForeground(Color.BLACK);
        text9.setFont(new Font("Tahoma", Font.ITALIC , 22));
        text10.setForeground(Color.BLACK);
        text10.setFont(new Font("Tahoma", Font.ITALIC , 22));
        
      
        setVisible(true);
    }
       
       public void actionPerformed(ActionEvent ae)
       {
            String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        }
        else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                
            }
        }
         else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        }
         else if (msg.equals("Logout Here")) {
             setVisible(false);
            new Login();
        }
         else if (msg.equals("Contact us")) {
             new ContactUs(); 
         }
        else if (msg.equals("About us")) {
              new AboutUs();
         }
         else if (msg.equals("Categories")) {
        // Instantiate the Categories class and display it
        SwingUtilities.invokeLater(() -> {
            Categories categories = new Categories();
            categories.setVisible(true);
        });
    }
        
//         else if (msg.equals("Categories")) {
//          new Categories();
//}
//        else if (msg.equals("Login Here")) {
//            new Login();
//        }
//        
//        else if (msg.equals("Click Here For Live News")) {
//            new demo();
//        }
//        else if (msg.equals("Back to home")) {
//            setVisible(false);
//            new Home();
//        }
//         
//       
//     else if (msg.equals("Politics")) {
//            new News();
//        }
      
       }

    public static void main(String[] args) {
        new niteshhome();
    }
}

