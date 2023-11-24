import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;

public class ExemploNomeSobrenome extends JFrame {
    //atributos
   private JTextField caixaNome;
   private JTextField caixaSobrenome;
   private JLabel texto;
    //construtor
    public ExemploNomeSobrenome(){
        super("Exemplo 1 Eventos");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        // criar o painel principal -> gridLayout 3x2
        //dividiu a tela em 3 linhas e 2 colunas
        JPanel mainPanel = new JPanel(new GridLayout(3,2));
        this.add(mainPanel);
        //criar os componentes
        mainPanel.add(new JLabel("Nome:"));
        caixaNome = new JTextField();
        mainPanel.add(caixaNome);
        mainPanel.add(new JLabel("Sobrenome:"));
        caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);
        JButton botao = new JButton("Concatenar");
        mainPanel.add(botao);
        texto = new JLabel();
        mainPanel.add(texto);
        //set do frame
        this.setVisible(true);
        //tratamento de eventos (3 formas)
        //1ª forma: e->{colocar o evento aqui} /callback
      botao.addActionListener (e->{ //listener(ouvinte/fofoqueira)
            //evento
           texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
    });

        //2ª forma: " new ActionListener" -> actionPerformed(ActionEvent)
      // botao.addActionListener(new ActionListener() {
         //  public void actionPerformed(ActionEvent e){
                //evento
            //    texto.setText(caixaNome.getText() +" " + caixaSobrenome.getText());
            //    caixaNome.setText("");
           //     caixaSobrenome.setText("");
         //   }
      //  });
     // Handler evt = new Handler();
     // botao.addActionListener(evt);//Listener
}

      //3ª forma: Handler(manipulador)
      //vou criar uma classe para tratar o evento -> chamar o Listener
    //criar a classe handler
   // public class Handler implements ActionListener{
    //    @Override
      //  public void actionPerformed(ActionEvent e){
            //event
         //    texto.setText(caixaNome.getText() +" " + caixaSobrenome.getText());
          //     caixaNome.setText("");
          //     caixaSobrenome.setText("");
        }
    //}
//}