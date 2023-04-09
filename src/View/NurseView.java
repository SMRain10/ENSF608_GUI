package View;

import javax.swing.*;

public class NurseView extends javax.swing.JPanel {

    /**
     * Creates new form NurseView
     */
    public NurseView() {
        initComponents();
    }

    /**
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        nurseLabel = new javax.swing.JLabel();
        famHistoryLabel = new javax.swing.JLabel();
        smokerLabel = new javax.swing.JLabel();
        HcInput = new javax.swing.JTextField();
        pInfoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        finishButton = new javax.swing.JButton();
        docIDLabel = new javax.swing.JLabel();
        pNameLabel = new javax.swing.JLabel();
        HCNumLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        noteLabel = new javax.swing.JLabel();
        notesInput = new javax.swing.JTextField();
        resolveLabel = new javax.swing.JLabel();
        docIdInput = new javax.swing.JTextField();
        smokerTextBox = new javax.swing.JTextField();
        familyHistoryTextBox = new javax.swing.JTextField();
        reslovedBox = new javax.swing.JTextField();

        nurseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nurseLabel.setText("Nurse View");

        famHistoryLabel.setText("Family History");

        smokerLabel.setText("Smoker");

        HcInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HcInputActionPerformed(evt);
            }
        });

        pInfoLabel.setText("Patient Info");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable);

        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        docIDLabel.setText("Document ID");

        pNameLabel.setText("Patient Name");

        HCNumLabel.setText("HC #");

        pNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameInputActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        noteLabel.setText("Notes");

        notesInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesInputActionPerformed(evt);
            }
        });

        resolveLabel.setText("Resolved");

        docIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docIdInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(finishButton)
                                .addGap(70, 70, 70))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(438, 438, 438)
                                                .addComponent(nurseLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(reslovedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(smokerTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(smokerLabel)))
                                                .addGap(108, 108, 108)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(famHistoryLabel)
                                                        .addComponent(familyHistoryTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(328, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(pNameLabel)
                                                        .addGap(135, 135, 135)
                                                        .addComponent(HCNumLabel)
                                                        .addGap(194, 194, 194)
                                                        .addComponent(docIDLabel)
                                                        .addContainerGap(439, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(notesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(noteLabel))
                                                        .addContainerGap(310, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(pInfoLabel)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(35, 35, 35)
                                                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(49, 49, 49)
                                                                        .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(50, 50, 50)
                                                                        .addComponent(searchButton))
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(resolveLabel))
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nurseLabel)
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(smokerLabel)
                                        .addComponent(famHistoryLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(familyHistoryTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(smokerTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(192, 192, 192)
                                .addComponent(reslovedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                                .addComponent(finishButton)
                                .addGap(14, 14, 14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
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
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pInfoLabel)
                                                        .addGap(153, 153, 153))
                                                .addComponent(noteLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(resolveLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)))
        );
    }// </editor-fold>

    private void HcInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Go back to the mainview
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setCard(0);

    }

    private void pNameInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void notesInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void docIdInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JTextField HcInput;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JTextField docIdInput;
    private javax.swing.JLabel famHistoryLabel;
    private javax.swing.JTextField familyHistoryTextBox;
    private javax.swing.JButton finishButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField notesInput;
    private javax.swing.JLabel nurseLabel;
    private javax.swing.JLabel pInfoLabel;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JTextField reslovedBox;
    private javax.swing.JLabel resolveLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel smokerLabel;
    private javax.swing.JTextField smokerTextBox;
    // End of variables declaration
}
