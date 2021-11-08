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

import br.com.bicicletarios.dao.BicicletarioDAO;
import br.com.bicicletarios.model.BicicletaModel;
import br.com.bicicletarios.model.BicicletarioModel;
import br.com.bicicletarios.service.BicicletarioService;

@Stateless
@Path(value = "Bicicleta")
public class BicicletarioController {

	BicicletarioDAO bicicletarioDAO = new BicicletarioDAO();
	BicicletarioService bicicletarioService = new BicicletarioService();

	@GET
	@Path(value = "retornaBicicletario")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllBicicletarios() {
		List<BicicletarioModel> bikesHome = bicicletarioService.listarBicicletarios();
		return Response.ok(bikesHome).build();
	}

	public List<BicicletarioModel> getTodosClientes(BicicletaModel bike) {
		return bicicletarioDAO.getTodosBicicletarios();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(value = "AddBicicletas")
	public Response adicionaBicicletario(BicicletarioModel bicicletarioModel) {
		try {
			bicicletarioService.postBicicletario(bicicletarioModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Status.CREATED).build();
	}
}
