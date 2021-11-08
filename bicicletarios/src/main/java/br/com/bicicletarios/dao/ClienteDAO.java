package br.com.bicicletarios.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.bicicletarios.model.ClienteModel;
import br.com.bicicletarios.remote.ClienteRemote;

@Stateless
public class ClienteDAO implements ClienteRemote {

	@PersistenceContext
	private EntityManager em;
	
	public ClienteDAO() {
	};

	public ClienteDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<ClienteModel> listarClientes() {
		return em.createQuery("select c from ClienteModel c", ClienteModel.class).getResultList();
	}
	@Override
	public void salvar(ClienteModel clienteModel) {
		em.persist(clienteModel);
	}

	@Override
	public void remover(Long id) {
		ClienteModel cliente = em.find(ClienteModel.class, id);
		em.remove(cliente);
	}

	@Override
	public ClienteModel consultarPorId(Long id) {
		return em.find(ClienteModel.class, id);
	}
	
	@Override
	public List<ClienteModel> getTodosClientes() {
		return em.createQuery("SELECT * FROM Clientes", ClienteModel.class).getResultList();
	}

	@Override
	public ClienteModel getClienteModel(long id) {
		return getTodosClientes().get((int) id);
	}

	@Override
	public void atualizarClienteModel(ClienteModel cliente) {
		em.merge(cliente);
	}

	@Override
	public ClienteModel adicionaCliente(ClienteModel cliente) throws Exception {
		return null;
	}
}
