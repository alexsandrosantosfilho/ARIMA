import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import dao.LocalDao;
import pojo.Local;

public class LocalDaoTeste {

	@Test
	public void insert() {
		/*
		 * Dado: que exitem locais cadastrados
		 * Quando: informo um local para inserir
		 * Então: insere o local
		 * 
		 */
		Local local = new Local();
		LocalDao dao = new LocalDao();

		dao.insert(local);
		assertNotEquals("Não foi inserido", local.getId(), 0);	
		
		Local localConsulta = dao.consultById(local.getId());
		assertSame("Consulta falhou",local, localConsulta);
		

	}
	
	
	
	@Test
	public void remove() {
		/*
		 * Dado: que exitem locais cadastrados
		 * Quando: informo um local para deletar
		 * Então: Deleta o local
		 * 
		 */
		Local local = new Local();
		LocalDao dao = new LocalDao();
		dao.insert(local);
		assertNotEquals("Não foi inserido", local.getId(), 0);	
		dao.remove(local);
		assertNotNull("Não foi removido", local.getId() );
		
		Local localConsulta = dao.consultById(local.getId());
		assertSame("Consulta falhou",local, localConsulta);
		
	}
	
	@Test
	public void update() {
	
		Local local = new Local();
		LocalDao dao = new LocalDao();
		dao.insert(local);
		assertNotEquals("Não foi inserido", local.getId(), 0);
		local.setCusto(20);
		dao.update(local);
		Local localConsulta = dao.consultById(local.getId());
		assertNotSame("Consulta falhou",local, localConsulta);
		
	}

}
