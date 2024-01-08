package news_application;
import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame {
    
    AboutUs()
    {
    			//Declaring Frame
            JFrame f = new JFrame("Heading Example");
            
			//Declaring panel
            JPanel headingPanel = new JPanel();
			JPanel headingPanel2 = new JPanel();
			
			//Declaring label with data
			JLabel l1=new JLabel("About RG News Digital");
			JLabel l2=new JLabel("Find out about RGNews.com, MSRG.com, TODAY.com, Nightly News, Meet the Press, Dateline, and other RG News Digital sites.");
			JLabel l3=new JLabel("RG News Digital is a collection of innovative and powerful news brands that deliver compelling, diverse and visually engaging stories on your platform of choice. RG");
			JLabel l4=new JLabel("News Digital features world-class brands including RGNews.com, MSRG.com, TODAY.com, Nightly News, Meet the Press, Dateline, and the existing apps and digital");
			JLabel l5=new JLabel("extensions of these respective properties. We provide something for every news consumer with our comprehensive offerings that deliver the best in breaking news,");
			JLabel l6=new JLabel("segments from your favorite RG News shows, live video coverage, original journalism, lifestyle features, commentary and local updates.");
			
			JLabel l7=new JLabel("CLOSED CAPTIONING");
			JLabel l8=new JLabel("RG News is pleased to offer closed captioning on long-form content and certain other content that it makes available on television and online via websites and apps on ");
			JLabel l9=new JLabel("To report an issue or concern regarding closed captioning on RG News programs viewed on television or online, please contact us at affiliate.operations@RGuni.com ");
			
			JLabel l10=new JLabel("* * * * * * * * * * * *");
			
			JLabel l11=new JLabel("To assist us in resolving the issue, please provide the following information when you contact us for assistance with captions :");
			JLabel l12=new JLabel(" >>   Your name, address, telephone number and email address");
			JLabel l13=new JLabel(" >>   Your preferred method of contact (phone or email)");
			JLabel l14=new JLabel(" >>   The name of the program with the captioning issue");
			JLabel l15=new JLabel(" >>   A brief description of the captioning issue, including the date and time you experienced the problem");
			JLabel l16=new JLabel(" >>   If you are watching on television, please provide the name of your pay TV provider");
			JLabel l17=new JLabel(" >>   If you are watching online, please identify the device and brand (e.g., computer, tablet, smartphone) and software (including version) you are using");
			
			JLabel l18=new JLabel("If you wish to submit a written complaint, please send it to :");
			
			JLabel l19=new JLabel("Margaret TobeyVice President, Regulatory Affairs, RGUniversal300 New Jersey Avenue, NW Suite 700Washington, DC 20001");
			JLabel l20=new JLabel("RG News is part of the RGUniversal News Group, a division of RGUniversal, which is owned by Comcast Corporation.For more information about RGUniversal,");
			JLabel l21=new JLabel("please visit www.RGUniversal.com.");
			
			//panel setBounds
			headingPanel.setBounds(0,0,1540,60);
			headingPanel2.setBounds(0,60,1540,40);
			
			//label setBounds
			l3.setBounds(20,10,1500,300);
			l4.setBounds(20,10,1500,350);
			l5.setBounds(20,10,1500,400);
			l6.setBounds(20,10,1500,450);
			l7.setBounds(20,10,1500,550);
			l8.setBounds(20,10,1500,650);
			l9.setBounds(20,10,1500,700);
			l10.setBounds(20,10,1500,800);
			l11.setBounds(20,10,1500,850);
			l12.setBounds(40,10,1500,900);
			l13.setBounds(40,10,1500,950);
			l14.setBounds(40,10,1500,1000);
			l15.setBounds(40,10,1500,1050);
			l16.setBounds(40,10,1500,1100);
			l17.setBounds(40,10,1500,1150);
			l18.setBounds(20,10,1500,1250);
			l19.setBounds(20,10,1500,1350);
			l20.setBounds(20,10,1500,1400);
			l21.setBounds(20,10,1500,1450);
			
			//panel background color
			headingPanel.setBackground(Color.blue);  
			headingPanel2.setBackground(Color.blue);
            
			//for font size
			l1.setFont(l1.getFont().deriveFont(38.0f));
			l2.setFont(l2.getFont().deriveFont(18.0f));
			l3.setFont(l3.getFont().deriveFont(18.0f));
			l4.setFont(l4.getFont().deriveFont(18.0f));
			l5.setFont(l5.getFont().deriveFont(18.0f));
			l6.setFont(l6.getFont().deriveFont(18.0f));
			l7.setFont(l7.getFont().deriveFont(25.0f));
			l8.setFont(l8.getFont().deriveFont(18.0f));
			l9.setFont(l9.getFont().deriveFont(18.0f));
			l10.setFont(l10.getFont().deriveFont(28.0f));
			l11.setFont(l11.getFont().deriveFont(22.0f));
			l12.setFont(l12.getFont().deriveFont(18.0f));
			l13.setFont(l13.getFont().deriveFont(18.0f));
			l14.setFont(l14.getFont().deriveFont(18.0f));
			l15.setFont(l15.getFont().deriveFont(18.0f));
			l16.setFont(l16.getFont().deriveFont(18.0f));
			l17.setFont(l17.getFont().deriveFont(18.0f));
			l18.setFont(l18.getFont().deriveFont(22.0f));
			l19.setFont(l19.getFont().deriveFont(18.0f));
			l20.setFont(l20.getFont().deriveFont(18.0f));
			l21.setFont(l21.getFont().deriveFont(18.0f));
			
			//label adding into panel
			headingPanel.add(l1);
			headingPanel2.add(l2);
			
			//panle addding into frame
            f.add(headingPanel);
			f.add(headingPanel2);
			
			//label adding into frame
			f.add(l3);
			f.add(l4);
			f.add(l5);
			f.add(l6);
			f.add(l7);
			f.add(l8);
			f.add(l9);
			f.add(l10);
			f.add(l11);
			f.add(l12);
			f.add(l13);
			f.add(l14);
			f.add(l15);
			f.add(l16);
			f.add(l17);
			f.add(l18);
			f.add(l19);
			f.add(l20);
			f.add(l21);
			
			f.setLayout(null);    
            f.setVisible(true);
			f.setSize(1540, 850);
           // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        
       new AboutUs();
       
    }
}
