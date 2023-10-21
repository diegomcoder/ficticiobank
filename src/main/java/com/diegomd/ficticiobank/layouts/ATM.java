import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ATM extends JFrame implements ActionListener {
    public ATM() {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(735, 556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("FicticioBank ATM");
        this.getContentPane().setBackground(new Color(0x73000000, true));
        JLabel img = new JLabel(new ImageIcon("src/main/assets/atm-frame.png"));
        img.setHorizontalAlignment(JLabel.LEFT);
        img.setBounds(0,0,720,556);
        this.add(img);
        this.setVisible(true);
    }
}