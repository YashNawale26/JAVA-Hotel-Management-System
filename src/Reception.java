import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
    JButton newCustomer, rooms, department, allEmployee, customers, managerInfo, checkout, update, roomStatus, pickup, searchRoom, logout;

    Reception() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10, 30, 200, 30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);

        rooms = new JButton("Rooms");
        rooms.setBounds(10, 70, 200, 30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);

        department = new JButton("Department");
        department.setBounds(10, 110, 200, 30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);

        allEmployee = new JButton("All Employee");
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);

        customers = new JButton("Customer Info");
        customers.setBounds(10, 190, 200, 30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.WHITE);
        customers.addActionListener(this);
        add(customers);

        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10, 230, 200, 30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);

        checkout = new JButton("Checkout");
        checkout.setBounds(10, 270, 200, 30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);

        update = new JButton("Update Status");
        update.setBounds(10, 310, 200, 30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);

        roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        roomStatus.addActionListener(this);
        add(roomStatus);

        pickup = new JButton("Pickup Service");
        pickup.setBounds(10, 390, 200, 30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);

        searchRoom = new JButton("Search Room");
        searchRoom.setBounds(10, 430, 200, 30);
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.WHITE);
        searchRoom.addActionListener(this);
        add(searchRoom);

        logout = new JButton("Logout");
        logout.setBounds(10, 470, 200, 30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500, 470);
        add(image);

        setBounds(350, 200, 800, 570);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == newCustomer) {
            setVisible(false);
            new AddCustomer();
        }
        if (ae.getSource() == rooms) {
            setVisible(false);
            new Room();
        }
        if (ae.getSource() == department) {
            setVisible(false);
            new Department();
        }
        if (ae.getSource() == allEmployee) {
            setVisible(false);
            new EmployeeInfo();
        }
        if (ae.getSource() == customers) {
            setVisible(false);
            new CustomerInfo();
        }
        if (ae.getSource() == managerInfo) {
            setVisible(false);
            new ManagerInfo();
        }
        if (ae.getSource() == checkout) {
            setVisible(false);
            new Checkout();
        }
        if (ae.getSource() == update) {
            setVisible(false);
            new UpdateCheck();
        }
        if (ae.getSource() == roomStatus) {
            setVisible(false);
            new UpdateRoom();
        }
        if (ae.getSource() == pickup) {
            setVisible(false);
            new Pickup();
        }
        if (ae.getSource() == searchRoom) {
            setVisible(false);
            new SearchRoom();
        }
        if (ae.getSource() == logout) {
//            setVisible(false);
            System.exit(0);
        }

//        if (ae.getSource() == logout) {
//            setVisible(false);
//            String[] options = {"LOGIN", "EXIT"};
//            int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
//                    "Are you sure you want to exit?",//Object message,
//                    "Confirm", //String title
//                    JOptionPane.YES_NO_OPTION, //int optionType
//                    JOptionPane.INFORMATION_MESSAGE, //int messageType
//                    null, //Icon icon,
//                    options, //Object[] options,
//                    "LOGIN");//Object initialValue
//            if (choice == 0) {
//                new Login();
//            } else {
//                setVisible(false);
//            }
//        }
    }

//    private void showLogoutConfirmationDialog() {
//        // Create custom option dialog
//        String[] options = {"LOGIN", "EXIT"};
//        int choice = CustomOptionDialog.showOptionDialog(this, "Confirm", "Are you sure you want to exit?", options, null);
//
//        // Handle choice
//        if (choice == 0) {
//            new Login();
//        } else {
//            setVisible(false);
//        }
//    }

    public static void main(String args[]) {
        new Reception();

    }
}

//class CustomOptionDialog extends JDialog {
//    public CustomOptionDialog(JFrame parent, String title, String message, Object[] options, Icon icon) {
//        super(parent, title, true);
//        JPanel panel = new JPanel(new BorderLayout());
//        JLabel label = new JLabel(message);
//        panel.add(label, BorderLayout.CENTER);
//        JPanel buttonPanel = new JPanel();
//        for (Object option : options) {
//            JButton button = new JButton(option.toString());
//            button.setBackground(Color.WHITE);
//            buttonPanel.add(button);
//        }
//        panel.add(buttonPanel, BorderLayout.SOUTH);
//        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//       panel.setBackground(Color.WHITE); // Set background color
//        getContentPane().add(panel);
//        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        pack();
//        setLocationRelativeTo(parent);
//    }
//
//    public static int showOptionDialog(JFrame parent, String title, String message, Object[] options, Icon icon) {
//        CustomOptionDialog dialog = new CustomOptionDialog(parent, title, message, options, icon);
//        dialog.setVisible(true);
//        return 0; // Change this accordingly based on which button was clicked
//    }
//}

