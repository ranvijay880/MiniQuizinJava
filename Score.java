import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("photoquiz/thank-you.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 100, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for attempting Simple Quiz");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        heading.setForeground(Color.MAGENTA);
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setForeground(Color.MAGENTA);
        add(lblscore);

        JButton submit = new JButton("Attempt Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(Color.cyan);
        submit.addActionListener(this);
        submit.setForeground(Color.MAGENTA);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new login();
    }

    public static void main(String[] args) {

        new Score("User", 0);
    }
}
