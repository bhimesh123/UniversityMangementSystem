package university.management.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class teacherAttendeceDetaills extends JFrame implements ActionListener
{
    JButton b1;
    JTable t1;
    String h[] = {"RollNumber","Date Time","First Half","Second Half"};
    String d[][] = new String[15][4];
    int i =0,j=0;

    teacherAttendeceDetaills()
    {
        super("Teacher Attendenc details");
      setSize(800,300);
      setLocation(450,150);

      try
      {
          conn c1 = new conn();
          String q= "Select * from attendence_teacher";
          ResultSet rs = c1.s.executeQuery(q);
          while(rs.next())
          {
              d[i][j++]=rs.getString("Roll number");
              d[i][j++]=rs.getString("Date time");
              d[i][j++]=rs.getString("First");
              d[i][j++]=rs.getString("Second");
              i =0;
              j++;
          }
          t1 = new JTable(d,h);



      }catch (Exception e)
      {
b1 = new JButton("Print");
add(b1,"South");
JScrollPane scrollPane = new JScrollPane(t1);
add(scrollPane);

      }

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            t1.print();
        }
        catch (Exception ee)
        {

        }

    }

    public static void main(String[] args) {
        new teacherAttendeceDetaills().setVisible(true);
    }

}
