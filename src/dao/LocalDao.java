package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.Local;

public class LocalDao {

	private ArrayList<Local> locais;

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

}
