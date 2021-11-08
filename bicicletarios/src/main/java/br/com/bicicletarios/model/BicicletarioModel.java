package br.com.bicicletarios.model;

import java.util.Objects;

public class BicicletarioModel {

	private long id;
	private String nome;
	private String cidade;
	private String uf;
	
	public BicicletarioModel() {};
	
	public BicicletarioModel(long id, String nome, String cidade, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.uf = uf;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cidade, id, nome, uf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BicicletarioModel other = (BicicletarioModel) obj;
		return Objects.equals(cidade, other.cidade) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(uf, other.uf);
	}
	@Override
	public String toString() {
		return "BicicletarioModel [id=" + id + ", nome=" + nome + ", cidade=" + cidade + ", uf=" + uf + "]";
	}

}
