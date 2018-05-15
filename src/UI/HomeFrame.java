package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.CadastroDao;
import dao.LocalDao;
import pojo.Cadastro;
import pojo.Local;

public class HomeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

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
		// setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 390);
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
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro= new Cadastro();
					cadastro.setNome_contato(textField_3.getText());
					cadastro.setTelefone(textField_2.getText());
					cadastro.setEmail(textField_1.getText());			
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				    
//				    Date parsed=null;
//					try {
//						parsed = (Date) sdf.parse(textField.getText());
//						System.out.println("log no try");
//					} catch (ParseException e) {
//						e.printStackTrace();
//						System.out.println("log no catc");
//
//					}
//					System.out.println("log no fora");
//
//				   Date data = new Date(parsed.getTime());
//				   cadastro.setDataAtualizacao(data);	
				   
				   LocalDao localDao = new LocalDao();
				   localDao.insert(cadastro);
				   
			}
		});
		btnSalvar.setBounds(20, 174, 89, 23);
		contentPane.add(btnSalvar);
		

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(143, 174, 89, 23);
		contentPane.add(btnAtualizar);

		table = new JTable();
		table.setSelectionForeground(Color.MAGENTA);
		table.setBounds(333, 223, 203, -159);
		contentPane.add(table);
		
		JLabel lblCadastrarLocalizao = new JLabel("Cadastrar Localiza\u00E7\u00E3o");
		lblCadastrarLocalizao.setForeground(new Color(60, 179, 113));
		lblCadastrarLocalizao.setFont(new Font("Old English Text MT", Font.PLAIN, 24));
		lblCadastrarLocalizao.setBounds(250, 11, 203, 44);
		contentPane.add(lblCadastrarLocalizao);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Digite Seu Nome");
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(343, 60, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(260, 63, 46, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblCidade = new JLabel("cidade");
		lblCidade.setBounds(260, 88, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("estado");
		lblEstado.setBounds(260, 113, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(260, 138, 116, 14);
		contentPane.add(lblPais);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(260, 163, 116, 14);
		contentPane.add(lblNumero);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(343, 85, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(343, 110, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(343, 135, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(343, 160, 86, 20);
		contentPane.add(textField_8);
		
		JLabel lblCadastro_1 = new JLabel("Cadastro");
		lblCadastro_1.setForeground(new Color(60, 179, 113));
		lblCadastro_1.setFont(new Font("Old English Text MT", Font.PLAIN, 24));
		lblCadastro_1.setBounds(500, 11, 203, 44);
		contentPane.add(lblCadastro_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(510, 63, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(510, 88, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail_1 = new JLabel("E-mail");
		lblEmail_1.setBounds(510, 113, 46, 14);
		contentPane.add(lblEmail_1);
		
		JLabel lblDataDeAtualizao = new JLabel("Data de atualiza\u00E7\u00E3o");
		lblDataDeAtualizao.setBounds(510, 138, 116, 14);
		contentPane.add(lblDataDeAtualizao);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("Digite Seu Nome");
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(566, 60, 86, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(566, 85, 86, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(566, 110, 86, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(617, 135, 86, 20);
		contentPane.add(textField_12);
		
		JLabel lblCadastroDePessoa = new JLabel("Cadastro de pessoa Juridica");
		lblCadastroDePessoa.setForeground(new Color(60, 179, 113));
		lblCadastroDePessoa.setFont(new Font("Old English Text MT", Font.PLAIN, 20));
		lblCadastroDePessoa.setBounds(651, 12, 235, 44);
		contentPane.add(lblCadastroDePessoa);
		
		textField_13 = new JTextField();
		textField_13.setToolTipText("Digite Seu Nome");
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(790, 60, 86, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(790, 85, 86, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(790, 110, 86, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(790, 135, 86, 20);
		contentPane.add(textField_16);
		
		JLabel lblIdcadastropj = new JLabel("id_cadastroPJ");
		lblIdcadastropj.setBounds(734, 63, 46, 14);
		contentPane.add(lblIdcadastropj);
		
		JLabel lblIdcad = new JLabel("id_cad");
		lblIdcad.setBounds(733, 88, 46, 14);
		contentPane.add(lblIdcad);
		
		JLabel lblCnpj = new JLabel("Cnpj");
		lblCnpj.setBounds(733, 113, 46, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblRazaosocial = new JLabel("razao_social");
		lblRazaosocial.setBounds(733, 138, 116, 14);
		contentPane.add(lblRazaosocial);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CadastroDao l = new CadastroDao();
				ArrayList<Cadastro> listLocais = (ArrayList<Cadastro>) l.get();		
				for(int i=0; i<listLocais.size(); i++){
					Cadastro c = listLocais.get(i);
					System.out.println(  c.getID() + ": " + c.getNome_contato() + " " + c.getTelefone()  );
				}
				
			}
		});
		btnNewButton.setBounds(20, 223, 89, 23);
		contentPane.add(btnNewButton);

		Local local = new Local();
		Cadastro cad = new Cadastro();

	}

	private void setCadastro(Cadastro cad) {
		// TODO Auto-generated method stub

	}
}
