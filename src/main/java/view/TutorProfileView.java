package view;

import entity.Tutor;
import entity.User;
import entity.UserFactory;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TutorProfileView extends JFrame {
    // placeholder tutor until integration!
    User user = UserFactory.create("user1", "pword");
    List<String> subjects = List.of("CSC108", "STA130", "CSC148", "CSC165");
    Tutor tutor = UserFactory.createTutor("Alex", "hi im a tutor i guess. I got super great grades and can help you too.", "Bioinformatics BSC",2, subjects, 30, "lexi.lubczenko@mail.utoronto.ca");

    public TutorProfileView() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tutor Profile");
            frame.setSize(600, 800);
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            panel.add(Box.createRigidArea(new Dimension(0, 15)));
            // aesthetic space above
            JLabel title = new JLabel("Tutor Information");
            panel.add(title);
            panel.add(Box.createRigidArea(new Dimension(0, 15)));

            JLabel name = new JLabel(tutor.getTutorName());
            name.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(name);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

            JLabel occup = new JLabel(tutor.getProgram() + ", Year " + tutor.getYear());
            occup.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(occup);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

            JLabel price = new JLabel("Hourly Price: " + String.valueOf(tutor.getPrice()));
            price.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(price);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));


            JLabel describe = new JLabel(tutor.getDescription());
            describe.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(describe);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));


            JLabel contact = new JLabel("Contact me!: " + tutor.getContact());
            contact.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(contact);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));

            JButton back = new JButton("BACK");
            panel.add(back);

            // take data entered and save to a file


            panel.add(Box.createVerticalGlue());
            frame.add(panel);
            panel.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TutorProfileView());
    }
}