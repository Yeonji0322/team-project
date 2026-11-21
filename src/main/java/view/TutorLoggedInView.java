package view;

import javax.swing.*;
import java.awt.*;

public class TutorLoggedInView extends JFrame {
    private String name = "Tutor"; //placeholder until controller, entities and interactor are implemented.

    public TutorLoggedInView() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Home");
            frame.setSize(600, 800);
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(Box.createRigidArea(new Dimension(0, 30)));

            JLabel welcome = new JLabel("Welcome, " + name + "!");
            welcome.setFont(new Font("Times", Font.ITALIC, 40));
            welcome.setAlignmentX(JComponent.CENTER_ALIGNMENT);
            panel.add(welcome);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));

            JButton view = new JButton("View Profile");
            view.setSize(30, 20);
            view.setAlignmentX(JComponent.CENTER_ALIGNMENT);
            panel.add(view);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

            JButton edit = new JButton("Edit Profile");
            edit.setAlignmentX(JComponent.CENTER_ALIGNMENT);
            edit.setSize(30, 20);
            panel.add(edit);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

            JButton logout = new JButton("Log Out");
            logout.setAlignmentX(JComponent.CENTER_ALIGNMENT);
            logout.setSize(30, 20);
            panel.add(logout);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

            panel.add(Box.createVerticalGlue());
            frame.add(panel);
            frame.setVisible(true);
            panel.setVisible(true);
        });
    }

    public static void main(String[] args) {SwingUtilities.invokeLater(() -> new TutorLoggedInView());}

}
