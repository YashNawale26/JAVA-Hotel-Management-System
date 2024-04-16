import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.*;

public class Room extends JFrame implements ActionListener{
    JTable table;
    JButton back;
    Room(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500,0,600,600);
        add(image);

        JLabel l1 = new JLabel("Room Number");
        l1.setBounds(10,10,100,20);
        add(l1);

        JLabel l2 = new JLabel("Availability");
        l2.setBounds(120,10,100,20);
        add(l2);

        JLabel l3 = new JLabel("Status");
        l3.setBounds(230,10,100,20);
        add(l3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(330,10,100,20);
        add(l4);

        JLabel l5 = new JLabel("Bed Type");
        l5.setBounds(410,10,100,20);
        add(l5);

        table = new JTable(); //data, header
        table.setBounds(0,40,500,400);
        add(table);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from room");

//            while(rs.next()){}  // could do it like this, but we will use rs2xml package

            table.setModel(DbUtils.resultSetToTableModel(rs));  //fetch data from sql. only data not column headers

        }catch(Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(200,500,120,30);
        add(back);

        setBounds(300,200,1050,600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Reception();
    }

    public static void main(String[] args){
        new Room();
    }
}
