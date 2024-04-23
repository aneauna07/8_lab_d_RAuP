import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Main extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField textField;
    private JButton btnOK, btnNewGame;
  
    public Main() throws Exception {
        setSize(300,300);
        GridLayout layout = new GridLayout(5, 1);
        JPanel p = new JPanel();
        p.setLayout(layout);
        p.setBorder(BorderFactory
                .createEmptyBorder(15, 15, 15, 15));
        p.add(new JLabel("Input number (1-10):"));
        textField = new JTextField();
        p.add(textField);
        label = new JLabel("You have 3 attempts to guess a number");
        p.add(label);
        JPanel btnPanel = new JPanel();
        btnOK = new JButton("OK");
        btnOK.addActionListener(this);
        btnPanel.add(btnOK);
        p.add(btnPanel);
        btnNewGame = new JButton("New Game");
        btnNewGame.addActionListener(this);
        btnPanel = new JPanel();
        btnPanel.add(btnNewGame);
        p.add(btnPanel);
        add(p,BorderLayout.CENTER);
        setTitle("Guess a number");
    }
  
    public static void main(String[] args)
            throws Exception {

        Main win = new Main();
        win.setDefaultCloseOperation(
                EXIT_ON_CLOSE);
        win.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg) {
      if (arg.getSource() == btnOK)
        textField.setText("OK");
      else
        textField.setText("NewGame");
        
    }
}
