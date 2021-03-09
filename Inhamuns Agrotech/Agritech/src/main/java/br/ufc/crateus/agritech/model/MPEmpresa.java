 package br.ufc.crateus.agritech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "mpempresa")
public class MPEmpresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nomeFantasia;
	private String razaoSocial;
	private String endereco;
	private String localizacao;
	private String uf;
	private String cnpj;
	private String telefone;
	private String email;
	
	public MPEmpresa() {
		super();
	}
	
	
	public MPEmpresa(String nomeFantasia, String razaoSocial, String endereco, String localizacao, String uf,
			String cnpj, String telefone, String email) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.localizacao = localizacao;
		this.uf = uf;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	

	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
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


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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


	public Integer getId() {
		return id;
	}


	@Override
	public String toString() {
		return "MPEmpresa [id=" + id + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", endereco="
				+ endereco + ", localizacao=" + localizacao + ", uf=" + uf + ", cnpj=" + cnpj + ", telefone=" + telefone
				+ ", email=" + email + "]";
	}



}
