import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class exam extends JFrame implements ActionListener {
    int i, count = 0, current = 0, x = 1, y = 1, now = 0;
    JButton b2;
    JButton b = new JButton("Next");
    ButtonGroup bg = new ButtonGroup();
    JRadioButton r[] = new JRadioButton[5];
    JFrame f = new JFrame("Online Exam");
    JLabel l = new JLabel();

    exam(String s) {

        f.setSize(500, 500);
        l.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        l.setBounds(400, 100, 1000, 300);
        f.add(l);

        for (i = 0; i < 5; i++) {
            r[i] = new JRadioButton();
            f.add(r[i]);
            bg.add(r[i]);
        }
        r[0].setBounds(400, 300, 200, 20);
        r[0].setFont(new Font("Calibiri", Font.PLAIN, 20));
        r[1].setBounds(400, 350, 200, 20);
        r[1].setFont(new Font("Calibiri", Font.PLAIN, 20));
        r[2].setBounds(400, 400, 200, 20);
        r[2].setFont(new Font("Calibiri", Font.PLAIN, 20));
        r[3].setBounds(400, 450, 200, 20);
        r[3].setFont(new Font("Calibiri", Font.PLAIN, 20));

        b.setFont(new Font("Algerian", Font.PLAIN, 20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setBounds(600, 600, 150, 60);
        b.addActionListener(this);
        f.add(b);
        question();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1500, 800);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            if (check())
                count = count + 1;
            current++;
            question();
            if (current == 9) {
                b.setText("Result");
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;
            // System.out.println("correct ans="+count);
            JOptionPane.showMessageDialog(this, "correct ans=" + count);
            System.exit(0);
        }
    }

    void question() {
        r[4].setSelected(true);
        if (current == 0) {
            l.setText("Que1:What is the PH of H2O?");
            r[0].setText("5");
            r[1].setText("6");
            r[2].setText("7");
            r[3].setText("8");
        }
        if (current == 1) {
            l.setText("Que2:Which of the following gas is reduced in the reductio process?");
            r[0].setText("oxygen");
            r[1].setText("helium");
            r[2].setText("carbon");
            r[3].setText("hydrogen");
        }
        if (current == 2) {
            l.setText("Que3:Which of the following compund is mainly used in hand sanitizer?");
            r[0].setText("aldehyde");
            r[1].setText("acetic acid");
            r[2].setText("alcohol");
            r[3].setText("ketone");
        }
        if (current == 3) {
            l.setText("Que4:What is the SI unt of frequency?");
            r[0].setText("diopter");
            r[1].setText("second");
            r[2].setText("hertz");
            r[3].setText("meter");
        }
        if (current == 4) {
            l.setText("Que5:Acid turns blue litmus paper into which colour?");
            r[0].setText("black");
            r[1].setText("blue");
            r[2].setText("red");
            r[3].setText("orange");
        }
        if (current == 5) {
            l.setText("Que6:Which of the following enzymes is not present in the human stomach?");
            r[0].setText("pepsin");
            r[1].setText("hydrochloric acid");
            r[2].setText("mucus");
            r[3].setText("trypsin");
        }
        if (current == 6) {
            l.setText("Que7:Which of the following gland is present in the human mouth?");
            r[0].setText("adrenal");
            r[1].setText("pitutiary");
            r[2].setText("gonads");
            r[3].setText("salivary");
        }
        if (current == 7) {
            l.setText("Que8:Name the gland which is present above our kidneys?");
            r[0].setText("adrenal");
            r[1].setText("pitutiary");
            r[2].setText("gonads");
            r[3].setText("salivary");
        }
        if (current == 8) {
            l.setText("Que9:What is the basic unit of our neural system?");
            r[0].setText("neutron");
            r[1].setText("neuron");
            r[2].setText("nephron");
            r[3].setText("nucleon");
        }
        if (current == 9) {
            l.setText("Que10:What is the basic unit of our excretory system?");
            r[0].setText("neutron");
            r[1].setText("neuron");
            r[2].setText("nephron");
            r[3].setText("nucleon");
        }
    }

    Boolean check() {
        if (current == 0)
            return (r[2].isSelected());// correct answer ka index fill krna h
        if (current == 1)
            return (r[3].isSelected());
        if (current == 2)
            return (r[2].isSelected());
        if (current == 3)
            return (r[2].isSelected());
        if (current == 4)
            return (r[2].isSelected());
        if (current == 5)
            return (r[3].isSelected());
        if (current == 6)
            return (r[3].isSelected());
        if (current == 7)
            return (r[0].isSelected());
        if (current == 8)
            return (r[1].isSelected());
        if (current == 9)
            return (r[2].isSelected());
        return false;
    }

    public static void main(String[] args) {
        new exam("hello");
    }

}