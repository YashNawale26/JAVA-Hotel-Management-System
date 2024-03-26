// swing packages are under the JFrame Class
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

    HotelManagementSystem(){
        // setSize(1366, 565);  // to set size of the frame. the frame should be the same size as that of the image we will be using, as
        // setLocation(100,100); //set default location of frame
        setBounds(100,100,1366,565);

        setLayout(null);

        //ImageIcon Class is used to create icon from Image, ClassLoader is used to interact with system resources to fetch the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        //we can not place the icon directly on hte frame
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1366,565);  // locationx, locationy, length, breadth
        add(image);

        JLabel  text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20, 430, 1000, 90); //bounds for the text
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif", Font.PLAIN, 50));
        image.add(text);

        JButton next = new JButton("Next");
        next.setBounds(1150,450,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.MAGENTA);
        next.setFont(new Font("serif", Font.PLAIN, 25));
        next.addActionListener(this);
        image.add(next);

        setVisible(true);

        while(true){
            text.setVisible(false); //to make the text visible
            try{
                Thread.sleep(500); //to make the text visible for 500ms
            }catch(Exception e){}
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String [] args){
        new HotelManagementSystem();
    }
}
