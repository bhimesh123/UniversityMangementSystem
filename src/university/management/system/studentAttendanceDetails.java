package university.management.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class studentAttendanceDetails  extends JFrame implements ActionListener
{
    JTable j1;
    JButton b1;
    String h1[] = {"RollNumber","Date Time","First Half","Second Half"};
    String d[][] = new String[15][4];
    int i =0 , j=0;

    studentAttendanceDetails()
    {
        super("View Student Attendance");
        setSize(800,300);
        setLocation(450,150);

        try
        {
            String q = "select * from attendence_student";
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery(q);
            while(rs.next())
            {
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("Date");
                d[i][j++] =rs.getString("First");
                d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
            j1= new JTable(d,h1);
        }
        catch(Exception e)
        {

        }
        b1 = new JButton("Print");
                add(b1,"South");
        JScrollPane s1 = new JScrollPane(j1);
        add(s1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            j1.print();

        }
        catch (Exception e)
        {

        }
    }

    public static void main(String[] args) {
        new studentAttendanceDetails().setVisible(true);
    }

}
