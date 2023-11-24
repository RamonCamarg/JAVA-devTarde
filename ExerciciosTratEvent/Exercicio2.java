import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercicio2 extends JFrame {

    public Exercicio2() {
        super("Exercicio 2");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        JPanel primeiroPainel = new JPanel();
        primeiroPainel.add(new JLabel("Letra Digitada"));
        JLabel letra = new JLabel();
        primeiroPainel.add(letra);
        mainPanel.add(primeiroPainel);
        mainPanel.add(new JLabel("Digite seu texto aqui"));
        JTextField caixaTexto = new JTextField();
        mainPanel.add(caixaTexto);
        
    }
}