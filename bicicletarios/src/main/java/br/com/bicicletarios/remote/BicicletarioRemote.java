package br.com.bicicletarios.remote;

import java.util.List;
import javax.ejb.Remote;
import br.com.bicicletarios.model.BicicletarioModel;


@Remote
public interface BicicletarioRemote {

	public BicicletarioModel adicionaBicicletario(BicicletarioModel bicicletario) throws Exception;
	
	public BicicletarioModel getBicicletarioModel(long id);
	
	public void salvar(BicicletarioModel bicicletarioModel);
	
    public void remover(Long id);
    
    public void atualizarBicicletarioModel(BicicletarioModel bicicletario);
    
    public List<BicicletarioModel> getTodosBicicletarios();
    
    public BicicletarioModel consultarPorId(Long id);
}
