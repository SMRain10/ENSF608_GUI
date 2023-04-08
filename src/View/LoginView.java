package View;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JPanel {
    private JTextField input;
    private JButton loginButton;
    private JButton guestButton;

    public LoginView() {

        // create UI components
        input = new JTextField(20);
        loginButton = new JButton("Login");
        guestButton = new JButton("Patient Appointment Booking");

        // add event listeners
        loginButton.addActionListener(e -> login());
        guestButton.addActionListener(e -> continueAsGuest());

        // create layout
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setPreferredSize(new Dimension(400, 200));

        // create sub-panels
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        centerPanel.add(new JLabel("Login ID:"));
        centerPanel.add(input);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttonPanel.add(loginButton);
        buttonPanel.add(guestButton);

        // add sub-panels to main panel
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);



    }
    private void login() {
        String loginId = input.getText();
        System.out.println(loginId);


        // Check if the login is successful
        boolean successfulLogin = authenticateUser(loginId); // replace with your own implementation

        if (successfulLogin) {
            // Switch to the AdminView
            MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
            mainView.setCard(3);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid login ID");
        }
    }

    private boolean authenticateUser(String loginId) {
        if (loginId.equals("doctor")) {
            return true;
        } else {
            return false;
        }
    }

    private void continueAsGuest() {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setCard(2); // Assuming the index of the PatientView is 2
    }


}

// add components to frame
//        setContentPane(panel);
//        pack();
//        setLocationRelativeTo(null); // center the frame on screen;
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        setVisible(true);