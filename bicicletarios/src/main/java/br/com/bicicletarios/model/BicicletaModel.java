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
@Table(name = "BICICLETAS")
public class BicicletaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 6)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "CIDADE", length = 30)
	private String cidade;

	@Column(name = "UF", length = 2)
	private String uf;
	
	
	BicicletaModel(){};

	public BicicletaModel(long id, String cidade, String uf) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.uf = uf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		return Objects.hash(cidade, id, uf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BicicletaModel other = (BicicletaModel) obj;
		return Objects.equals(cidade, other.cidade) && id == other.id && Objects.equals(uf, other.uf);
	}

	@Override
	public String toString() {
		return "BicicletaModel [id=" + id + ", cidade=" + cidade + ", uf=" + uf + "]";
	}
}
