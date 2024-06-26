import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.*;

public class Pickup extends JFrame implements ActionListener{
    JTable table;
    JButton back, submit;
    Choice typeofcar;
    JCheckBox available;
    Pickup(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Pickup Service");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(400,30,200,30);
        add(text);

        JLabel lblcar = new JLabel("Type of Car");
        lblcar.setFont(new Font("Tahoma", Font.PLAIN, 201));
        lblcar.setBounds(50,100,100,20);
        add(lblcar);

        typeofcar = new Choice();
        typeofcar.setBounds(150,100,200,25);
        add(typeofcar);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from driver");
            while(rs.next()){
                typeofcar.add(rs.getString("brand"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        JLabel l1 = new JLabel("Name");
        l1.setBounds(30,160,100,20);
        add(l1);

        JLabel l2 = new JLabel("Age");
        l2.setBounds(200,160,100,20);
        add(l2);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(330,160,100,20);
        add(l3);

        JLabel l4 = new JLabel("Company");
        l4.setBounds(460,160,100,20);
        add(l4);

        JLabel l5 = new JLabel("Brand");
        l5.setBounds(630,160,100,20);
        add(l5);

        JLabel l6 = new JLabel("Availability");
        l6.setBounds(740,160,100,20);
        add(l6);

        JLabel l7 = new JLabel("Location");
        l7.setBounds(890,160,100,20);
        add(l7);

        table = new JTable(); //data, header
        table.setBounds(0,200,1000,300);
        add(table);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from driver");

//          while(rs.next()){}  // could do it like this, but we will use rs2xml package
            table.setModel(DbUtils.resultSetToTableModel(rs));  //fetch data from sql. only data not column headers

        }catch(Exception e){
            e.printStackTrace();
        }

        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(350,520,120,30);
        add(submit);

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(550,520,120,30);
        add(back);

        setBounds(300,200,1000,600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            try{
                String query1 = "select * from driver where brand='"+typeofcar.getSelectedItem()+"'";

                Conn conn = new Conn();
                ResultSet rs;

                rs = conn.s.executeQuery(query1);
                table.setModel(DbUtils.resultSetToTableModel(rs));  //fetch data from sql. only data not column headers

            }catch(Exception e){
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Reception();
        }
    }

    public static void main(String[] args){
        new Pickup();
    }
}






