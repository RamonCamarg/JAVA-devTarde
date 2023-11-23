package View;

import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.VendasDAO;
import Controler.VendasControl;
import Connection.CarrosDAO;
import Connection.ClientesDAO;
import Model.Carros;
import Model.Clientes;
import Model.Vendas;

public class VendasView extends JPanel {

    private JComboBox<String> carrosComboBox;
    private List<Carros> carros;
    private JButton comprar, limpar, historico;
    private JComboBox<String> clienteComboBox;
    private List<Clientes> clientes;
    private List<Vendas> vendas;
    private JTextField dataVenda;
    private JTextField valorCompra;

    private JTable tableClient;
    private DefaultTableModel tableModelClient;
    private int linhaSelecionada = -1; // Valor para quando não selecionar nada

    public VendasView() {
        super();
        new VendasDAO().criaTabela();

        JPanel painelPrinc = new JPanel(new GridLayout(4,4));
        add(painelPrinc);

        // Listar carros cadastrados no JCombobox
        carrosComboBox = new JComboBox<>();
        // Listar clientes cadastrados no JCombobox
        clienteComboBox = new JComboBox<>();

        // Preencha o JComboBox com os campos
        // Carros
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.addItem("Selecionar o carro");
        // Clientes
        clientes = new ClientesDAO().listarClientes();
        clienteComboBox.addItem("Selecionar o cliente");
        // Data Venda
        dataVenda = new JTextField();
        
        // Valor Compra 
        valorCompra = new JTextField();
        

        // Preenche o comboBox
        for (Carros carro : carros) {
            carrosComboBox
                    .addItem(carro.getMarca() + "\t" + carro.getModelo() + "\t" + carro.getPlaca() + "\t"
                            + carro.getAno() + "\t" + carro.getValor());
        }

        for (Clientes cliente : clientes) {
            clienteComboBox.addItem(cliente.getNome() + "\t" + cliente.getCpf());
        }

        // Adiciona os componentes
        painelPrinc.add(new JLabel("Carro: "));
        painelPrinc.add(carrosComboBox);
        painelPrinc.add(new JLabel("Cliente: "));
        painelPrinc.add(clienteComboBox);
        painelPrinc.add(new JLabel("Digite a data da venda: "));
        painelPrinc.add(dataVenda);
        painelPrinc.add(new JLabel("Digite o valor da venda"));
        painelPrinc.add(valorCompra);

        // Criação de um painel para conter os botoes
        JPanel botoes = new JPanel();
        comprar = new JButton("Comprar");
        historico = new JButton("Histórico");
        limpar = new JButton("Limpar");
        painelPrinc.add(botoes);

        botoes.add(comprar);
        botoes.add(limpar);
        botoes.add(historico);

        // tabela de carros
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);

        tableModelClient = new DefaultTableModel(new Object[][] {},
                new String[] { "Data Venda", "Carro Vendido", "Cliente", "Valor de Compra" });
        tableClient = new JTable(tableModelClient);
        jSPane.setViewportView(tableClient);

        // Tratameno de eventos

        clienteComboBox.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                clienteComboBox.removeAllItems();
                clienteComboBox.addItem("Selecionar o cliente");
                for (Clientes cliente : clientes) {
                    clienteComboBox.addItem(cliente.getNome() + " \t" + cliente.getCpf());
                }

            }

        });

        carrosComboBox.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
                carrosComboBox.removeAllItems();
                carrosComboBox.addItem("Selecionar o carro");
                for (Carros carro : carros) {
                    carrosComboBox
                            .addItem(carro.getMarca() + " \t" + carro.getModelo());
                }
            }
        });

        VendasControl control = new VendasControl(vendas, tableModelClient, tableClient);
        comprar.addActionListener(e ->{
            control.cadastrar(dataVenda.getText(), String.valueOf(carrosComboBox.getSelectedItem()), String.valueOf(clienteComboBox.getSelectedItem()), valorCompra.getText());
        });
  

        


        // Criar um VendasDAO para armazenar as funções para meus botoes,
        // Enviar= Inserir ao banco de dados e ao mesmo tempo excluir o carro comprado,
        // mas manter no historico
        // Histórico = Mostrar todos os dados já inseridos dos carros
        // Limpar= limpar os campos, voltar o default. Exemplo: Os comboBoxs voltarem
        // para a primeria linha

    }

}
