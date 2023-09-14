import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBorderLayout extends JFrame{
    public ExemploBorderLayout(){
        super("Principal");
        //criando um jpanel e selecionando layout
        JPanel painel1 = new JPanel();
        this.add(painel1);
        //criar os componentes
        painel1.add(new JButton("North"), BorderLayout.NORTH);
        painel1.add(new JButton("West"), BorderLayout.WEST);
        painel1.add(new JButton("South"), BorderLayout.SOUTH);
        painel1.add(new JButton("East"), BorderLayout.EAST);
        painel1.add(new JButton("Center"), BorderLayout.CENTER);
        //set frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}