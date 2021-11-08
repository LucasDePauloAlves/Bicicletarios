package br.com.bicicletarios.remote;

import java.util.List;
import javax.ejb.Remote;

import br.com.bicicletarios.model.ClienteModel;

@Remote
public interface ClienteRemote {
	
	public ClienteModel adicionaCliente(ClienteModel cliente) throws Exception;
	
	public ClienteModel getClienteModel(long id);
	
	public void salvar(ClienteModel clienteModel);
	
    public void remover(Long id);
    
    public void atualizarClienteModel(ClienteModel cliente);
    
    public List<ClienteModel> getTodosClientes();
    
    public ClienteModel consultarPorId(Long id);
    
}
