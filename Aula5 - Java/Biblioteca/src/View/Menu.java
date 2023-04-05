package View;

import javax.swing.*;

import javax.swing.JTextArea;
import Controller.ControladorLivro;
import Model.Livro;

import java.awt.*;
import java.awt.event.*;

public class Menu extends JDialog {
	
	private ControladorLivro controlador;

    private JPanel cadastroPanel, relatorioPanel;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public Menu() {
        controlador = new ControladorLivro();
        setBounds(100, 100, 559, 400);
        getContentPane().setLayout(new BorderLayout());

        // Cria os painéis
        cadastroPanel = new JPanel();
        cadastroPanel.setLayout(null);
        JLabel label_1 = new JLabel("Painel de Cadastro");
        label_1.setBounds(199, 10, 190, 14);
        cadastroPanel.add(label_1);

        relatorioPanel = new JPanel();
        relatorioPanel.setLayout(new BorderLayout());
        JLabel label_2 = new JLabel("Painel de Relatório");
        relatorioPanel.add(label_2, BorderLayout.NORTH);
        
        
        JTextArea textArea = new JTextArea();
        textArea.setText(controlador.listarLivros());
        relatorioPanel.add(textArea);
        
        

        // Adiciona os painéis ao contentPane
        getContentPane().add(cadastroPanel, BorderLayout.CENTER);
        getContentPane().add(relatorioPanel, BorderLayout.NORTH);
        
        // Adiciona os componentes ao painel de cadastro
        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setBounds(30, 65, 70, 22);
        cadastroPanel.add(lblNewLabel);
        
        JLabel lblDescricao = new JLabel("Descricao:");
        lblDescricao.setBounds(30, 102, 70, 22);
        cadastroPanel.add(lblDescricao);
        
        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(30, 133, 70, 22);
        cadastroPanel.add(lblQuantidade);
        
        textField = new JTextField();
        textField.setBounds(88, 67, 378, 20);
        cadastroPanel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(98, 104, 378, 20);
        cadastroPanel.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(108, 135, 358, 20);
        cadastroPanel.add(textField_2);
        
        JButton btnNewButton = new JButton("Cadastrar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Pega os valores dos campos do formulário
                String nome = textField.getText();
                String descricao = textField_1.getText();
                int quantidade = Integer.parseInt(textField_2.getText());
               
    			
    			boolean sucesso = controlador.adicionarLivro(nome, descricao, quantidade);

                // Verifica se o livro foi adicionado com sucesso
                if (sucesso) {
                	JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar livro.");
                }     
            }
        });
        btnNewButton.setBounds(214, 180, 89, 23);
        cadastroPanel.add(btnNewButton);
        
        
        // Cria a barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

   
        JButton btnCadastro = new JButton("Cadastro");
        btnCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Foi");
                // Esconder o painel de relatório e mostrar o painel de cadastro
                relatorioPanel.setVisible(false);
                cadastroPanel.setVisible(true);
                getContentPane().revalidate();
            }
        });
        menuBar.add(btnCadastro);

     
        JButton btnRelatorio = new JButton("Relatório");
        btnRelatorio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 
            	        cadastroPanel.setVisible(false);
            	        relatorioPanel.setVisible(true);
            	        textArea.setText(controlador.listarLivros());
            	        relatorioPanel.add(textArea, BorderLayout.CENTER);
            	        getContentPane().revalidate();
            }
        });
        menuBar.add(btnRelatorio);
        relatorioPanel.setVisible(false);
    }

    public static void main(String[] args) {
        try {
            Menu dialog = new Menu();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
