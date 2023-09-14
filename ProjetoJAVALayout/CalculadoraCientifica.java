import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraCientifica extends JFrame implements ActionListener {
    // Componentes
    private JTextField textField;
    private String input = "";

    public CalculadoraCientifica() {
        // Configuração do JFrame
        setTitle("Calculadora Científica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Painel principal com GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));

        // Campo de texto
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        // Botões
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "sin", "cos", "tan", "^2",
            "sqrt", "log", "ln", "π"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
            panel.add(button);
        }

        // Adiciona os componentes ao JFrame
        add(textField, BorderLayout.NORTH);
        add(panel);

        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if ("=".equals(command)) {
            try {
                double result = evaluateExpression(input);
                textField.setText(String.valueOf(result));
            } catch (Exception ex) {
                textField.setText("Erro");
            }
            input = "";
        } else if ("C".equals(command)) {
            textField.setText("");
            input = "";
        } else {
            input += command;
            textField.setText(input);
        }
    }

    private double evaluateExpression(String expression) {
        // Implemente a lógica de avaliação da expressão aqui (usando bibliotecas Java ou código personalizado)
        // Retorna o resultado da expressão como um double
        return 0.0; // Altere isso com a lógica real de avaliação
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraCientifica().setVisible(true);
        });
    }
}
