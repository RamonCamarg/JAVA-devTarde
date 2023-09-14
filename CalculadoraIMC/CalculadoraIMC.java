package CalculadoraIMC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC extends JFrame implements ActionListener{

    private JTextField pesoTextField, alturaTextField, resultadoTextField;
    private JPanel inputPanel, buttonPanel;

    public CalculadoraIMC() {
        setTitle("Calculadora de IMC");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        buttonPanel = new JPanel(new BorderLayout());

        pesoTextField = createTextField("Peso (kg):");
        alturaTextField = createTextField("Altura (m):");
        resultadoTextField = createTextField("Resultado:");
        resultadoTextField.setEditable(false);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);

        buttonPanel.add(calcularButton, BorderLayout.CENTER);

        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(resultadoTextField, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private JTextField createTextField(String label) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel(label);
        JTextField textField = new JTextField();
        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.CENTER);
        inputPanel.add(panel);
        return textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double peso = Double.parseDouble(pesoTextField.getText());
            double altura = Double.parseDouble(alturaTextField.getText());
            double imc = calcularIMC(peso, altura);
            resultadoTextField.setText(String.format("IMC: %.2f", imc));
        } catch (NumberFormatException ex) {
            resultadoTextField.setText("Entrada inválida");
        }
    }

    private double calcularIMC(double peso, double altura) {
        if (altura == 0) {
            return Double.NaN; // Evita divisão por zero
        }
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraIMC calc = new CalculadoraIMC();
            calc.setVisible(true);
        });
    }
}