import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.*;

public class Department extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    Department(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("Department");
        l1.setBounds(150,10,100,20);
        add(l1);

        JLabel l2 = new JLabel("Budget");
        l2.setBounds(520,10,100,20);
        add(l2);

        table = new JTable(); //data, header
        table.setBounds(0,50,700,350);
        add(table);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from department");

//            while(rs.next()){}  // could do it like this, but we will use rs2xml package

            table.setModel(DbUtils.resultSetToTableModel(rs));  //fetch data from sql. only data not column headers

        }catch(Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(280,400,120,30);
        add(back);

        setBounds(400,200,700,480);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Reception();
    }

    public static void main(String[] args){
        new Department();
    }
}
