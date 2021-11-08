package br.com.bicicletarios.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.bicicletarios.model.BicicletarioModel;
import br.com.bicicletarios.remote.BicicletarioRemote;

@Stateless
public class BicicletarioDAO implements BicicletarioRemote {

	@PersistenceContext
	private EntityManager em;

	public List<BicicletarioModel> listarBicicletarios() {
		return em.createQuery("select r from BicicletarioModel r", BicicletarioModel.class).getResultList();
	}

	@Override
	public BicicletarioModel getBicicletarioModel(long id) {
		return getTodosBicicletarios().get((int) id);
	}

	@Override
	public void salvar(BicicletarioModel bicicletarioModel) {
		em.persist(bicicletarioModel);
	}

	@Override
	public void remover(Long id) {
		BicicletarioModel bikeHome = em.find(BicicletarioModel.class, id);
		em.remove(bikeHome);
	}

	@Override
	public void atualizarBicicletarioModel(BicicletarioModel bicicletario) {
		em.merge(bicicletario);
	}

	@Override
	public List<BicicletarioModel> getTodosBicicletarios() {
		return em.createQuery("SELECT * FROM Bicicletario", BicicletarioModel.class).getResultList();
	}

	@Override
	public BicicletarioModel consultarPorId(Long id) {
		return em.find(BicicletarioModel.class, id);
	}

	@Override
	public BicicletarioModel adicionaBicicletario(BicicletarioModel bicicletario) throws Exception {
		return null;
	}

}
