package br.com.bicicletarios.DTO;

import java.util.Objects;

public class BicicletaDTO {

	private long id;
	private String uf;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, uf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BicicletaDTO other = (BicicletaDTO) obj;
		return id == other.id && Objects.equals(uf, other.uf);
	}
	@Override
	public String toString() {
		return "BicicletaDTO [id=" + id + ", uf=" + uf + "]";
	}

}
