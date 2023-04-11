package View;

import Controller.Create_DB;
import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class DoctorView extends javax.swing.JPanel {



    /**
     * Creates new form DoctorView
     */
    public DoctorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {


        pageLabel = new javax.swing.JLabel();
        pNameLabel = new javax.swing.JLabel();
        HCNumLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        noteLabel = new javax.swing.JLabel();
        notesInput = new javax.swing.JTextField();
        resolveLabel = new javax.swing.JLabel();
        resolveMenu = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        finishButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        createPresButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        createLabTestButton = new javax.swing.JButton();
        docIDLabel = new javax.swing.JLabel();
        docIdInput = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        HcInput = new javax.swing.JTextField();
        pInfoLabel = new javax.swing.JLabel();

        // Added code
        dconn = new Create_DB();
        model = new DefaultTableModel();



        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Doctor Page");

        pNameLabel.setText("Patient Name");

        HCNumLabel.setText("HC #");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        noteLabel.setText("Notes");

        resolveLabel.setText("Resolved");

        resolveMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","Yes", "No"}));

        model.setDataVector(new Object[][] {null, null, null, null, null, null, null, null, null, null, null}, colNames);

//        model.setDataVector(data, colNames);
        jTable.setModel(model);

        jScrollPane1.setViewportView(jTable);

        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        createPresButton.setText("Create Prescription");
        createPresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPresButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        createLabTestButton.setText("Create Lab Test");
        createLabTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabTestButtonActionPerformed(evt);
            }
        });

        docIDLabel.setText("Document ID");


        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        pInfoLabel.setText("Patient Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(407, 407, 407)
                                .addComponent(pageLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(notesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(noteLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(updateButton)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(deleteButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(createButton)))
                                                .addGap(64, 64, 64))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pInfoLabel)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(50, 50, 50)
                                                                .addComponent(searchButton))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameLabel)
                                                                .addGap(135, 135, 135)
                                                                .addComponent(HCNumLabel)
                                                                .addGap(170, 170, 170)
                                                                .addComponent(docIDLabel))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(createPresButton)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(createLabTestButton)
                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                        .addComponent(finishButton))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(resolveMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(resolveLabel))))
                                                .addGap(0, 51, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pageLabel)
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pNameLabel)
                                        .addComponent(HCNumLabel)
                                        .addComponent(docIDLabel))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton))
                                .addGap(63, 63, 63)
                                .addComponent(pInfoLabel)
                                .addGap(24, 24, 24)
                                .addComponent(noteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(deleteButton)
                                                        .addComponent(createButton))
                                                .addGap(18, 18, 18)
                                                .addComponent(updateButton))
                                        .addComponent(notesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(resolveLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resolveMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(finishButton)
                                        .addComponent(createPresButton)
                                        .addComponent(createLabTestButton))
                                .addGap(29, 29, 29))
        );
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (pNameInput.getText().equals("") && HcInput.getText().equals("") && docIdInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter at least one search criteria");
        } else {

            data = dconn.searcAlldiagnosis(docIdInput.getText(), pNameInput.getText(), HcInput.getText() );
            model.setDataVector(data, colNames);
        }
    }


    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String resolved = "";

        if(resolveMenu.getSelectedItem().equals("Yes")){
            resolved = "true";
        } else if (resolveMenu.getSelectedItem().equals("No")){
            resolved = "false";
        }

        if(notesInput.getText().equals("") || resolved.equals("") || HcInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Missing resolved, notes or healthcare number.");

        } else{
            dconn.InsertRoutineCheckUp(notesInput.getText(),Integer.parseInt(HcInput.getText()) ,Boolean.parseBoolean(resolved) );
        }



        
        // TODO add your handling code here:
    }

    private void createPresButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setPrescriptionView(new PrescriptionView());
        mainView.setCard(7);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {

        if(docIdInput.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Must enter Document number.");

        } else{
            dconn.DeleteRoutineCheckUp( Integer.parseInt(docIdInput.getText()) );
        }

        
        // TODO add your handling code here:
    }

    private void createLabTestButtonActionPerformed(java.awt.event.ActionEvent evt) {

        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setCard(4);
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {

        String resolved = "";

        if(resolveMenu.getSelectedItem().equals("Yes")){
            resolved = "true";
        } else if (resolveMenu.getSelectedItem().equals("No")){
            resolved = "false";
        }
        // TODO add your handling code here:
        dconn.UpdateRoutineCheckUp(notesInput.getText(), resolved , (HcInput.getText()) , (docIdInput.getText()));


    }

    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JTextField HcInput;
    private javax.swing.JButton createButton;
    private javax.swing.JButton createLabTestButton;
    private javax.swing.JButton createPresButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JTextField docIdInput;
    private javax.swing.JButton finishButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField notesInput;
    private javax.swing.JLabel pInfoLabel;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JLabel resolveLabel;
    private javax.swing.JComboBox<String> resolveMenu;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;

    //Added variables

    private DefaultTableModel model;
    private Create_DB dconn;
    private Object[][] data;
    private String[] colNames = {"DocumentID", "Notes","Resolved","Name", "Allergies", "Family History", "Smoker", "Birth Date", "Pre-existing conditions"};
    // End of variables declaration

}
