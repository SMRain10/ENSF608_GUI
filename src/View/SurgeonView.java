package View;

import Controller.Create_DB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SurgeonView extends javax.swing.JPanel {

    /**
     * Creates new form SurgeonView
     */
    public SurgeonView() {
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

        docIdInput = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        searchInfoLabel = new javax.swing.JLabel();
        HCNumLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        HcInput = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        exitButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        createPresButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        docIDLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pNameLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesInput = new javax.swing.JTextArea();
        pageLabel1 = new javax.swing.JLabel();
        anestheticLabel = new javax.swing.JLabel();
        surgeryTypeLabel = new javax.swing.JLabel();
        successLabel = new javax.swing.JLabel();
        anestheticInput = new javax.swing.JComboBox<>();
        surgeryTypeInput = new javax.swing.JComboBox<>();
        resolvedLabel = new javax.swing.JLabel();
        resolvedInput = new javax.swing.JComboBox<>();

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Surgeon Page");

        searchInfoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchInfoLabel.setText("Search for Patient Surgery Information");

        HCNumLabel.setText("HC #");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        noteLabel.setText("Notes");


        //------------Samuel added this--------------
        dconn = new Create_DB();
        model = new DefaultTableModel();
        jTable.setModel(model);

        //edit ends here


        jScrollPane1.setViewportView(jTable);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
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

        docIDLabel.setText("Document ID");

        pNameLabel1.setText("Patient Name");

        resolvedLabel.setText("Resolved");

        resolvedInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        notesInput.setColumns(20);
        notesInput.setRows(5);
        jScrollPane2.setViewportView(notesInput);

        pageLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel1.setText("Create/Modify Surgery Information");

        anestheticLabel.setText("Anesthetic");

        surgeryTypeLabel.setText("Surgery Type");

        successLabel.setText(" ");

        anestheticInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        surgeryTypeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Surgery", "Special Examination" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addComponent(pageLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(347, 347, 347)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(316, 316, 316)
                                                .addComponent(searchInfoLabel)))
                                .addGap(0, 52, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(createPresButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exitButton)
                                                .addGap(42, 42, 42))
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
                                                                .addComponent(pNameLabel1)
                                                                .addGap(135, 135, 135)
                                                                .addComponent(HCNumLabel)
                                                                .addGap(194, 194, 194)
                                                                .addComponent(docIDLabel)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(anestheticLabel)
                                                                        .addComponent(anestheticInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(140, 140, 140)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(surgeryTypeLabel)
                                                                        .addComponent(surgeryTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(resolvedLabel)
                                                        .addComponent(resolvedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(noteLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(181, 181, 181)
                                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(38, 38, 38)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(38, 38, 38)
                                                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(263, 263, 263)
                                                                .addComponent(pageLabel1)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pageLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(HCNumLabel)
                                        .addComponent(docIDLabel)
                                        .addComponent(pNameLabel1))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton))
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(pageLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 509, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(exitButton)
                                                        .addComponent(createPresButton))
                                                .addGap(21, 21, 21))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(anestheticLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(anestheticInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(resolvedLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(resolvedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(surgeryTypeLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(surgeryTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(65, 65, 65)))
                                                .addGap(43, 43, 43)
                                                .addComponent(noteLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(61, 61, 61)
                                                .addComponent(successLabel)
                                                .addGap(29, 81, Short.MAX_VALUE))))
        );
    }// </editor-fold>

    //+++++++++Samuel worked on this++++++++++++
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (pNameInput.getText().equals("") && HcInput.getText().equals("") && docIdInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter at least one search criteria");
        } else {

            data = dconn.searcAlldiagnosis(docIdInput.getText(), pNameInput.getText(), HcInput.getText() );
            model.setDataVector(data, colNames);
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }

    //+++++++++Samuel worked on this++++++++++++
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (HcInput.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Patient Name, HC# and Document ID must be completed");
        } else {

            dconn.InsertProcedure(notesInput.getText(), Integer.parseInt(HcInput.getText()), resolvedInput.getSelectedItem().toString(), surgeryTypeInput.getSelectedItem().toString(), anestheticInput.getSelectedItem().toString());
            model.setDataVector(data, colNames);
            data = dconn.searcAlldiagnosis(docIdInput.getText(), pNameInput.getText(), HcInput.getText() );
            model.setDataVector(data, colNames);
            successLabel.setText("Procedure inserted successfully");
        }
    }

    private void createPresButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setPrescriptionView(new PrescriptionView());
        mainView.setCard(7);
    }
    //+++++++++Samuel worked on this++++++++++++
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (docIdInput.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "P Document ID must be completed");
        } else {

            dconn.DeleteProcedure(Integer.parseInt(docIdInput.getText()));
            data = dconn.searcAlldiagnosis(docIdInput.getText(), pNameInput.getText(), HcInput.getText() );
            model.setDataVector(data, colNames);
            successLabel.setText("Procedure deleted successfully");
        }
    }
    //+++++++++Samuel worked on this++++++++++++
    // created this method
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (HcInput.getText().equals("") || docIdInput.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "HC# and Document ID must be completed");
        }
        else {
            dconn.UpdateProcedure(notesInput.getText(), resolvedInput.getSelectedItem().toString(), Integer.parseInt(HcInput.getText()),
                    Integer.parseInt(docIdInput.getText()), surgeryTypeInput.getSelectedItem().toString(),
                    anestheticInput.getSelectedItem().toString());
            System.out.println(notesInput.getText());
            data = dconn.searcAlldiagnosis(docIdInput.getText(), pNameInput.getText(), HcInput.getText());
            model.setDataVector(data, colNames);
            successLabel.setText("Procedure updated successfully");
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JTextField HcInput;
    private javax.swing.JComboBox<String> anestheticInput;
    private javax.swing.JLabel anestheticLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton createPresButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JTextField docIdInput;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextArea notesInput;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel1;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JLabel pageLabel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchInfoLabel;
    private javax.swing.JLabel successLabel;
    private javax.swing.JComboBox<String> surgeryTypeInput;
    private javax.swing.JLabel surgeryTypeLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> resolvedInput;
    private javax.swing.JLabel resolvedLabel;

    // End of variables declaration

    //----------------Samuel included these----
    private Create_DB dconn;
    private Object[][] data;
    private String[] colNames = {"DocumentID","Notes", "Allergies", "Family History", "Smoker", "Birth Date", "Pre-existing conditions", "Notes", "Resolved"};

    private DefaultTableModel model;

}
