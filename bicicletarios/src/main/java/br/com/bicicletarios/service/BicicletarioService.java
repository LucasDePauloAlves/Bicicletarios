package br.com.bicicletarios.service;

import java.util.List;
import javax.ejb.Stateless;
import br.com.bicicletarios.dao.BicicletarioDAO;
import br.com.bicicletarios.dto.BicicletarioDTO;
import br.com.bicicletarios.model.BicicletarioModel;

@Stateless
public class BicicletarioService {

	private BicicletarioDAO bicicletarioDAO;

	public List<BicicletarioModel> listarBicicletarios() {
		return bicicletarioDAO.listarBicicletarios();
	}

	public void postBicicletario(BicicletarioModel bicicletarioModel) {
		bicicletarioDAO.salvar(bicicletarioModel);
	}

	public BicicletarioDTO convertToBicicletarioDTO(BicicletarioDTO bicicletarioModel) {
		BicicletarioDTO bicicletarioDTO = new BicicletarioDTO();
		
		bicicletarioDTO.setId(bicicletarioModel.getId());
		bicicletarioDTO.setUf(bicicletarioModel.getUf());

		return bicicletarioDTO;
	}

	public BicicletarioDTO createNewDTO(BicicletarioDTO BicicletarioModel) {
		BicicletarioDTO bicicletarioDTO = new BicicletarioDTO();
		return bicicletarioDTO;
	}
}
