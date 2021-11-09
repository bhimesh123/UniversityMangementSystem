package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener
{
    JFrame f;
    JButton b1,b2;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;

    Login()
    {
        super("Login");

        setBackground(Color.DARK_GRAY);
        setLayout(null);
        l1= new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);

        l2 =new JLabel("password");
        l2.setBounds(40,70,100,30);
        add(l2);

        t1=new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,150,150);
        add(l3);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2 = new JButton("cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        add(b2);

        b2.addActionListener(this);

        setVisible(true);
        setSize(700,400);
        setLocation(600,400);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
        try
        {
            conn c= new conn();
            String u = t1.getText();
            String v = t2.getText();

            String q = "select * from login where username = '"+u+"' and password = '"+v+"'";

            ResultSet rs = c.s.executeQuery(q);
            if(rs.next())
            {
                new Project().setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid login");
                setVisible(false);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
        else if(ae.getSource()==b2)
        {
            System.exit(0);
        }


}

    public static void main(String[] args)
    {
        Login l = new Login();
    }

    }
