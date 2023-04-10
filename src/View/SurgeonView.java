package View;

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
        famHistoryLabel = new javax.swing.JLabel();
        searchInfoLabel = new javax.swing.JLabel();
        HCNumLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        smokerLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        HcInput = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        pInfoLabel = new javax.swing.JLabel();
        resolveLabel = new javax.swing.JLabel();
        resolveMenu = new javax.swing.JComboBox<>();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        familyHistoryInput = new javax.swing.JTextArea();
        smokerInput = new javax.swing.JComboBox<>();
        pageLabel1 = new javax.swing.JLabel();
        anestheticLabel = new javax.swing.JLabel();
        anestheticInput = new javax.swing.JTextField();
        surgeryTypeLabel = new javax.swing.JLabel();
        surgeryTypeInput = new javax.swing.JTextField();
        successLabel = new javax.swing.JLabel();

        docIdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docIdInputActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Surgeon Page");

        famHistoryLabel.setText("Family History");

        searchInfoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchInfoLabel.setText("Search for Patient Surgery Information");

        HCNumLabel.setText("HC #");

        pNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameInputActionPerformed(evt);
            }
        });

        smokerLabel.setText("Smoker");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        HcInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HcInputActionPerformed(evt);
            }
        });

        noteLabel.setText("Notes");

        pInfoLabel.setText("Patient Info");

        resolveLabel.setText("Resolved");

        resolveMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        resolveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolveMenuActionPerformed(evt);
            }
        });

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

        notesInput.setColumns(20);
        notesInput.setRows(5);
        jScrollPane2.setViewportView(notesInput);

        familyHistoryInput.setColumns(20);
        familyHistoryInput.setRows(5);
        jScrollPane3.setViewportView(familyHistoryInput);

        smokerInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        pageLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel1.setText("Create/Modify Surgery Information");

        anestheticLabel.setText("Anesthetic");

        surgeryTypeLabel.setText("Surgery Type");

        successLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
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
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(resolveMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(resolveLabel))
                                                                                .addGap(27, 27, 27)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(smokerLabel)
                                                                                        .addComponent(smokerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(anestheticLabel)
                                                                        .addComponent(anestheticInput))
                                                                .addGap(161, 161, 161)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(famHistoryLabel)
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(pInfoLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameLabel1)
                                                                .addGap(135, 135, 135)
                                                                .addComponent(HCNumLabel)
                                                                .addGap(194, 194, 194)
                                                                .addComponent(docIDLabel)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(surgeryTypeLabel)
                                                        .addComponent(noteLabel)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(263, 263, 263)
                                                                .addComponent(pageLabel1))
                                                        .addComponent(surgeryTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
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
                                                .addGap(261, 261, 261)
                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(347, 347, 347)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(316, 316, 316)
                                                .addComponent(searchInfoLabel)))
                                .addGap(0, 52, Short.MAX_VALUE))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pageLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(famHistoryLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pInfoLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(resolveLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(resolveMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(smokerInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(smokerLabel))
                                                .addGap(18, 18, 18)
                                                .addComponent(anestheticLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(anestheticInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exitButton)
                                                .addGap(21, 21, 21))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(surgeryTypeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(surgeryTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(noteLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(successLabel)
                                                .addGap(4, 4, 4)
                                                .addComponent(createPresButton)
                                                .addGap(29, 29, 29))))
        );
    }// </editor-fold>

    private void docIdInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void pNameInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void HcInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void resolveMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void createPresButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JTextField HcInput;
    private javax.swing.JTextField anestheticInput;
    private javax.swing.JLabel anestheticLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton createPresButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JTextField docIdInput;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel famHistoryLabel;
    private javax.swing.JTextArea familyHistoryInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextArea notesInput;
    private javax.swing.JLabel pInfoLabel;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel1;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JLabel pageLabel1;
    private javax.swing.JLabel resolveLabel;
    private javax.swing.JComboBox<String> resolveMenu;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchInfoLabel;
    private javax.swing.JComboBox<String> smokerInput;
    private javax.swing.JLabel smokerLabel;
    private javax.swing.JLabel successLabel;
    private javax.swing.JTextField surgeryTypeInput;
    private javax.swing.JLabel surgeryTypeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration
}
