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
import br.com.bicicletarios.dao.ClienteDAO;
import br.com.bicicletarios.model.ClienteModel;
import br.com.bicicletarios.service.ClienteService;

@Stateless
@Path(value = "Cliente")
public class ClienteController {

	ClienteDAO clienteDAO = new ClienteDAO();
	ClienteService clienteService = new ClienteService();

	@GET
	@Path(value = "retornaClientes")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllClientes() {
		List<ClienteModel> clientes = clienteService.listarClientes();
		return Response.ok(clientes).build();
	}

	public List<ClienteModel> getTodosClientes(ClienteModel cliente) {
		return clienteDAO.getTodosClientes();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path(value = "AddClientes")
	public Response adicionaCliente(ClienteModel clienteModel) {
		try {
			clienteService.postCliente(clienteModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Status.CREATED).build();
	}
}
