package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Local;

public class LocalDao {

	private ArrayList<Local> locais;
	private Connection conn;
	
	public LocalDao(){
		this.locais = new ArrayList<>();
		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost" + "user=admin&passoword");
		} catch (SQLException e) {
			System.out.println("erro mysql " + e.getSQLState() + e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void insert(Local local) {
		System.out.println(local);
	}

	public void remove(Local local) {
		System.out.println(local);
	}

	public void update(Local local) {
		System.out.println(local);
	}

	public Local consultById(Integer localId) {
		Local local = new Local();
		return local;
	}

	public List get() {
		return this.locais;
	}

	public Integer getById(Integer localId) {
		return localId;
	}
	
	
	public void closeConnection(){
		
		try {
			this.conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("erro mysql "  + e.getMessage());
		}
	}

}
