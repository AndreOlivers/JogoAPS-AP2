package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import dao.JogoDao;
import entidade.Jogo;

@ManagedBean
public class JogoBean {

	private Jogo jogo = new Jogo();
	private List<Jogo> lista; 
	private List<Jogo> numerosAleatorios;

	public String salvar() { 
		try {
			JogoDao.salvar(jogo);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso",
					"O " + jogo.getDescricao() + "foi Salvo com sucesso."));
			jogo = new Jogo();
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Erro ao salvar o Jogo"));
		}
		return "lista";
	}

	public String editar() {
		try {
			JogoDao.editar(jogo);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Jogo editado com sucesso"));

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Erro ao editar a Jogo"));
		}
		return "lista";
	}

	public String excluir() {
		try {
			JogoDao.excluir(jogo);
			lista.remove(jogo);
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Jogo excluido com sucesso"));

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error ao excluir o jogo"));
		}
		return null;
	}

	public void buscarValoresPares() {
		try {
			List<Jogo> numerosPares = JogoDao.buscarValoresPares();
			for(Jogo j : numerosPares) {
				j.getClass();
			}
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso",
					"Os números pares são " + numerosPares));

		} catch (Exception e) {

			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Erro ao mostrar os números pares"));
		}
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<Jogo> getLista() {
		if (lista == null) {
			lista = JogoDao.listar();
		}
		return lista;
	}

	public void setLista(List<Jogo> lista) {
		this.lista = lista;
	}

	public List<Jogo> getNumerosAleatorios() {
		if (numerosAleatorios == null) {
			numerosAleatorios = JogoDao.buscarValoresPares();
		}
		return numerosAleatorios;
	}

	public void setNumerosAleatorios(List<Jogo> numerosAleatorios) {
		this.numerosAleatorios = numerosAleatorios;
	}

}
