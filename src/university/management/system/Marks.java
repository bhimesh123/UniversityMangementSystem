package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

/*The main difference between JTextField and JTextArea in Java is that a JTextField allows entering a single line of text
 in a GUI application while the JTextArea allows entering multiple lines of text in a GUI application.
 */
public class Marks extends JFrame
{
    JTextArea t1 ;
    JPanel p1;

    Marks()
    {

    }
    public Marks(String text)
    {
        setSize(500,600);
        setLayout(new BorderLayout());
        p1= new JPanel();
     t1 = new JTextArea(50,15);
     JScrollPane jsp = new JScrollPane(t1);
     t1.setFont(new Font("senserif",Font.ITALIC,18));

add(p1,"North");
add(jsp,"Centre");
setLocation(450,200);
mark(text);

    }
    public void mark(String s)
    {
        try
        {
            conn c = new conn();
            t1.setText("\tResult of Examination \n\nSubject\n");

            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno ="+s);
            if(rs1.next())
            {
                t1.append("\n\t"+rs1.getString("subject1"));
                t1.append("\n\t"+rs1.getString("subject2"));
                t1.append("\n\t"+rs1.getString("subject3"));
                t1.append("\n\t"+rs1.getString("subject4"));
                t1.append("\n\t"+rs1.getString("subject5"));
                t1.append("\n-----------------------------------------");
                t1.append("\n");

            }
            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);
            if(rs2.next())
            {

                int marks1 = Integer.parseInt(rs2.getString("marks1"));
                int marks2 = Integer.parseInt(rs2.getString("marks2"));
                int marks3 = Integer.parseInt(rs2.getString("marks3"));
                int marks4 = Integer.parseInt(rs2.getString("marks4"));
                int marks5 = Integer.parseInt(rs2.getString("marks5"));
                int total = marks1+marks2+marks3+marks4+marks5;

                t1.append("\nMarks\n\n\t"+rs2.getString("marks1"));
            t1.append("\n\t"+rs2.getString("marks2"));
            t1.append("\n\t"+rs2.getString("marks3"));
            t1.append("\n\t"+rs2.getString("marks4"));
            t1.append("\n\t"+rs2.getString("marks5"));
            t1.append("\n-----------------------------------------");
            t1.append("\n");
                t1.append("\n Total Marks :");
                t1.append(total+"/500");
        }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Marks().setVisible(true);
    }


}
