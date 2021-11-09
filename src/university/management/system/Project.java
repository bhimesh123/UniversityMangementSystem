package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.security.Key;

public class Project extends JFrame implements ActionListener

{
    Project() {
            super("University of Texsas Austin");

            setSize(1920, 1030);
//Project main view code
            ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
            Image i3 = ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
            ImageIcon icc3 = new ImageIcon(i3);
            JLabel l1 = new JLabel(icc3);

            add(l1);
            //first page after login


            JMenuBar mb = new JMenuBar();// gives menu bar
            JMenu master = new JMenu("Master");//items in menu bar
            JMenuItem m1 = new JMenuItem("New Faculty");//items1 under master
            JMenuItem m2 = new JMenuItem("New Student Admission");//item2 under master;

            master.setForeground(Color.red);//settimng the master color with red backgriund

            //making item1 font

            m1.setFont(new Font("monospaced", Font.BOLD, 16));//setting font style
            ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.PNG"));

            Image image1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            m1.setIcon(new ImageIcon(image1));
            m1.setMnemonic('A');//kind of macros can operate this item through control button
            m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            m1.setBackground(Color.white);

            m2.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.PNG"));
            Image image2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            m2.setIcon(new ImageIcon(image2));
            m2.setMnemonic('B');
            m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
            m2.setBackground(Color.white);

            m1.addActionListener(this);
            m2.addActionListener(this);

            JMenu user = new JMenu("Details");
            JMenuItem u1 = new JMenuItem("Student details");
            JMenuItem u2 = new JMenuItem("Teacher details");
            user.setForeground(Color.CYAN);

            u1.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.PNG"));
            Image image4 = icon4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            u1.setIcon(new ImageIcon(image4));
            u1.setMnemonic('C');
            u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
            u1.setBackground(Color.white);

            u2.setFont(new Font("monospace", Font.BOLD, 16));
            ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
            Image image5 = icon5.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            u2.setIcon(new ImageIcon(image5));
            u2.setMnemonic('D');
            u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            u2.setBackground(Color.white);

            u1.addActionListener(this);
            u2.addActionListener(this);


            JMenu attendance = new JMenu("Attendance");
            JMenuItem a1 = new JMenuItem("Student Attendance");
            JMenuItem a2 = new JMenuItem("Teacher Attendance");
            attendance.setForeground(Color.YELLOW);

            a1.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
            Image image24 = icon23.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            a1.setIcon(new ImageIcon(image24));
            a1.setMnemonic('M');
            a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
            a1.setBackground(Color.white);
            attendance.add(a1);

            a2.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon24 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.PNG"));
            Image image25 = icon24.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            a2.setIcon(new ImageIcon(image25));
            a2.setMnemonic('N');
            a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            attendance.add(a2);

            a1.addActionListener(this);
            a2.addActionListener(this);

            JMenu attendence_detail = new JMenu("Attendence Detail");
            JMenuItem b1 = new JMenuItem("Student Attendence Detail");
            JMenuItem b2 = new JMenuItem("Teacher Attendece Detail");
            attendence_detail.setForeground(Color.red);

            b1.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.PNG"));
            Image image26 = icon25.getImage().getScaledInstance(25, 24, Image.SCALE_DEFAULT);
            b1.setIcon(new ImageIcon(image26));
            b1.setMnemonic('O');
            b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
            b1.setBackground(Color.WHITE);
            attendence_detail.add(b1);

            b2.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon26 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
            Image image27 = icon26.getImage().getScaledInstance(25, 24, Image.SCALE_DEFAULT);
            b2.setIcon(new ImageIcon(image27));
            b2.setMnemonic('P');
            b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            b2.setBackground(Color.WHITE);
            attendence_detail.add(b2);
            b1.addActionListener(this);
            b1.addActionListener(this);

            JMenu exam = new JMenu("Examination");
            JMenuItem c1 = new JMenuItem("Examination Details");
            JMenuItem c2 = new JMenuItem("Enter marks");
            exam.setForeground(Color.white);

            c1.setFont((new Font("monospaced", Font.BOLD, 16)));
            ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.PNG"));
            Image image30 = icon32.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            c1.setIcon(new ImageIcon(image30));
            c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
            c1.setBackground(Color.white);
            c1.setMnemonic('Q');
            exam.add(c1);

            c2.setFont((new Font("monospaced", Font.BOLD, 16)));
            ImageIcon icon33 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.PNG"));
            Image image31 = icon33.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            c2.setIcon(new ImageIcon(image31));
            c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
            c2.setBackground(Color.white);
            c2.setMnemonic('R');
            exam.add(c2);
            c1.addActionListener(this);
            c2.addActionListener(this);

            JMenu report = new JMenu("Report");
            JMenuItem r1 = new JMenuItem("Update Students");
            JMenuItem r2 = new JMenuItem("Update teachers");
            report.setForeground(Color.red);

            r1.setFont(new Font("monospace", Font.BOLD, 16));
            ImageIcon icon34 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.PNG"));
            Image image32 = icon34.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            r1.setIcon(new ImageIcon(image32));
            r1.setMnemonic('E');
            r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
            r1.setBackground(Color.white);
            r1.addActionListener(this);

            r2.setFont(new Font("monospace", Font.BOLD, 16));
            ImageIcon icon35 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.PNG"));
            Image image33 = icon35.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            r2.setIcon(new ImageIcon(image33));
            r2.setMnemonic('F');
            r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
            r2.setBackground(Color.white);
            r2.addActionListener(this);


            JMenu fee = new JMenu("Fee Detials");
            JMenuItem s1 = new JMenuItem("Fee Structure");
            JMenuItem s2 = new JMenuItem("student fee Form");
            fee.setBackground(Color.BLUE);

            s1.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon36 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.PNG"));
            Image image34 = icon36.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            s1.setIcon(new ImageIcon(image34));
            s1.setMnemonic('G');
            s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
            s1.setBackground(Color.white);
            s1.addActionListener(this);


            s2.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon37 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.PNG"));
            Image image35 = icon37.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
            s2.setIcon(new ImageIcon(image35));
            s2.setMnemonic('H');
            s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
            s2.setBackground(Color.white);
            s2.addActionListener(this);


            JMenu utility = new JMenu("Utility");
            JMenuItem ut1 = new JMenuItem("Notepad");
            JMenuItem ut2 = new JMenuItem("calculator");
            JMenuItem ut3 = new JMenuItem("Web Browser");
            utility.setForeground(Color.white);

            ut1.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon9.png"));
            Image image19 = icon18.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ut1.setIcon(new ImageIcon(image19));
            ut1.setMnemonic('I');
            ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
            ut1.setBackground(Color.WHITE);


            ut2.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon10.png"));
            Image image21 = icon20.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ut2.setIcon(new ImageIcon(image21));
            ut2.setMnemonic('J');
            ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
            ut2.setBackground(Color.WHITE);


            ut3.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon11.png"));
            Image image10 = icon10.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ut3.setIcon(new ImageIcon(image10));
            ut3.setMnemonic('K');
            ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
            ut3.setBackground(Color.WHITE);


            ut1.addActionListener(this);
            ut2.addActionListener(this);
            ut3.addActionListener(this);


            JMenu about = new JMenu("about");
            JMenuItem aboutUs = new JMenuItem("About us");
            about.setForeground(Color.RED);
            aboutUs.setFont(new Font("monospace", Font.BOLD, 16));
            ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon13.jpg"));
            Image image22 = icon21.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            aboutUs.setIcon(new ImageIcon(image22));
            aboutUs.setMnemonic('L');
            aboutUs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
            aboutUs.add(about);
            aboutUs.addActionListener(this);

            JMenu exit = new JMenu("Exit");
            JMenuItem ex = new JMenuItem("exit");
            exit.setForeground(Color.red);


            ex.setFont(new Font("monospaced", Font.BOLD, 16));
            ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon12.png"));
            Image image11 = icon11.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ex.setIcon(new ImageIcon(image11));
            ex.setMnemonic('Z');
            ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
            ex.setBackground(Color.WHITE);

            ex.addActionListener(this);

            master.add(m1);
            master.add(m2);

            user.add(u1);
            user.add(u2);

            report.add(r1);
            report.add(r2);

            fee.add(s1);
            fee.add(s2);

            utility.add(ut1);
            utility.add(ut2);
            utility.add(ut3);


            exit.add(ex);

            mb.add(master);
            mb.add(user);
            mb.add(attendance);
            mb.add(attendence_detail);
            mb.add(exam);
            mb.add(report);
            mb.add(fee);
            mb.add(utility);
            mb.add(about);
            mb.add(exit);

            setJMenuBar(mb);
            setFont((new Font("Senserif", Font.BOLD, 16)));
            setLayout(new FlowLayout());
            setVisible(false);

    }
    public void actionPerformed(ActionEvent ae)
    {
            String msg = ae.getActionCommand();
            if(msg.equals("New Student admission"))
            {
                    new AddStudent().f.setVisible(true);
            }

    else if(msg.equals("New Faculty"))
    {
        new AddTeacher().f.setVisible(true);

}
    else if(msg.equals("Student Details"))
    {

        new studentDetails().setVisible(true);

}
    else if(msg.equals("Teacher Details"))
    {
        new teacherDetails().setVisible(true);

}
        else if(msg.equals("Update Students"))
        {
        new updateStudent().f.setVisible(true);

}
        else if(msg.equals("Update Teachers"))
        {
        new updateTeacher().f.setVisible(true);

}
        else if(msg.equals("Fee Structure"))
        {
        new FeeStructure().setVisible(true);

}
        else if(msg.equals("Student Fee Form"))

        {
                new StudentFeeForm().setVisible(true);
        }
else if (msg.equals("Notepad"))
            {
                    try
                    {
                            Runtime.getRuntime().exec("notepad.exe");
                    } catch (IOException e) {

                    }

            }
else if(msg.equals("calculator"))
            {
                    try
                    {
                            Runtime.getRuntime().exec("calc.exe");
                    }
                    catch (Exception e)
                    {

                    }
            }
else if (msg.equalsIgnoreCase("Web browser")) {
                    try {
                            Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
                    } catch (Exception e) {

                    }
            }
else if (msg.equals("Exit"))
            {
                    System.exit(0);
            }
            else if(msg.equals("About Us"))
            {
                    new Aboutus() .setVisible(true);
            }
            else if(msg.equals("Student Attendance"))
            {
                    new studentAttendance().setVisible(true);
            }
            else if(msg.equals("Teacher Attendance"))
            {
                    new teacherAttendance().setVisible(true);
            }
            else if(msg.equals("Student Attendance Detail"))
            {
                    new studentAttendanceDetails().setVisible(true);
            }
            else if(msg.equals("Teacher Attendance Detail"))
            {
                    new teacherAttendeceDetaills().setVisible(true);
            }
            else if(msg.equals("Examination Details"))
            {
                    new ExamnationDetails().setVisible(true);
            }
            else if(msg.equals("Enter Marks"))
            {
                    new EnterMarks().setVisible(true);
            }

    }


        public static void main(String[] args)
        {
                new Project().setVisible(true);
        }


}
