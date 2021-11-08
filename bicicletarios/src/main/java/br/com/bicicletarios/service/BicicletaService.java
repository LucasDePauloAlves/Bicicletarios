package br.com.bicicletarios.service;

import java.util.List;
import javax.ejb.Stateless;
import br.com.bicicletarios.DTO.BicicletaDTO;
import br.com.bicicletarios.dao.BicicletaDAO;
import br.com.bicicletarios.model.BicicletaModel;

@Stateless
public class BicicletaService {

	private BicicletaDAO bicicletaDAO;

	public List<BicicletaModel> listarBicicletas() {
		return bicicletaDAO.listarBicicletas();
	}

	public void postBicicleta(BicicletaModel bicicletaModel) {
		bicicletaDAO.salvar(bicicletaModel);
	}

	public BicicletaDTO convertToBicicletaDTO(BicicletaDTO bicicletaModel) {
		BicicletaDTO bicicletaDTO = new BicicletaDTO();
		
		bicicletaDTO.setId(bicicletaModel.getId());
		bicicletaDTO.setUf(bicicletaModel.getUf());

		return bicicletaDTO;
	}

	public BicicletaDTO createNewDTO(BicicletaDTO BicicletaModel) {
		BicicletaDTO clienteDTO = new BicicletaDTO();
		return clienteDTO;
	}
}
