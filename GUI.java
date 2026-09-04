import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends Frame implements ActionListener {

    Label l1, l2, l3, title, result;
    TextField t1, t2, t3;
    Button b1, b2;

    StudentRegistration() {

    // Title
    title = new Label("STUDENT REGISTRATION", Label.CENTER);

        Panel p1 = new Panel();
        p1.add(title);

    // Labels
        l1 = new Label("Name");
        l2 = new Label("Roll No");
        l3 = new Label("Branch");
        // TextFields
        t1 = new TextField(15);
        t2 = new TextField(15);
        t3 = new TextField(15);
        // TextField fonts
        t1.setFont(new Font("Arial", Font.PLAIN, 15));
        t2.setFont(new Font("Arial", Font.PLAIN, 15));
        t3.setFont(new Font("Arial", Font.PLAIN, 15));

        // Buttons
        b1 = new Button("Register");
        b2 = new Button("Clear");
        // Fonts
        Font f = new Font("Arial", Font.BOLD, 16);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        b1.setFont(f);
        b2.setFont(f);
    Font titleFont = new Font("Arial", Font.BOLD, 22);
        title.setFont(titleFont);
        // Colors
        setBackground(Color.LIGHT_GRAY);

        title.setBackground(Color.DARK_GRAY);
        title.setForeground(Color.WHITE);
        l1.setBackground(Color.LIGHT_GRAY);
        l2.setBackground(Color.LIGHT_GRAY);
        l3.setBackground(Color.LIGHT_GRAY);
        b1.setBackground(Color.GREEN);
        b2.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);

        // Result label
    result = new Label("", Label.CENTER);
    result.setFont(new Font("Arial", Font.BOLD, 16));
      // Event handling
        b1.addActionListener(this);
        b2.addActionListener(this);
        // Main layout
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        // Form panel
    Panel p2 = new Panel();
        p2.setLayout(new GridLayout(5, 2, 10, 10));
        p2.setBackground(Color.LIGHT_GRAY);

        p2.add(l1);
        p2.add(t1);

        p2.add(l2);
        p2.add(t2);

        p2.add(l3);
        p2.add(t3);

        p2.add(b1);
        p2.add(b2);

        p2.add(result);

    add(p2, BorderLayout.CENTER);
        // Frame settings
        setTitle("Student Registration");
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            if (t1.getText().equals("") ||
                t2.getText().equals("") ||
                t3.getText().equals("")) {

                result.setText("Please fill all fields");

            } else {

                result.setText("Registration Successful!");

                System.out.println("Name: " + t1.getText());
                System.out.println("Roll No: " + t2.getText());
                System.out.println("Branch: " + t3.getText());
            }
        }

        if (e.getSource() == b2) {

            t1.setText("");
            t2.setText("");
            t3.setText("");

            result.setText("");
        }
    }

    public static void main(String[] args) {

        new StudentRegistration();
    }
}