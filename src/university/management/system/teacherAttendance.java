package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class teacherAttendance  extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JButton b1,b2;
  Choice c1,fh,sh;

  teacherAttendance()
  {
      setLayout(new GridLayout(4,2,50,50));
      c1 = new Choice();
      try
      {
          conn con = new conn();
          ResultSet rs = con.s.executeQuery("select * from teacher");
          while(rs.next())
          {
              c1.add(rs.getString("emp_id"));
          }
      }
      catch(Exception e)
      {

      }
      add (new JLabel("select RollNumber"));
      add(c1);

      l1 = new JLabel("First Half");
      fh=new Choice();
      fh.add("present");
      fh.add("Absent");
      fh.add("Leave");
      add(l1);
      add(fh);

      l2 = new JLabel("second Half");
      sh = new Choice();
      sh.add("present");
      sh.add("Absent");
      sh.add("Leave");
      add(l2);
      add(sh);

      b1 = new JButton("Submit");
      b1.setBackground(Color.black);
      b1.setForeground(Color.white);

      b2 = new JButton("Cancel");
      b2.setBackground(Color.black);
      b2.setForeground(Color.white);

      add(b1);
      add(b2);

      b1.addActionListener(this);
      b2.addActionListener(this);

      getContentPane().setBackground(Color.yellow);

      setVisible(false);
      setSize(400,450);
      setLocation(600,200);
  }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id = c1.getSelectedItem();
        String qry = "insert into attendance_teacher values("+ id +",'"+dt+"','"+f+"','"+s+"')";

        try
        {
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }
        catch (Exception q)
        {
            q.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new teacherAttendance();
    }
}
