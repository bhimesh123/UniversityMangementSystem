package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class studentAttendance extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2;
    Choice c1, fh, sh;

    studentAttendance() {
        setLayout(new GridLayout(4, 2, 50, 50));
        c1 = new Choice();
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                c1.add(rs.getString("rollno"));
            }


        } catch (Exception e) {

        }
        add(new JLabel("select from Number"));
        add(c1);

        l1 = new JLabel("First Half");
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");

        add(l1);
        add(fh);

        l2 = new JLabel("Seconf Half");
        sh = new Choice();
        sh.add("present");
        sh.add("Absent");
        sh.add("Leave");

        add(l2);
        add(sh);

        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);

        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(Color.YELLOW);

        setVisible(true);
        setSize(400, 450);
        setLocation(600, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id = c1.getSelectedItem();
        String qry = "Insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";


        try
        {
            conn c2 = new conn();
            c2.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendence confirmed");
            this.setVisible(false);
        }
        catch (Exception b)
        {
            b.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new studentAttendance();
    }
}
