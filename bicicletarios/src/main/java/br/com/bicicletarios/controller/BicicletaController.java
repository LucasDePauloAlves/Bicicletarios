package br.com.bicicletarios.controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import br.com.bicicletarios.dao.BicicletaDAO;
import br.com.bicicletarios.model.BicicletaModel;
import br.com.bicicletarios.service.BicicletaService;

@Stateless
@Path(value = "Bicicleta")
public class BicicletaController {

	BicicletaDAO bicicletaDAO = new BicicletaDAO();
	BicicletaService bicicletaService = new BicicletaService();

	@GET
	@Path(value = "retornaBicicletas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllBicicletas() {
		List<BicicletaModel> bikes = bicicletaService.listarBicicletas();
		return Response.ok(bikes).build();
	}

	public List<BicicletaModel> getTodosClientes(BicicletaModel bike) {
		return bicicletaDAO.getTodasBicicletas();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(value = "AddBicicletas")
	public Response adicionaBicicleta(BicicletaModel bicicletaModel) {
		try {
			bicicletaService.postBicicleta(bicicletaModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Status.CREATED).build();
	}
}
