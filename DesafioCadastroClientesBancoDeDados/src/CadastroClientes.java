import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClientes extends JFrame implements ActionListener {
    private JTextField nomeField, emailField, cpfField;
    private JButton salvarButton;

    public CadastroClientes() {
        // Configurar o JFrame
        setTitle("Cadastro de Cliente");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Criar componentes
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();
        JLabel emailLabel = new JLabel("E-mail:");
        emailField = new JTextField();
       JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField();
        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(this);

        // Adicionar componentes ao JFrame
        add(nomeLabel);
        add(nomeField);
        add(emailLabel);
        add(emailField);
        add(cpfLabel);
        add(cpfField);
        add(salvarButton);

        // Tornar o JFrame visível
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Lógica para lidar com o evento do botão
        if (e.getSource() == salvarButton) {
            String nome = nomeField.getText();
            String email = emailField.getText();
            String cpf = cpfField.getText();

            // Aqui você pode adicionar a lógica para salvar os dados no banco de dados
            // Por exemplo, você pode chamar um método para inserir os dados em um banco de dados MySQL

            // Exemplo de como exibir uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso:\nNome: " + nome + "\nE-mail: " + email + "\nCPF: " + cpf);

            // Limpar os campos após salvar
            nomeField.setText("");
            emailField.setText("");
            cpfField.setText("");
        }
    }
}
