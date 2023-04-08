package View;

import javax.swing.*;
import java.awt.*;

public class AdminView extends JPanel{
    private JTextField searchField;
    private JButton searchButton;
    private JTable table;
    private JScrollPane scrollPane;

    public AdminView() {
        // create UI components
        JLabel searchLabel = new JLabel("Search");
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        table = new JTable();
        scrollPane = new JScrollPane(table);

        // add event listeners
        searchButton.addActionListener(e -> search());
        
        
        // create layout
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // create sub-panels
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.add(searchLabel);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        // add sub-panels to main panel
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void search() {
        System.out.println("Searching for " + searchField.getText());
    }
}
