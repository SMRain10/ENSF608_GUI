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
//    private MainMenuView mainMenuView;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public MainView () {
        super("ENSF 608 Hospital Management System");

        loginView = new LoginView();
        adminView = new AdminView();
        patientView = new PatientView();
        doctorView = new DoctorView();
        labTestView = new CreateLabView();
        appointmentView = new AppointmentView();
        nurseView = new NurseView();

        cardLayout = new CardLayout();

        cardPanel = new JPanel(cardLayout);
        cardPanel.add(loginView, "Login");
        cardPanel.add(adminView, "Admin");
        cardPanel.add(patientView, "Patient");
        cardPanel.add(doctorView, "Doctor");
        cardPanel.add(labTestView, "CreateLab");
        cardPanel.add(appointmentView, "Appointment");
        cardPanel.add(nurseView, "Nurse");

        add(cardPanel);
//        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }




    public void setCard(int i) {
        switch (i) {
            case 0:
                cardLayout.show(cardPanel, "Login");
                pack();
                break;
            case 1:
                cardLayout.show(cardPanel, "Admin");
                pack();
                break;
            case 2:
                cardLayout.show(cardPanel, "Patient");
                pack();
                break;
            case 3:
                cardLayout.show(cardPanel, "Doctor");
                pack();
                break;
            case 4:
                cardLayout.show(cardPanel, "CreateLab");
                pack();
                break;
            case 5:
                cardLayout.show(cardPanel, "Appointment");
                pack();
                break;
            case 6:
                cardLayout.show(cardPanel, "Nurse");
                pack();
                break;



        }
    }


//            case 3:
//                cardLayout.show(cardPanel, TICKET_STRING);
//                break;
//            case 4:
//                cardLayout.show(cardPanel, MOVIE_STRING);
//                break;
//            case 5:
//                cardLayout.show(cardPanel, SEAT_STRING);
//                break;
//        }
//    }

}
