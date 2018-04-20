package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pojo.Cadastro;
import pojo.Local;

import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTable;

public class HomeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	
	
	
	/**
	 * Create the frame.
	 */
	public HomeFrame() {
		//setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro de locais");
		lblCadastro.setFont(new Font("Old English Text MT", Font.PLAIN, 24));
		lblCadastro.setForeground(new Color(60, 179, 113));
		lblCadastro.setBounds(29, 11, 203, 44);
		contentPane.add(lblCadastro);
		
		JLabel lblLocal = new JLabel("Nome");
		lblLocal.setBounds(20, 63, 46, 14);
		contentPane.add(lblLocal);
		
		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setBounds(20, 88, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(20, 113, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblDataAtualizao = new JLabel("Data Atualiza\u00E7\u00E3o");
		lblDataAtualizao.setBounds(20, 138, 116, 14);
		contentPane.add(lblDataAtualizao);
		
		textField = new JTextField();
		textField.setBounds(146, 135, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 110, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 85, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setToolTipText("Digite Seu Nome");
		textField_3.setBounds(146, 60, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(20, 174, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(143, 174, 89, 23);
		contentPane.add(btnAtualizar);
		
		table = new JTable();
		table.setSelectionForeground(Color.MAGENTA);
		table.setBounds(333, 223, 203, -159);
		contentPane.add(table);
		
		

		Local local = new Local();
		Cadastro cad = new Cadastro();
		
		//Local.setCadastro(cad);
		this.setCadastro(cad);
		
		
		
	}






	private void setCadastro(Cadastro cad) {
		// TODO Auto-generated method stub
		
	}






}
