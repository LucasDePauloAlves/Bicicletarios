package br.com.bicicletarios.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class ClienteModel implements Serializable {

	private static final long serialVersionUID = 1L; //teste de commit

	@Id
	@Column(name = "ID", length = 6)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "NOME", length = 60)
	private String nome;

	@Column(name = "CPF", length = 11)
	private String cpf;

	@Column(name = "CIDADE", length = 30)
	private String cidade;

	@Column(name = "UF", length = 2)
	private String uf;

	public ClienteModel(){};

	public ClienteModel(long id, String nome, String cpf, String cidade, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		return Objects.hash(cidade, cpf, id, nome, uf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteModel other = (ClienteModel) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(cpf, other.cpf) && id == other.id
				&& Objects.equals(nome, other.nome) && Objects.equals(uf, other.uf);
	}

	@Override
	public String toString() {
		return "ClienteModel [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cidade=" + cidade + ", uf=" + uf + "]";
	}

}
