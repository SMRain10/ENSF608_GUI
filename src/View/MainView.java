package View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    private LoginView loginView;
    private AdminView adminView;
    private PatientView patientView;
    private DoctorView doctorView;
//    private MainMenuView mainMenuView;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public MainView () {
        super("ENSF 608 Hospital Management System");

        loginView = new LoginView();
        adminView = new AdminView();
        patientView = new PatientView();
        doctorView = new DoctorView();

        cardLayout = new CardLayout();

        cardPanel = new JPanel(cardLayout);
        cardPanel.add(loginView, "Login");
        cardPanel.add(adminView, "Admin");
        cardPanel.add(patientView, "Patient");
        cardPanel.add(doctorView, "Doctor");

        add(cardPanel);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }




    public void setCard(int i) {
        switch (i) {
            case 0:
                cardLayout.show(cardPanel, "Login");
                break;
            case 1:
                cardLayout.show(cardPanel, "Admin");
                break;
            case 2:
                cardLayout.show(cardPanel, "Patient");
                break;
            case 3:
                cardLayout.show(cardPanel, "Doctor");
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
