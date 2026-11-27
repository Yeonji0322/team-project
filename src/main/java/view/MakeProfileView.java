package view;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class MakeProfileView extends JFrame {

    public MakeProfileView() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Customize Profile");
            frame.setSize(600, 800);
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            panel.add(Box.createRigidArea(new Dimension(0, 15)));
            // aesthetic space above
            JLabel title = new JLabel("Profile Information");
            panel.add(title);
            panel.add(Box.createRigidArea(new Dimension(0, 15)));

            JLabel name = new JLabel("Name: ");
            name.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(name);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));

            JTextField nameField = new JTextField(10);
            nameField.setMaximumSize(nameField.getPreferredSize());
            nameField.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(nameField);
            panel.add(Box.createRigidArea(new Dimension(0, 6)));

            JLabel occup = new JLabel("Program:");
            occup.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(occup);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));

            JTextField program = new JTextField(30);
            program.setMaximumSize(program.getPreferredSize());
            program.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(program);
            panel.add(Box.createRigidArea(new Dimension(0, 6)));

            JLabel year = new JLabel("Year:");
            year.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(year);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));

            JTextField yearField = new JTextField(3);
            yearField.setMaximumSize(yearField.getPreferredSize());
            yearField.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(yearField);
            panel.add(Box.createRigidArea(new Dimension(0, 6)));

            JLabel price = new JLabel("Charge/Hour (CAD): ");
            name.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(price);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));

            JTextField priceField = new JTextField(3);
            priceField.setMaximumSize(priceField.getPreferredSize());
            priceField.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(priceField);
            panel.add(Box.createRigidArea(new Dimension(0, 6)));

            JLabel courses = new JLabel("Add Courses:");
            courses.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(courses);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));

            JPanel coursediff = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
            coursediff.setAlignmentX(Component.LEFT_ALIGNMENT);
            JTextField courseField = new JTextField(6);
            JButton addButton = new JButton("+ADD");
            addButton.addActionListener(e -> {

            });
            coursediff.add(courseField);
            coursediff.add(addButton);
            coursediff.setMaximumSize(new Dimension(Integer.MAX_VALUE, coursediff.getPreferredSize().height));
            // bug fix: keep the FlowLayout from expanding
            panel.add(coursediff);
            panel.add(Box.createRigidArea(new Dimension(0, 40)));
            // ...but still put space between for courses to pop up!

            JLabel describe = new JLabel("Description:");
            describe.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));
            panel.add(describe);
            JTextArea description = new JTextArea(9, 6);
            description.setLineWrap(true);
            description.setWrapStyleWord(true);
            // Wrap it inside a JScrollPane for scroll function! :)
            JScrollPane scrollPane = new JScrollPane(description);
            scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
            Dimension boxSize = new Dimension(Integer.MAX_VALUE, 100);
            scrollPane.setPreferredSize(boxSize);
            scrollPane.setMaximumSize(boxSize);
            panel.add(scrollPane);
            panel.add(Box.createRigidArea(new Dimension(0, 30)));

            JLabel contact = new JLabel("Your Contact: ");
            contact.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(contact);
            panel.add(Box.createRigidArea(new Dimension(0, 3)));

            JTextField contactField = new JTextField(30);
            contactField.setMaximumSize(contactField.getPreferredSize());
            contactField.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(contactField);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));

            JButton save = new JButton("SAVE");
            panel.add(save);
            JButton back = new JButton("BACK");
            panel.add(back);

            // take data entered and save to a file
            save.addActionListener(e -> {
                String nameText = nameField.getText().trim();
                String progText = program.getText().trim();
                String yearText = yearField.getText().trim();
                String priceText = priceField.getText().trim();
                String descText = description.getText().trim();
                String contactText = contactField.getText().trim();

                // Save to a text file
                try (FileWriter writer = new FileWriter("profile.txt", true)) {
                    writer.write("Name: " + nameText + "\n");
                    writer.write("Program: " + progText + "\n");
                    writer.write("Year: " + yearText + "\n");
                    writer.write("Price: " + priceText + "\n");
                    writer.write("Description: " + descText + "\n");
                    writer.write("Contact: " + contactText + "\n");

                    // Show success popup
                    JOptionPane.showMessageDialog(frame,  nameText + ", your profile is saved!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file.", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            });

            panel.add(Box.createVerticalGlue());
            frame.add(panel);
            panel.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MakeProfileView());
    }
}