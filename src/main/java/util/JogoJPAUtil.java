package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JogoJPAUtil {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("AP2DAC20221");

	public static EntityManager criarEntityManager() {
		return emf.createEntityManager();
	}
}
