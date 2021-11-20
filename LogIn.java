mport javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("INPUT");
        frame.setSize(350, 210);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel fnameLabel = new JLabel("First Name: ");
        fnameLabel.setBounds(10,20,80,25);
        panel.add(fnameLabel);
        JTextField userText = new JTextField(40);
        userText.setBounds(100, 20, 165,25);
        panel.add(userText);

        JLabel lnameLabel = new JLabel("Last Name:");
        lnameLabel.setBounds(10,50,80,25);
        panel.add(lnameLabel);
        JTextField userText2 = new JTextField(40);
        userText2.setBounds(100,50,165,25);
        panel.add(userText2);

        JLabel MnameLabel = new JLabel("Middle Name:");
        MnameLabel.setBounds(10,80,80,25);
        panel.add(MnameLabel);
        JTextField userText3 = new JTextField(40);
        userText3.setBounds(100,80,165,25);
        panel.add(userText3);

        JLabel mobileNumLabel = new JLabel("Mobile Number:");
        mobileNumLabel.setBounds(10,80,80,25);
        panel.add(MnameLabel);
        JTextField userText4 = new JTextField(40);
        userText4.setBounds(100,80,165,25);
        panel.add(userText4);

        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setBounds(10,110,90,25);
        panel.add(emailLabel);
        JTextField userText5 = new JTextField(40);
        userText3.setBounds(100,110,165,25);
        panel.add(userText5);

        JButton button = new JButton("SUBMIT All");
        button.setBounds(70 ,140,100,30);
        panel.add(button);

        JButton button2 = new JButton("CLEAR ALL");
        button2.setBounds(170 ,140,100,30);
        panel.add(button2);









        frame.setVisible(true);



	// write your code here
    }
}
