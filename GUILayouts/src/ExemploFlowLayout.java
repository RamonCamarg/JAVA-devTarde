import javax.swing.JFrame;
import java.awt.*;
public class ExemploFlowLayout extends JFrame{
    public ExemploFlowLayout(){
        JFrame janela = new JFrame("Janela Principal");
        //mudar o layout padrao (grid) -> flow
        FlowLayout flow = new FlowLayout();
        janela.setLayout(flow); //mudei o layout
        //adicionar componentes no layout
        janela.add("Informe o valor");
    }
    
}