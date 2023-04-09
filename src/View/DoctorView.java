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


        pageLabel = new JLabel();
        pNameLabel = new JLabel();
        pNameInput = new JTextField();
        HCNumLabel = new JLabel();
        searchButton = new JButton();
        noteLabel = new JLabel();
        notesInput = new JTextField();
        resolveLabel = new JLabel();
        resolveMenu = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        jTable = new JTable();

        finishButton = new JButton();
        cancelButton = new JButton();
        createButton = new JButton();
        createPresButton = new JButton();
        deleteButton = new JButton();
        createLabTestButton = new JButton();
        docIDLabel = new JLabel();
        docIdInput = new JTextField();
        updateButton = new JButton();
        jScrollPane2 = new JScrollPane();
        famHistText = new JTextArea();
        famHistoryLabel = new JLabel();
        jScrollPane3 = new JScrollPane();
        smokerTextArea = new JTextArea();
        smokerLabel = new JLabel();
        HcInput = new JTextField();
        pInfoLabel = new JLabel();

        // Added code
        dconn = new Create_DB();
        model = new DefaultTableModel();
        data = dconn.searchDoctor("","","");


        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Doctor Page");

        pNameLabel.setText("Patient Name");

        pNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameInputActionPerformed(evt);
            }
        });

        HCNumLabel.setText("HC #");

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

        resolveMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No"}));
        resolveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolveMenuActionPerformed(evt);
            }
        });

        model.setDataVector(new Object[][] {null, null, null, null, null, null, null, null, null, null, null}, colNames);

        model.setDataVector(data, colNames);
        jTable.setModel(model);

        jScrollPane1.setViewportView(jTable);

        finishButton.setText("Finish");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
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

        famHistText.setColumns(20);
        famHistText.setRows(5);
        jScrollPane2.setViewportView(famHistText);

        famHistoryLabel.setText("Family History");

        smokerTextArea.setColumns(20);
        smokerTextArea.setRows(5);
        jScrollPane3.setViewportView(smokerTextArea);

        smokerLabel.setText("Smoker");

        HcInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HcInputActionPerformed(evt);
            }
        });

        pInfoLabel.setText("Patient Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(resolveMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(resolveLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(createPresButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(createLabTestButton))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(pNameLabel))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(pageLabel)
                                                                        .addComponent(HCNumLabel))))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cancelButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(finishButton)
                                                                .addGap(47, 47, 47))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(122, 122, 122)
                                                                .addComponent(docIDLabel)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(pInfoLabel)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(4, 4, 4)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(smokerLabel)
                                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(famHistoryLabel)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(50, 50, 50)
                                                                .addComponent(searchButton)))
                                                .addContainerGap(26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(famHistoryLabel)
                                                        .addComponent(smokerLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(64, 64, 64))
                                        .addComponent(noteLabel))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(finishButton)
                                        .addComponent(cancelButton)
                                        .addComponent(createPresButton)
                                        .addComponent(createLabTestButton))
                                .addGap(29, 29, 29))
        );
    }// </editor-fold>

    private void cancelButtonActionPerformed(ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setCard(0);
    }

    private void pNameInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (pNameInput.getText().equals("") && HcInput.getText().equals("") && docIdInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter at least one search criteria");
        } else {
            data = dconn.searchDoctor(docIdInput.getText(), pNameInput.getText(), HcInput.getText() );
            model.setDataVector(data, colNames);
        }
    }

    private void notesInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void resolveMenuActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void createLabTestButtonActionPerformed(java.awt.event.ActionEvent evt) {

        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setCard(4);
    }

    private void docIdInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void HcInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private JLabel HCNumLabel;
    private JTextField HcInput;
    private JButton cancelButton;
    private JButton createButton;
    private JButton createLabTestButton;
    private JButton createPresButton;
    private JButton deleteButton;
    private JLabel docIDLabel;
    private JTextField docIdInput;
    private JTextArea famHistText;
    private JLabel famHistoryLabel;
    private JButton finishButton;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTable jTable;
    private JLabel noteLabel;
    private JTextField notesInput;
    private JLabel pInfoLabel;
    private JTextField pNameInput;
    private JLabel pNameLabel;
    private JLabel pageLabel;
    private JLabel resolveLabel;
    private JComboBox<String> resolveMenu;
    private JButton searchButton;
    private JLabel smokerLabel;
    private JTextArea smokerTextArea;
    private JButton updateButton;

    //Added variables

    private DefaultTableModel model;
    private Create_DB dconn;
    private Object[][] data;
    private String[] colNames = {"DocumentID","Name", "Allergies", "Family History", "Smoker", "Birth Date", "Pre-existing conditions", "Notes", "Resolved"};
    // End of variables declaration

}