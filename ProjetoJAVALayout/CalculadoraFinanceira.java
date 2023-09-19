import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class BorderLay extends JFrame {
    private JTextField principalField;
    private JTextField rateField;
    private JTextField timeField;
    private JTextField simpleInterestField;
    private JTextField totalAmountField;

    public BorderLay() {
        setTitle("Calculadora Financeira");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel superior para entrada de dados
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Principal:"));
        principalField = new JTextField();
        inputPanel.add(principalField);
        inputPanel.add(new JLabel("Taxa de Juros (%):"));
        rateField = new JTextField();
        inputPanel.add(rateField);
        inputPanel.add(new JLabel("Tempo (anos):"));
        timeField = new JTextField();
        inputPanel.add(timeField);

        // Painel central para o botão de cálculo
        JPanel buttonPanel = new JPanel();
        JButton calculateButton = new JButton("Calcular");
        buttonPanel.add(calculateButton);

        // Painel inferior para exibir o resultado
        JPanel resultPanel = new JPanel(new GridLayout(2, 2));
        resultPanel.add(new JLabel("Juros Simples:"));
        simpleInterestField = new JTextField();
        simpleInterestField.setEditable(false);
        resultPanel.add(simpleInterestField);
        resultPanel.add(new JLabel("Montante Total:"));
        totalAmountField = new JTextField();
        totalAmountField.setEditable(false);
        resultPanel.add(totalAmountField);

        // Adicionar componentes aos painéis
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.CENTER);

        // Configurar o ActionListener para o botão de cálculo
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularJuros();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void calcularJuros() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double taxaJuros = Double.parseDouble(rateField.getText()) / 100.0;
            double tempo = Double.parseDouble(timeField.getText());

            // Cálculo dos juros simples
            double jurosSimples = principal * taxaJuros * tempo;

            // Cálculo do montante total
            double montanteTotal = principal + jurosSimples;

            DecimalFormat df = new DecimalFormat("#.##");
            simpleInterestField.setText("R$" + df.format(jurosSimples));
            totalAmountField.setText("R$" + df.format(montanteTotal));
        } catch (NumberFormatException ex) {
            simpleInterestField.setText("Digite valores válidos para Principal, Taxa de Juros e Tempo.");
            totalAmountField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderLay().setVisible(true);
            }
        });
    }
}
