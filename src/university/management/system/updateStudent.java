package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updateStudent implements ActionListener

{
    JFrame f;
JButton b1,b2,b3;
    JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id15, lab, lab1, lab2;
    JTextField t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
    String Rollno;

    updateStudent()
    {
        f = new JFrame("Update Studnet details");
        f.setSize(900,650);
        f.setLocation(450,150);
        f.setBackground(Color.white);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter rollno to update the student details");
        l1.setBounds(50,100,500,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        f.add(l1);

        t12 = new JTextField();
        t12.setBounds(500,100,200,30);
        f.add(t12);

        b2 = new JButton("Update");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(720,100,100,30);
        f.add(b2);
        b2.addActionListener(this);

        id8 = new JLabel("Enter Student details");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.white);
        f.add(id8);

        id1 = new JLabel("Name");
        id1.setBounds(50,170,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.add(id1);

        t1=new JTextField();
        t1.setBounds(200,170,150,30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(600,170,150,30);
        f.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,220,150,30);
        f.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");
        id4.setBounds(400,220,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,220,150,30);
        f.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,270,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.add(id5);

        t5=new JTextField();
        t5.setBounds(200,270,150,30);
        f.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,270,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,270,150,30);
        f.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,320,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,320,150,30);
        f.add(t7);

        id9= new JLabel("Class X(%)");
        id9.setBounds(400,320,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));
        f.add(id9);

        t8=new JTextField();
        t8.setBounds(600,320,150,30);
        f.add(t8);

        id10= new JLabel("Class XII(%)");
        id10.setBounds(50,370,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        f.add(id10);

        t9=new JTextField();
        t9.setBounds(200,370,150,30);
        f.add(t9);


        id11= new JLabel("Aadhar No");
        id11.setBounds(400,370,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        f.add(id11);

        t10=new JTextField();
        t10.setBounds(600,370,150,30);
        f.add(t10);

        id12= new JLabel("Roll No");
        id12.setBounds(50,420,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        f.add(id12);

        t11=new JTextField();
        t11.setBounds(200,420,150,30);
        f.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(400,420,150,30);
        lab.setFont(new Font("serif",Font.BOLD,20));
        f.add(lab);

        t13=new JTextField();
        t13.setBounds(600,420,150,30);
        f.add(t13);

        lab2=new JLabel("Branch");
        lab2.setBounds(50,470,150,30);
        lab2.setFont(new Font("serif",Font.BOLD,20));
        f.add(lab2);

        t14=new JTextField();
        t14.setBounds(200,470,150,30);
        f.add(t14);

        b3= new JButton("Submit");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(250,520,150,40);

        f.add(b3);

        b1=new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,520,150,40);

        f.add(b1);
        b1.addActionListener(this);
        b3.addActionListener(this);

        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==b1)
        {
            try {
                conn c = new conn();
               String str =  "update student set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',class_x='"+t8.getText()+"',class_xii='"+t9.getText()+"',aadhar='"+t10.getText()+"',course='"+t13.getText()+"',branch='"+t14.getText()+"' where rollno='"+t12.getText()+"'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Data upadted");

                f.setVisible(false);
                new studentDetails();


            }
            catch(Exception e)
            {
                System.out.println("the error is " + e);
            }
            if(a.getSource()==b2)
            {
                f.setVisible(false);
                new Project().setVisible(true);
            }
            if(a.getSource()==b2) {
                try
                {
                    conn c = new conn();
                    String str = "select * from student where rollno = '"+t12.getText()+"'";
                    ResultSet rs = c.s.executeQuery(str);
                    if(rs.next())
                    {
                        f.setVisible(true);

                        t1.setText(rs.getString(1));
                        t2.setText(rs.getString(2));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t5.setText(rs.getString(5));
                        t6.setText(rs.getString(6));
                        t7.setText(rs.getString(7));
                        t8.setText(rs.getString(8));
                        t9.setText(rs.getString(9));
                        t10.setText(rs.getString(10));
                        t11.setText(rs.getString(11));
                        t13.setText(rs.getString(12));
                        t14.setText(rs.getString(13));
                    }
                    }
                catch (Exception e)
                {
                    f.setVisible(true);
                    f.setSize(900,650);
                    f.setLocation(450,250);
                }
            }
        }

    }

    public static void main(String[] args) {
        new updateStudent().f.setVisible(true);
    }

}
