import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;

public class Exercicio1 extends JFrame{
    public Exercicio1() {
        super("Exercicio1 - lista Cards & Tabs");
        //criei um painel principal
        JPanel mainP = new JPanel();
        //setLayout - cardLayout
        CardLayout cl = new CardLayout();
        mainP.setLayout(cl);
        JButton bNext1 = new JButton("Next");
        JButton bNext2 = new JButton("Next");
        JButton bNext3 = new JButton("Next");
        //criar Cards para adicionar ao mainP
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
         card1.add(bNext1);
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.add(bNext2);
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        card3.add(bNext3);
        //add cards ao mainP
        mainP.add(card1);
        mainP.add(card2);
        mainP.add(card3);
        //set do Frame
        this.add(mainP);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //criar ActionListener para o botão
        bNext1.addActionListener(e->{
            cl.next(mainP);
        });
        bNext2.addActionListener(e->{
            cl.next(mainP);
        });
        bNext3.addActionListener(e->{
            cl.next(mainP);
        });
    }
}