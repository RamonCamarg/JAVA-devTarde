import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio5 extends JFrame {
    //Atributo 
    int pontuacao = 0;
    //Construtor
    public Exercicio5() {
        super("Exercicio 5- Quiz");
        //Painel principal -> CardLayout
        CardLayout cl = new CardLayout();
        JPanel mainP = new JPanel();
        this.add(mainP); //add painel principal ao frame 
        //criar os cards -> mainP
        //card1 -> Start
        JPanel card1 = new JPanel(cl);
        card1.add(new JLabel("Bem vindo ao jogo"));
        JButton botao1 = new JButton("Começar");
        card1.add(botao1);
        mainP.add(card1, "Start"); //Atribuir o card ao painel principal com nome 
        //card2 -> pergunta 1
        JPanel card2 = new JPanel(cl);
        card2.add(new JLabel("Quem foi o campeão da Copa de 74 ?"));
        JTextField caixa1 = new JTextField(20);
        card2.add(caixa1);
        JButton botao2 = new JButton("Proxima Pergunta");
        card2.add(botao2);
        mainP.add(card2, "P1");
        //card3 -> pergunta 2
        JPanel card3 = new JPanel(cl);
        card3.add(new JLabel("Quem foi o campeão da Copa de 2023 ?"));
        JTextField caixa2 = new JTextField(20);
        card3.add(caixa2);
        JButton botao3 = new JButton("Proxima Pergunta");
        card3.add(botao3);
        mainP.add(card3, "P2");
        //card4 -> pergunta 3
        JPanel card4 = new JPanel(cl);
        card4.add(new JLabel("Quem foi o campeão da Copa de 74 ?"));
        JTextField caixa3 = new JTextField(20);
        card4.add(caixa3);
        JButton botao4 = new JButton("Proxima Pergunta");
        card4.add(botao4);
        mainP.add(card4, "P3");
        //card5 -> pontuacao
        JPanel card5 = new JPanel(cl);
        JLabel pontuacaoFinal = new JLabel();
        card5.add(pontuacaoFinal);
        JButton botao5 = new JButton("Reiniciar");
        card5.add(botao5);
        mainP.add(card5,"Final");
        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //tratemento de eventos
        botao1.addActionListener(e->{
            cl.next(mainP);
        });
        botao2.addActionListener(e->{
            if(caixa1.getText().toLowerCase().equals("alemanha")){
                pontuacao++;
            }
        });
         botao3.addActionListener(e->{
            if(caixa2.getText().toLowerCase().equals("Espanha")){
                pontuacao++;
            }
        });
         botao4.addActionListener(e->{
            if(caixa3.getText().toLowerCase().equals("alemanha")){
                pontuacao++;
            }
            cl.next(mainP);
            caixa2.setText("");
            pontuacaoFinal.setText("Sua Pontuação foi de "+pontuacao);
        });
        botao5.addActionListener(e->{
            cl.first(mainP);
        });
        
    }
}