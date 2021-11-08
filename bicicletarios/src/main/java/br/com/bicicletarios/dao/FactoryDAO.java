package br.com.bicicletarios.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class FactoryDAO {
	
	@PersistenceContext(unitName = "bicicletarios")
	private EntityManager em;
	
}
