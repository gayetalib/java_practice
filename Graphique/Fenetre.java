import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;

/**
 * Fenetre
 */
public class Fenetre extends JFrame implements ActionListener {

    public JPanel panel;
    public JTextField texte;
    public JButton button1, button2;

    public Fenetre(String titre) {
        this.setTitle(titre); // super("titre")
        this.setSize(650, 400);

        panel = new JPanel();
        Container contenu = this.getContentPane();
        contenu.add(panel);
        panel.add(new JLabel("Entrer un nombre : "));
        panel.add(texte = new JTextField(10));
        panel.add(button1 = new JButton("Doubler"));
        panel.add(button2 = new JButton("Annuler"));
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            double x = Double.parseDouble(texte.getText());
            x = x * 2;
            texte.setText("" + x);
        } else if (e.getSource() == button2) {
            this.dispose();
            System.exit(0); // detruire fenetre et arreter programme
        }

    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("ACEP -  Comptabilité");
        fenetre.setVisible(true);
    }

}