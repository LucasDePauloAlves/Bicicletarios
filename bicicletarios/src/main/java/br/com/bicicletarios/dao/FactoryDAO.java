package br.com.bicicletarios.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Produces;

@ApplicationScoped
public class FactoryDAO {
	
	@PersistenceContext(unitName = "bicicletarios")
	private EntityManager em;
	
	@Produces
	public ClienteDAO criarClienteDAO() {
		return new ClienteDAO(em);
	}
	
	@Produces
	public BicicletaDAO criarBicicletaDAO() {
		return new BicicletaDAO(em);
	}
}
