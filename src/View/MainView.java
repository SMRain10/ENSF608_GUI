package View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    private LoginView loginView;
    private AdminView adminView;
    private PatientView patientView;
    private DoctorView doctorView;
    private CreateLabView labTestView;
    private AppointmentView appointmentView;
    private NurseView nurseView;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private RegisterPatientView registerPatientView;
    private PrescriptionView prescriptionView;

    public MainView() {
        super("ENSF 608 Hospital Management System");
        // Initialize the views
        loginView = new LoginView();
        adminView = new AdminView();
        patientView = new PatientView();
        doctorView = new DoctorView();
        labTestView = new CreateLabView();
        appointmentView = new AppointmentView();
        nurseView = new NurseView();
        registerPatientView = new RegisterPatientView();
        prescriptionView = new PrescriptionView();

        cardLayout = new CardLayout();

        cardPanel = new JPanel(cardLayout);

        add(cardPanel);
        setCard(0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void setCard(int i) {
        switch (i) {
            case 0:
                cardPanel.add(loginView, "Login");
                cardLayout.show(cardPanel, "Login");
                pack();
                break;
            case 1:
                cardPanel.add(registerPatientView, "RegisterPatient");
                cardLayout.show(cardPanel, "RegisterPatient");
                pack();
                break;
            case 2:
                cardPanel.add(patientView, "Patient");
                cardLayout.show(cardPanel, "Patient");
                pack();
                break;
            case 3:
                cardPanel.add(doctorView, "Doctor");
                cardLayout.show(cardPanel, "Doctor");
                pack();
                break;
            case 4:
                cardPanel.add(labTestView, "CreateLab");
                cardLayout.show(cardPanel, "CreateLab");
                pack();
                break;
            case 5:
                cardPanel.add(appointmentView, "Appointment");
                cardLayout.show(cardPanel, "Appointment");
                pack();
                break;
            case 6:
                cardPanel.add(nurseView, "Nurse");
                cardLayout.show(cardPanel, "Nurse");
                pack();
                break;
            case 7:
                cardPanel.add(prescriptionView, "Prescription");
                cardLayout.show(cardPanel, "Prescription");
                pack();
                break;


        }
    }
    //Getter and setters for the views. Used for switching between views from in individual view classes.
    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public AdminView getAdminView() {
        return adminView;
    }

    public void setAdminView(AdminView adminView) {
        this.adminView = adminView;
    }

    public PatientView getPatientView() {
        return patientView;
    }

    public void setPatientView(PatientView patientView) {
        this.patientView = patientView;
    }

    public DoctorView getDoctorView() {
        return doctorView;
    }

    public void setDoctorView(DoctorView doctorView) {
        this.doctorView = doctorView;
    }

    public CreateLabView getLabTestView() {
        return labTestView;
    }

    public void setLabTestView(CreateLabView labTestView) {
        this.labTestView = labTestView;
    }

    public AppointmentView getAppointmentView() {
        return appointmentView;
    }

    public void setAppointmentView(AppointmentView appointmentView) {
        this.appointmentView = appointmentView;
    }

    public NurseView getNurseView() {
        return nurseView;
    }

    public void setNurseView(NurseView nurseView) {
        this.nurseView = nurseView;
    }

    public RegisterPatientView getRegisterPatientView() {
        return registerPatientView;
    }

    public void setRegisterPatientView(RegisterPatientView registerPatientView) {
        this.registerPatientView = registerPatientView;
    }
}