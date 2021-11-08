package br.com.bicicletarios.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.bicicletarios.model.BicicletaModel;
import br.com.bicicletarios.remote.BicicletaRemote;

@Stateless
public class BicicletaDAO implements BicicletaRemote {

	@PersistenceContext
	private EntityManager em;

	public List<BicicletaModel> listarBicicletas() {
		return em.createQuery("select f from BicicletaModel f", BicicletaModel.class).getResultList();
	}

	@Override
	public void salvar(BicicletaModel bicicletaModel) {
		em.persist(bicicletaModel);
	}

	@Override
	public void remover(Long id) {
		BicicletaModel bike = em.find(BicicletaModel.class, id);
		em.remove(bike);
	}

	@Override
	public BicicletaModel consultarPorId(Long id) {
		return em.find(BicicletaModel.class, id);
	}

	@Override
	public List<BicicletaModel> getTodasBicicletas() {
		return em.createQuery("SELECT * FROM Bicicletas", BicicletaModel.class).getResultList();
	}

	@Override
	public BicicletaModel getBicicletaModel(long id) {
		return getTodasBicicletas().get((int) id);
	}

	@Override
	public void atualizarBicicletaModel(BicicletaModel bike) {
		em.merge(bike);
	}

	@Override
	public BicicletaModel adicionaBicicleta(BicicletaModel bike) throws Exception {
		return null;
	}

}
