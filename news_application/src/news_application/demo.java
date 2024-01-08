package news_application;
import javax.swing.*;
import java.awt.*;

public class demo extends JFrame{

    demo(){
        
                setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
        setTitle("Demoo");
        setLayout(null);
          getContentPane().setBackground(Color.WHITE);
          
         
        
//           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        add(image);
                }
                public static void main(String args[]) {
       new demo();
    }
}
