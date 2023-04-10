package View;

import Controller.Create_DB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class CreateLabView extends javax.swing.JPanel {

    /**
     * Creates new form CreateLabTest
     */
    public CreateLabView() {
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
        HcInput = new javax.swing.JTextField();
        HCNumLabel = new javax.swing.JLabel();
        testTypeInput = new javax.swing.JTextField();
        testTypeLabel = new javax.swing.JLabel();
        docIDInput = new javax.swing.JTextField();
        docIDLabel = new javax.swing.JLabel();
        finishedButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        searchResultsLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();

        // ----------------- Added by Sam -----------------
        dconn = new Create_DB();
        model = new DefaultTableModel();
        searchTable.setModel(model);
        // finished


        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Create Lab Test");

        HCNumLabel.setText("HC #");

        testTypeLabel.setText("Test Type");

        docIDLabel.setText("DocumentID");

        finishedButton.setText("Finished");
        finishedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishedButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });


        jScrollPane1.setViewportView(searchTable);

        searchResultsLabel.setText("Search Results");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        successLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(88, 88, 88)
                                .addComponent(finishedButton)
                                .addGap(35, 35, 35))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(422, 422, 422)
                                                .addComponent(pageLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(searchResultsLabel)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(67, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(HCNumLabel)
                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(testTypeLabel)
                                        .addComponent(testTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(docIDLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(docIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(137, 137, 137)
                                                                .addComponent(searchButton))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(244, 244, 244))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pageLabel)
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(HCNumLabel)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(docIDLabel)
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(docIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(searchButton))))
                                                .addGap(67, 67, 67)
                                                .addComponent(testTypeLabel)
                                                .addGap(6, 6, 6)
                                                .addComponent(testTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(93, 93, 93)))
                                .addComponent(searchResultsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(finishedButton)
                                        .addComponent(backButton))
                                .addGap(27, 27, 27))
        );
    }// </editor-fold>




    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JTextField HcInput;
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField docIDInput;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JButton finishedButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchResultsLabel;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel successLabel;
    private javax.swing.JTextField testTypeInput;
    private javax.swing.JLabel testTypeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration

    // ------------------- Added by SR -------------------

    private void finishedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }
    private void backButtonActionPerformed(ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setDoctorView(new DoctorView());
        mainView.setCard(3);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (HcInput.getText().equals("") && docIDInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter at least one search criteria");
        } else {

            data = dconn.searcAlldiagnosis(docIDInput.getText(), "", HcInput.getText() );
            model.setDataVector(data, colNames);
        }
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private Create_DB dconn;
    private Object[][] data;
    private String[] colNames = {"DocumentID","Name", "Allergies", "Family History", "Smoker", "Birth Date", "Pre-existing conditions", "Notes", "Resolved"};

    private DefaultTableModel model;
}


