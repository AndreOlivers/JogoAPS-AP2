package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidade.Jogo;
import util.JogoJPAUtil;

public class JogoDao {

	public static void salvar(Jogo jogo) {
		EntityManager em = JogoJPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(jogo);
		em.getTransaction().commit();
		em.close();
	}

	public static void editar(Jogo jogo) {
		EntityManager em = JogoJPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.merge(jogo);
		em.getTransaction().commit();
		em.close();
	}

	public static void excluir(Jogo jogo) {
		EntityManager em = JogoJPAUtil.criarEntityManager();
		em.getTransaction().begin();
		jogo = em.find(Jogo.class, jogo.getId());
		em.remove(jogo);
		em.getTransaction().commit();
		em.close();
	}

	public static List<Jogo> listar() {
		EntityManager em = JogoJPAUtil.criarEntityManager();
		Query q = em.createQuery("select j from Jogo j");
		List<Jogo> lista = q.getResultList();
		em.close();
		return lista;
	}

	public static List<Jogo> buscarNumeros() {
		EntityManager em = JogoJPAUtil.criarEntityManager();
		Query q = em.createQuery("select j.valor1, j.valor2, j.valor3, j.valor4, j.valor5, j.valor6, j.valor7, j.valor8, j.valor9, j.valor10 from Jogo j");
		List<Jogo>  listaNumeros = (List<Jogo>) q.getResultList();
		em.close();

		for (Jogo j : listaNumeros)
			System.out.println(j.getV1() + ", " + j.getV2() + ", " + j.getV3() + ", " + j.getV4() + ", " + j.getV5()
					+ ", " + j.getV6() + ", " + j.getV7() + ", " + j.getV8() + ", " + j.getV9() + ", " + j.getV10());

		return listaNumeros;
	}

	public static List<Jogo> buscarValoresPares() {
		EntityManager em = JogoJPAUtil.criarEntityManager();
		String jpql = "select case when j.v1 % 2 = 0 then j.v1 end as v1,\r\n"
				+ "       case when j.v2 % 2 = 0 then j.v2 end as v2, \r\n"
				+ "       case when j.v3 % 2 = 0 then j.v3 end as v3,\r\n"
				+ "       case when j.v4 % 2 = 0 then j.v4 end as v4,\r\n"
				+ "       case when j.v5 % 2 = 0 then j.v5 end as v5,\r\n"
				+ "       case when j.v6 % 2 = 0 then j.v6 end as v6,\r\n"
				+ "       case when j.v7 % 2 = 0 then j.v7 end as v7,\r\n"
				+ "       case when j.v8 % 2 = 0 then j.v8 end as v8,\r\n"
				+ "       case when j.v9 % 2 = 0 then j.v9 end as v9,\r\n"
				+ "       case when j.v10 % 2 = 0 then j.v10  end as v10\r\n"
				+ " from jogo j";
		Query q = em.createQuery(jpql);
		List<Jogo> listaPares = q.getResultList();
		em.close();
		return listaPares;
	}
}
