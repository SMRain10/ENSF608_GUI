package View;

import Controller.Create_DB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BillView extends javax.swing.JPanel {

    /**
     * Creates new form BillView
     */
    public BillView() {
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

        // SR Added ------------------------------------------
        dconn = new Create_DB();
        model = new DefaultTableModel();

        pageLabel = new javax.swing.JLabel();
        HcInput = new javax.swing.JTextField();
        HCNumLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        searchResultsLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        costOutput = new javax.swing.JLabel();
        invoiceInput = new javax.swing.JTextField();
        HCNumLabel2 = new javax.swing.JLabel();
        costingInput = new javax.swing.JTextField();
        HCNumLabel3 = new javax.swing.JLabel();
        companyInput = new javax.swing.JTextField();
        HCNumLabel4 = new javax.swing.JLabel();

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Billing Page");


        HCNumLabel.setText("HC #");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        model.setDataVector(new Object[][]{null, null,null,null}, colNames);

        searchTable.setModel(model);
        jScrollPane1.setViewportView(searchTable);

        searchResultsLabel.setText("Search Results");

        costLabel.setText("Total Bill Cost");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        costOutput.setText(" ");


        HCNumLabel2.setText("Invoice No");


        HCNumLabel3.setText("Costing Code");

        HCNumLabel4.setText("CompanyID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addGap(46, 46, 46))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(407, 407, 407)
                                                .addComponent(pageLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HCNumLabel)
                                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HCNumLabel2)
                                                        .addComponent(invoiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HCNumLabel3)
                                                        .addComponent(costingInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HCNumLabel4)
                                                        .addComponent(companyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(searchResultsLabel)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(134, 134, 134)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(costLabel)
                                                        .addComponent(costOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(391, 391, 391)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(pageLabel)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(HCNumLabel)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(HCNumLabel3)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(costingInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(HCNumLabel2)
                                                .addGap(6, 6, 6)
                                                .addComponent(invoiceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(HCNumLabel4)
                                                .addGap(6, 6, 6)
                                                .addComponent(companyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(searchResultsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(costLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addGap(23, 23, 23))
        );
    }// </editor-fold>

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {

        data = dconn.searchBill(HcInput.getText(), invoiceInput.getText(), costingInput.getText(), companyInput.getText());
        model.setDataVector(data, colNames);


    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JLabel HCNumLabel2;
    private javax.swing.JLabel HCNumLabel3;
    private javax.swing.JLabel HCNumLabel4;
    private javax.swing.JTextField HcInput;
    private javax.swing.JTextField companyInput;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel costOutput;
    private javax.swing.JTextField costingInput;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField invoiceInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchResultsLabel;
    private javax.swing.JTable searchTable;
    // End of variables declaration
    private DefaultTableModel model;
    private Create_DB dconn;
    private Object[][] data;
    private String[] colNames = {"Health Care Number","Invoice Number", "Costing Code", "Company ID", "Cost"};
}

    // End of variables declaration



