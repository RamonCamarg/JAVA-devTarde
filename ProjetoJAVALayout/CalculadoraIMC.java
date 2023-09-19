import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC extends JFrame {
    private JTextField alturaTextField;
    private JTextField pesoTextField;
    private JLabel resultadoLabel;

    public CalculadoraIMC() {
        setTitle("Calculadora IMC");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel alturaLabel = new JLabel("Altura (m): ");
        alturaTextField = new JTextField(10);
        JLabel pesoLabel = new JLabel("Peso (kg): ");
        pesoTextField = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel("");
        
        //posicionamento dos elementos
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(alturaLabel, gbc);

        gbc.gridx = 1;
        mainPanel.add(alturaTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(pesoLabel, gbc);

        gbc.gridx = 1;
        mainPanel.add(pesoTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(calcularButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(resultadoLabel, gbc);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });

        add(mainPanel);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setVisible(true);
    }

    private void calcularIMC() {
        try {
            double altura = Double.parseDouble(alturaTextField.getText());
            double peso = Double.parseDouble(pesoTextField.getText());

            double imc = peso / (altura * altura);

            resultadoLabel.setText("Seu IMC é: " + String.format("%.2f", imc));
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Por favor, insira valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIMC();
            }
        });
    }
}
