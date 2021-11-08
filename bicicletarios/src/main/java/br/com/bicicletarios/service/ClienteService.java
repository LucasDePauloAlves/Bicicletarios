package br.com.bicicletarios.service;

import java.util.List;
import javax.ejb.Stateless;
import br.com.bicicletarios.DTO.ClienteDTO;
import br.com.bicicletarios.dao.ClienteDAO;
import br.com.bicicletarios.model.ClienteModel;

@Stateless
public class ClienteService { 

	private ClienteDAO clienteDAO;

	public List<ClienteModel> listarClientes() {
		return clienteDAO.listarClientes();
	}

	public void postCliente(ClienteModel clienteModel) {
		clienteDAO.salvar(clienteModel);
	}

	public ClienteDTO convertToClienteDTO(ClienteDTO clienteModel) {
		ClienteDTO clienteDTO = new ClienteDTO();
		
		clienteDTO.setId(clienteModel.getId());
		clienteDTO.setNome(clienteModel.getNome());
		clienteDTO.setCpf(clienteModel.getCpf());
		
		return clienteDTO;
	}

	public ClienteDTO createNewDTO(ClienteDTO clienteModel) {
		ClienteDTO clienteDTO = new ClienteDTO();
		return clienteDTO;
	}

}
