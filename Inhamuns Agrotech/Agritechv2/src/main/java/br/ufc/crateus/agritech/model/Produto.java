package br.ufc.crateus.agritech.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.ufc.crateus.agritech.helpers.TipoProduto;

@Entity(name="produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	private Integer quantidade;
	private Double valorUnitario;
	private TipoProduto tipo;
	private Double pesoKg;
	

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name= "agricultor_id", nullable = false)
	@JsonIgnore
	private Agricultor agricultor;


	public Produto() {
		super();
	}
	
	
	public Produto(String nome, Integer quantidade, Double valorUnitario, TipoProduto tipo, Double pesoKg,
			Agricultor agricultor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.tipo = tipo;
		this.pesoKg = pesoKg;
		this.agricultor = agricultor;
	}


	public Integer getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	public TipoProduto getTipo() {
		return tipo;
	}


	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}


	public Double getPesoKg() {
		return pesoKg;
	}


	public void setPesoKg(Double pesoKg) {
		this.pesoKg = pesoKg;
	}


	@JsonIgnore
	public Agricultor getAgricultor() {
		return agricultor;
	}


	@JsonProperty
	public void setAgricultor(Agricultor agricultor) {
		this.agricultor = agricultor;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", quantidade=" + quantidade + ", valorUnitario="
				+ valorUnitario + ", tipo=" + tipo + ", pesoKg=" + pesoKg + ", agricultor=" + agricultor + "]";
	}

	
}
