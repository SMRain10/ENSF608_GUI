package View;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JPanel {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        registerPatientButton = new javax.swing.JButton();
        viewApptsButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        staffLabel = new javax.swing.JLabel();
        staffLabel1 = new javax.swing.JLabel();
        ssnInput = new javax.swing.JPasswordField();
        ssnLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();


        registerPatientButton.setText("Register");
        registerPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientButtonActionPerformed(evt);
            }
        });

        viewApptsButton.setText("View Appointments");
        viewApptsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewApptsButtonActionPerformed(evt);
            }
        });

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Welcome to UCalgary Hospital");

        staffLabel.setText("Hospital Staff Login");

        ssnInput.setText("Password");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        ssnLabel.setText("SSN");


        loginButton.setText("Login");

        staffLabel1.setText("Patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(127, 127, 127)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(viewApptsButton)
                                                                        .addComponent(registerPatientButton)
                                                                        .addComponent(staffLabel1)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(367, 367, 367)
                                                                .addComponent(pageLabel))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(95, 95, 95)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(ssnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(86, 86, 86)
                                                                                .addComponent(loginButton))
                                                                        .addComponent(staffLabel)
                                                                        .addComponent(ssnLabel))))
                                                .addGap(0, 384, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(pageLabel)
                                .addGap(36, 36, 36)
                                .addComponent(staffLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewApptsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(staffLabel)
                                .addGap(46, 46, 46)
                                .addComponent(ssnLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ssnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginButton))
                                .addContainerGap(309, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void registerPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setCard(2);
    }

    private void viewApptsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String loginId = ssnInput.getText();
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


    // Variables declaration - do not modify
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton registerPatientButton;
    private javax.swing.JPasswordField ssnInput;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JLabel staffLabel;
    private javax.swing.JLabel staffLabel1;
    private javax.swing.JButton viewApptsButton;
    // End of variables declaration

    private boolean authenticateUser(String loginId) {
        if (loginId.equals("doctor")) {
            return true;
        } else {
            return false;
        }
    }


}

// add components to frame
//        setContentPane(panel);
//        pack();
//        setLocationRelativeTo(null); // center the frame on screen;
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        setVisible(true);