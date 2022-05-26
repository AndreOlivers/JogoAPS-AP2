package entidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "Jogo.numerosPares", query =
 * "select case when j.valor1 % 2 = 0 then j.valor1 end as j.valor1," +
 * "case when j.valor2 % 2 = 0 then j.valor2 end as j.valor2," +
 * "case when j.valor3 % 2 = 0 then j.valor3 end asj. valor3," +
 * "case when j.valor4 % 2 = 0 then j.valor4 end as j.valor4," +
 * "case when j.valor5 % 2 = 0 then j.valor5 end as j.valor5, " +
 * "case when j.valor6 % 2 = 0 then j.valor6 end as j.valor6," +
 * "case when j.valor7 % 2 = 0 then j.valor7 end as j.valor7," +
 * "case when j.valor8 % 2 = 0 then j.valor8 end as j.valor8," +
 * "case when j.valor9 % 2 = 0 then j.valor9 end as j.valor9," +
 * "case when j.valor10 % 2 = 0 then j.valor10 end as j.valor10 " +
 * "From Jogo Where id = j") })
 * 
 * @Table(name = "Jogo")
 */
public class Jogo {

	Random rd = new Random();

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "Descricao")
	private String descricao;
	@Column(name = "Data_Criacao")
	@Temporal(TemporalType.DATE)
	private Date dataCriacao = new Date();
	@Column(name = "Valor1")
	private Integer v1 = rd.nextInt(30);
	@Column(name = "Valor2")
	private Integer v2 = rd.nextInt(30);
	@Column(name = "Valor3")
	private Integer v3 = rd.nextInt(30);
	@Column(name = "Valor4")
	private Integer v4 = rd.nextInt(30);
	@Column(name = "Valor5")
	private Integer v5 = rd.nextInt(30);
	@Column(name = "Valor6")
	private Integer v6 = rd.nextInt(30);
	@Column(name = "Valor7")
	private Integer v7 = rd.nextInt(30);
	@Column(name = "Valor8")
	private Integer v8 = rd.nextInt(30);
	@Column(name = "Valor9")
	private Integer v9 = rd.nextInt(30);
	@Column(name = "Valor10")
	private Integer v10 = rd.nextInt(30);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getV1() {
		return v1;
	}

	public void setV1(Integer v1) {
		this.v1 = v1;
	}

	public Integer getV2() {
		return v2;
	}

	public void setV2(Integer v2) {
		this.v2 = v2;
	}

	public Integer getV3() {
		return v3;
	}

	public void setV3(Integer v3) {
		this.v3 = v3;
	}

	public Integer getV4() {
		return v4;
	}

	public void setV4(Integer v4) {
		this.v4 = v4;
	}

	public Integer getV5() {
		return v5;
	}

	public void setV5(Integer v5) {
		this.v5 = v5;
	}

	public Integer getV6() {
		return v6;
	}

	public void setV6(Integer v6) {
		this.v6 = v6;
	}

	public Integer getV7() {
		return v7;
	}

	public void setV7(Integer v7) {
		this.v7 = v7;
	}

	public Integer getV8() {
		return v8;
	}

	public void setV8(Integer v8) {
		this.v8 = v8;
	}

	public Integer getV9() {
		return v9;
	}

	public void setV9(Integer v9) {
		this.v9 = v9;
	}

	public Integer getV10() {
		return v10;
	}

	public void setV10(Integer v10) {
		this.v10 = v10;
	}
}