package View;

import Controller.Create_DB;

import javax.swing.*;

public class RegisterPatientView extends javax.swing.JPanel {

    /**
     * Creates new form PatientView
     */
    public RegisterPatientView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //Contains the code for the GUI and intializes the components.
    private void initComponents() {

        //CD code
        dconn = new Create_DB();


        //netbeans variables

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        step1Label = new javax.swing.JLabel();
        HcnInput = new javax.swing.JTextField();
        bdMonthInput = new javax.swing.JComboBox<>();
        bdMonthLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        bdDayInput = new javax.swing.JComboBox<>();
        yearLabel = new javax.swing.JLabel();
        bdYearInput = new javax.swing.JComboBox<>();
        registerPatient = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        hcnLabel = new javax.swing.JLabel();
        pNameLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneInput = new javax.swing.JTextField();
        famHistoryLabel = new javax.swing.JLabel();
        famHistoryInput = new javax.swing.JTextField();
        allergyLabel = new javax.swing.JLabel();
        allergyInput = new javax.swing.JTextField();
        smokerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        smokerInput = new javax.swing.JList<>();
        birthdateLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        pecLabel = new javax.swing.JLabel();
        pecInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityInput = new javax.swing.JTextField();
        provinceLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        provinceInput = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        createApptButton = new javax.swing.JButton();
        successText = new javax.swing.JLabel();
        genderInput = new javax.swing.JComboBox<>();

        step1Label.setText("Please fill out all boxes below.");

        bdMonthInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March"
                , "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        bdMonthLabel.setText("Month");

        dayLabel.setText("Day");

        bdDayInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" }));

        yearLabel.setText("Year");

        bdYearInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023","2022","2021","2020","2019",
                "2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005",
                "2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991",
                "1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980","1979","1978","1977",
                "1976","1975","1974","1973","1972","1971","1970","1969","1968","1967","1966","1965","1964","1963",
                "1962","1961","1960","1959","1958","1957","1956","1955","1954","1953","1952","1951","1950","1949",
                "1948","1947","1946","1945","1944","1943","1942","1941","1940","1939","1938","1937","1936","1935",
                "1934","1933","1932","1931","1930","1929","1928","1927","1926","1925","1924","1923","1922","1921",
                "1920","1919","1918","1917","1916","1915","1914","1913","1912","1911","1910","1909","1908","1907",
                "1906","1905","1904","1903","1902","1901","1900" }));

        registerPatient.setText("Register Patient");
        registerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientActionPerformed(evt);
            }
        });

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Patient Registration");

        hcnLabel.setText("Health Card Number");

        pNameLabel.setText("Name");
        phoneLabel.setText("Phone Number");
        famHistoryLabel.setText("Family History");
        allergyLabel.setText("Allergies");
        smokerLabel.setText("Smoker");
        birthdateLabel.setText("Birth Date");
        genderLabel.setText("Gender");
        genderInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        pecLabel.setText("Pre-existing Conditions");
        addressLabel.setText("Address");
        cityLabel.setText("City");
        provinceLabel.setText("Province");

        smokerInput.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Yes", "No" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(smokerInput);

        provinceInput.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "AB", "BC", "SK", "NWT", "YT", "NT", "MB", "QC", "NS", "NB", "PE", "NL" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(provinceInput);

        //Action listener for the back button
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        createApptButton.setText("Create Appointment");
        createApptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createApptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(212, 212, 212))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(addressLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(hcnLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(HcnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(step1Label)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(phoneLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(famHistoryLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(famHistoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(birthdateLabel)
                                                                                .addGap(40, 40, 40)
                                                                                .addComponent(bdMonthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(114, 114, 114)
                                                                                .addComponent(bdMonthLabel)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(24, 24, 24)
                                                                                .addComponent(dayLabel))
                                                                        .addComponent(bdDayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(bdYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(42, 42, 42)
                                                                                .addComponent(yearLabel))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(genderLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(genderInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(allergyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(42, 42, 42))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(allergyLabel)
                                                                                .addGap(22, 22, 22)))
                                                                .addComponent(smokerLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pecLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(pecInput, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cityLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(80, 80, 80)
                                                                .addComponent(provinceLabel)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(224, 224, 224)
                                                                .addComponent(successText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(418, 418, 418)
                                                .addComponent(pageLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(381, 381, 381)
                                                .addComponent(registerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(174, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(822, Short.MAX_VALUE)
                                        .addComponent(createApptButton)
                                        .addGap(40, 40, 40)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pageLabel)
                                .addGap(18, 18, 18)
                                .addComponent(step1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(HcnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hcnLabel))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pNameLabel)
                                        .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(famHistoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(famHistoryLabel))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(allergyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(allergyLabel)
                                                                        .addComponent(smokerLabel))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(bdMonthLabel)
                                                                                .addGap(4, 4, 4)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(birthdateLabel)
                                                                                        .addComponent(bdMonthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(dayLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(bdDayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(yearLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(bdYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(genderInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(genderLabel))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(pecInput, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pecLabel))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addressLabel)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(provinceLabel)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cityLabel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(registerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(successText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(backButton)
                                .addGap(14, 14, 14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(861, Short.MAX_VALUE)
                                        .addComponent(createApptButton)
                                        .addGap(15, 15, 15)))
        );
    }

    private void registerPatientActionPerformed(java.awt.event.ActionEvent evt) {

        String monthToDigit = "01";

        if(bdMonthInput.getSelectedItem() == "Janurary"){
                monthToDigit = "01";
        } else if (bdMonthInput.getSelectedItem() == "February"){
                monthToDigit = "02";
        }else if (bdMonthInput.getSelectedItem() == "March"){
                monthToDigit = "03";
        }else if (bdMonthInput.getSelectedItem() == "April"){
                monthToDigit = "04";
        }else if (bdMonthInput.getSelectedItem() == "May"){
                monthToDigit = "05";
        }else if (bdMonthInput.getSelectedItem() == "June"){
                monthToDigit = "06";
        }else if (bdMonthInput.getSelectedItem() == "July"){
                monthToDigit = "07";
        }else if (bdMonthInput.getSelectedItem() == "August"){
                monthToDigit = "08";
        }else if (bdMonthInput.getSelectedItem() == "September"){
                monthToDigit = "09";
        }
        else if (bdMonthInput.getSelectedItem() == "October"){
                monthToDigit = "10";
        }
        else if (bdMonthInput.getSelectedItem() == "November"){
                monthToDigit = "11";
        }
        else if (bdMonthInput.getSelectedItem() == "December"){
                monthToDigit = "12";
        }
                



        String birthday = bdYearInput.getSelectedItem() + "-" + monthToDigit + "-" + bdDayInput.getSelectedItem();
        
        if (pNameInput.getText().equals("") || HcnInput.getText().equals("") || smokerInput.getSelectedValue() == null || genderInput.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Must enter name, healthcare number, smoker status and gender.");
            } else {
                dconn.Registration(pNameInput.getText(), Integer.parseInt(HcnInput.getText()),phoneInput.getText(),allergyInput.getText(),famHistoryInput.getText(),smokerInput.getSelectedValue(),
                birthday, (String) genderInput.getSelectedItem(),pecInput.getText(),cityInput.getText(),provinceInput.getSelectedValue(),addressInput.getText());
        successText.setText("Patient Registered");
            }

    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }

    private void createApptButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setAppointmentView(new AppointmentView());
        mainView.setCard(5);
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField HcnInput;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField allergyInput;
    private javax.swing.JLabel allergyLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> bdDayInput;
    private javax.swing.JComboBox<String> bdMonthInput;
    private javax.swing.JLabel bdMonthLabel;
    private javax.swing.JComboBox<String> bdYearInput;
    private javax.swing.JLabel birthdateLabel;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton createApptButton;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField famHistoryInput;
    private javax.swing.JLabel famHistoryLabel;
    private javax.swing.JComboBox<String> genderInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hcnLabel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JTextField pecInput;
    private javax.swing.JLabel pecLabel;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JList<String> provinceInput;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JButton registerPatient;
    private javax.swing.JList<String> smokerInput;
    private javax.swing.JLabel smokerLabel;
    private javax.swing.JLabel step1Label;
    private javax.swing.JLabel successText;
    private javax.swing.JLabel yearLabel;



    //Added by SR
    private Create_DB dconn;
    // End of variables declaration
}
