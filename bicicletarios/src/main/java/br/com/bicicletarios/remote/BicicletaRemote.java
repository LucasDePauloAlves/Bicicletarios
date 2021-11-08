package br.com.bicicletarios.remote;

import java.util.List;
import javax.ejb.Remote;
import br.com.bicicletarios.model.BicicletaModel;

@Remote
public interface BicicletaRemote {

	public BicicletaModel adicionaBicicleta(BicicletaModel bike) throws Exception;
		
	public BicicletaModel getBicicletaModel(long id);
	
	public void salvar(BicicletaModel bicicletaModel);
	
    public void remover(Long id);
    
    public void atualizarBicicletaModel(BicicletaModel bike);
    
    public List<BicicletaModel> getTodasBicicletas();
    
    public BicicletaModel consultarPorId(Long id);

	

	

		
}
