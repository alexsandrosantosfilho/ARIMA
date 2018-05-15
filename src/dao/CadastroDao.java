package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import pojo.Cadastro;
import pojo.Local;

public class CadastroDao {

	private ArrayList<Cadastro> cadastros;
	private Connection conn;

	public CadastroDao() {
		this.cadastros = new ArrayList<>();

		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/jaoandmary", "root", "");
		} catch (SQLException e) {
			System.out.println("erro mysql " + e.getSQLState() + e.getMessage());
			e.printStackTrace();
		}

	}

	public void insert(Cadastro cadastro) {

		/*
		 * 
		 * 
		 * //Prepara a instrução SQL PreparedStatement ps =
		 * conexao.prepareStatement(sql); //Executa a instrução SQL
		 * ps.execute();
		 */

		System.out.println(cadastro);
		// our SQL SELECT query.
		// if you only need a few columns, specify them by name instead of using
		// "*"

		PreparedStatement sql = null;

		// create the java statement
		try {
			sql = conn.prepareStatement(
					"INSERT INTO Cadastro (nome, telefone, email, dataAtualizacao ) VALUES (?, ? , ? ,curdate())");
			sql.setString(1, cadastro.getNome_contato());
			sql.setString(2, cadastro.getTelefone());
			sql.setString(3, cadastro.getEmail());
			//sql.setDate(4, cadastro.getDataAtualizacao());

			sql.executeUpdate();
			JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			closeConnection();
		}

	}

	public void remove(Cadastro cadastro) {
		// String sql = "DELETE FROM `cadastro` WHERE `cadastro`.`id_cadastro` =
		// 17";
		PreparedStatement sql = null;

		try {
			sql = conn.prepareStatement("DELETE FROM cadastro WHERE id=?");
			sql.setString(1, cadastro.getNome_contato());
			sql.setString(2, cadastro.getTelefone());
			sql.setString(3, cadastro.getEmail());
			sql.setDate(4, cadastro.getDataAtualizacao());

			JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
		} finally {
			closeConnection();
		}

	}

	public void update(Cadastro cadastro) {
		PreparedStatement sql = null;

		try {
			sql = conn.prepareStatement(
					"UPDATE cadastro SET nome = ? ,telefone = ?,email = ?,dataAtualizacao = ? WHERE id = ?");
			sql.setString(1, cadastro.getNome_contato());
			sql.setString(2, cadastro.getTelefone());
			sql.setString(3, cadastro.getEmail());
			sql.setDate(4, cadastro.getDataAtualizacao());
			sql.setInt(5, cadastro.getID());

			sql.executeUpdate();

			JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
		} finally {
			closeConnection();
		}

	}

	public Local consultById(Integer localId) {
		Local local = new Local();
		return local;
	}

	public List<Cadastro> get() {
		String query = "SELECT id_cadastro, nome, telefone, email, dataAtualizacao FROM cadastro";
		// create the java statement
		Statement st;
		// execute the query, and get a java resultset
		try {
			st = (Statement) this.conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			Cadastro c;
			while (rs.next()) {
				c = new Cadastro();
				c.setEmail(rs.getString("email"));
				c.setID(rs.getInt("id_cadastro"));
				c.setNome_contato(rs.getString("nome"));
				c.setTelefone(rs.getString("telefone"));
				this.cadastros.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.cadastros;
	}

	public Integer getById(Integer localId) {
		return localId;
	}

	public void closeConnection() {

		try {
			this.conn.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erro mysql " + e.getMessage());
		}
	}

}