package br.ufc.crateus.agritech.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "agricultor")
public class Agricultor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	private String registroRural;
	private String endereco;
	private String localizacao;
	private String uf;
	private String cpf;
	private String telefone;
	private String email;
	
	@OneToMany(mappedBy = "agricultor", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<Produto> produtos;
	
	public Agricultor() {
		super();
	}

	public Agricultor(String nome, String registroRural, String endereco, String localizacao, String uf, String cpf,
			String telefone, String email) {
		super();
		this.nome = nome;
		this.registroRural = registroRural;
		this.endereco = endereco;
		this.localizacao = localizacao;
		this.uf = uf;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistroRural() {
		return registroRural;
	}

	public void setRegistroRural(String registroRural) {
		this.registroRural = registroRural;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonIgnore
	public Set<Produto> getProdutos() {
		return produtos;
	}

	@JsonProperty
	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Agricultor [id=" + id + ", nome=" + nome + ", registroRural=" + registroRural + ", endereco=" + endereco
				+ ", localizacao=" + localizacao + ", uf=" + uf + ", cpf=" + cpf + ", telefone=" + telefone + ", email="
				+ email + ", produtos=" + produtos + "]";
	}
	
	
}
