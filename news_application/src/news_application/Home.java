package news_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    Home() {
        setSize(1540, 850);
        setTitle("Home Page");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
//         JLabel lblemail = new JLabel("Welcom To RG News Home Page");
//        lblemail.setBounds(10, 10,150,35);
//        add(lblemail);
        
        JMenuBar mb = new JMenuBar();
        
        // New Information
        JMenu newInformation = new JMenu("Home");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("Back to Home");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
//        JMenuItem studentInfo = new JMenuItem("New Student Information");
//        studentInfo.setBackground(Color.WHITE);
//        studentInfo.addActionListener(this);
//        newInformation.add(studentInfo);
//     
        
        // Leave
    
        
        // Leave Details
        JMenu leaveDetails = new JMenu("Live News");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Click Here For Live News");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
//        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
//        studentleavedetails.setBackground(Color.WHITE);
//        studentleavedetails.addActionListener(this);
//        leaveDetails.add(studentleavedetails);
        
        // Exams
        JMenu exam = new JMenu("Login");
        exam.setForeground(Color.BLUE);
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Login Here");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
//        JMenuItem entermarks = new JMenuItem("Enter Marks");
//        entermarks.setBackground(Color.WHITE);
//        entermarks.addActionListener(this);
//        exam.add(entermarks);
//        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Signup");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Signup Here");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
//        
//        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
//        updatestudentinfo.setBackground(Color.WHITE);
//        updatestudentinfo.addActionListener(this);
//        updateInfo.add(updatestudentinfo);
        
        // fee
        JMenu fee = new JMenu("Categories");
        fee.setForeground(Color.BLUE);
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Politics");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Sports");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
           JMenuItem feelabel = new JMenuItem("Devotional");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feelabel);
        
        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        // about
        JMenu about = new JMenu("About and Contact");
        about.setForeground(Color.BLUE);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        JMenuItem ac = new JMenuItem("Contact US");
        ac.setBackground(Color.WHITE);
        ac.addActionListener(this);
        about.add(ac);
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        }
       
         else if (msg.equals("Signup Here")) {
          new Signup();
}
        else if (msg.equals("Login Here")) {
            new Login();
        }
        
        else if (msg.equals("Click Here For Live News")) {
            new demo();
        }
        else if (msg.equals("Back to home")) {
            setVisible(false);
            new Home();
        }
         else if (msg.equals("About")) {
              new AboutUs();
         }
        else if (msg.equals("Contact US")) {
              new ContactUs();
         }
        
//     else if (msg.equals("Politics")) {
//            new News();
//        }
    //else if (msg.equals("Faculty Leave")) {
//            new TeacherLeave();
//        } else if (msg.equals("Student Leave")) {
//            new StudentLeave();
//        } else if (msg.equals("Faculty Leave Details")) {
//            new TeacherLeaveDetails();
//        } else if (msg.equals("Student Leave Details")) {
//            new StudentLeaveDetails();
//        } else if (msg.equals("Update Faculty Details")) {
//            new UpdateTeacher();
//        } else if (msg.equals("Update Student Details")) {
//            new UpdateStudent();
//        } else if (msg.equals("Enter Marks")) {
//            new EnterMarks();
//        } else if (msg.equals("Examination Results")) {
//            new ExaminationDetails();
//        } else if (msg.equals("Fee Structure")) {
//            new FeeStructure();
//        } else if (msg.equals("About")) {
//            new About();
//        } else if (msg.equals("Student Fee Form")) {
//            new StudentFeeForm();
//        }
  
    }
    public static void main(String[] args) {
        new Home();
    }
}