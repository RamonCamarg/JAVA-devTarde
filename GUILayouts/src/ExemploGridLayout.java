import javax.swing.BoxLayout;
import java.awt.*;
import javax.swing.*;
public class ExemploGridLayout extends JFrame{
    public ExemploGridLayout(){
        super("Janela Principal");
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
        JButton um = new JButton("Botão");
        JButton dois = new JButton("Botão");
        JButton tres = new JButton("Botão");
        JButton quatro = new JButton("Botão");
        JButton cinco = new JButton("Botão");
        jpanel.add(um);
        jpanel.add(dois);
        jpanel.add(tres);
        jpanel.add(quatro);
        jpanel.add(cinco);
        JFrame frame = new JFrame();
        frame.getContentPane().add(jpanel);
        frame.pack();
        frame.setVisible(true);
    }
}
