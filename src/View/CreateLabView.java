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


        //cd code
        dconn = new Create_DB();
        model = new DefaultTableModel();

        //
        pageLabel = new javax.swing.JLabel();
        HcInput = new javax.swing.JTextField();
        HCNumLabel = new javax.swing.JLabel();
        testTypeInput = new javax.swing.JTextField();
        testTypeLabel = new javax.swing.JLabel();
        docIDInput = new javax.swing.JTextField();
        docIDLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        searchResultsLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        successLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        HCNumLabel1 = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesInput = new javax.swing.JTextArea();
        docIDLabel1 = new javax.swing.JLabel();
        medSSNInput = new javax.swing.JTextField();

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Create Lab Test");


        HCNumLabel.setText("HC #");


        testTypeLabel.setText("Test Type");


        docIDLabel.setText("DocumentID");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
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

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },colNames
        ));

        model.setDataVector(data, colNames);
        searchTable.setModel(model);


        jScrollPane1.setViewportView(searchTable);

        searchResultsLabel.setText("Search Results");

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

        HCNumLabel1.setText("Name");

        notesLabel.setText("Notes");

        notesInput.setColumns(20);
        notesInput.setRows(5);
        jScrollPane2.setViewportView(notesInput);

        docIDLabel1.setText("Medical SSN");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(281, 281, 281)
                                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(257, 257, 257)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HCNumLabel)
                                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(docIDLabel)
                                                        .addComponent(docIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(medSSNInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(docIDLabel1))
                                                .addGap(83, 83, 83)
                                                .addComponent(searchButton)))
                                .addGap(0, 190, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(422, 422, 422)
                                                .addComponent(pageLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HCNumLabel1)
                                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(testTypeLabel)
                                                                        .addComponent(testTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(75, 75, 75)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(notesLabel)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(searchResultsLabel)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(backButton)
                                                .addGap(30, 30, 30)
                                                .addComponent(exitButton)
                                                .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(142, 142, 142))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pageLabel)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(docIDLabel)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(docIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(34, 34, 34)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(HCNumLabel1)
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(HCNumLabel)
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addComponent(searchButton))
                                .addGap(9, 9, 9)
                                .addComponent(docIDLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(testTypeLabel)
                                                .addComponent(notesLabel))
                                        .addComponent(medSSNInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(testTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(searchResultsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(exitButton)
                                        .addComponent(backButton))
                                .addGap(27, 27, 27))
        );
    }// </editor-fold>
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
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
        // TODO add your handling code here:

        data = dconn.searchLabTest(docIDInput.getText(), pNameInput.getText(), HcInput.getText());


        model.setDataVector(data, colNames);
        searchTable.setModel(model);

    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        System.out.println(HcInput.getText());

        dconn.InsertLabTest(notesInput.getText(),Integer.parseInt(HcInput.getText()), testTypeInput.getText(), medSSNInput.getText() );
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dconn.DeleteLabTest(Integer.parseInt(docIDInput.getText()));
    }



    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JLabel HCNumLabel1;
    private javax.swing.JTextField HcInput;
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField docIDInput;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JLabel docIDLabel1;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField medSSNInput;
    private javax.swing.JTextArea notesInput;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchResultsLabel;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel successLabel;
    private javax.swing.JTextField testTypeInput;
    private javax.swing.JLabel testTypeLabel;
    // End of variables declaration


    // ------------------- Added by SR -------------------


    private Create_DB dconn;
    private Object[][] data;
    private String[] colNames = {"DocumentID","Name", "Notes", "Results", "Test Type"};

    private DefaultTableModel model;
}

