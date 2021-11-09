package university.management.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.ContentHandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamnationDetails extends JFrame implements ActionListener
{
    private JPanel contentPane;
    private JTable table ;
    private JTextField search;
    private JButton b1,b2,b3;

    public void Book()
    {
        try
        {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs =st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();

        }
        catch(Exception e)
        {

        }
    }
    public ExamnationDetails()
    {
        setBounds(350,22,930,475);//setbounds is the combination of setSize and setLocation
        //first two are parameters of Location next two are parameters of size
        contentPane = new JPanel();
        contentPane.setBackground(Color.white);
       // contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);//adding panel in the framne
        contentPane.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79,133,1080,282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent arg0)
        {
            int row = table.getSelectedRow();
            search.setText(table.getModel().getValueAt(row,10).toString());

        }
        });
        table.setBackground(Color.red);
        table.setForeground(Color.darkGray);
        table.setFont(new Font("trebuchet MS",Font.BOLD,16));
        scrollPane.setViewportView(table);

        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255,20,147),2,true));//another way of COLOR.pink
        b1.setForeground(new Color(199,21,133));//light pink
        b1.setFont(new Font("Trebuchet MS",Font.BOLD,18));
        b1.setBounds(564,89,138,33);
        contentPane.add(b1);

        JLabel l1 = new JLabel("check result");
        l1.setForeground(new Color(107,142,35));//light green shade
        l1.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,30));
l1.setBounds(189,89,357,33);

        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

JLabel l3 = new JLabel("Back");
l3.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e)
    {
        setVisible(false);
    }
});
l3.setForeground(Color.gray);
l3.setFont(new Font("trebuchet Ms",Font.BOLD,18));
l3.setBounds(97,89,72,33);
contentPane.add(l3);

JPanel panel = new JPanel();
panel.setBorder(new TitledBorder(new LineBorder(new Color(0,128,128),3,true),"BOOK_DETAILS",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(0,128,0)));
panel.setBounds(67,54,1100,368);
contentPane.add(panel);
panel.setBackground(Color.white);
Book();
setSize(1200,500);

    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            conn con = new conn();
            if(ae.getSource()==b1)
            {
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            };

        }
        catch (Exception e)
        {

        }

    }

    public static void main(String[] args) {
        new ExamnationDetails().setVisible(true);
    }

}
