package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Usuario;
import br.com.herbertrausch.domain.UsuarioService;

@Path("/usuario")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class UsuarioResource {
	public UsuarioService usuarioService = new UsuarioService();
	
	//todos//
	@GET
	public List<Usuario> get() {
		List<Usuario> usuarios = usuarioService.getUsuarios();
		return usuarios;
	}
	
	//nome//
	@GET
	@Path("/nome/{nome}")
	public List<Usuario> get(@PathParam("nome") String nome) {
		List<Usuario> u = usuarioService.getUsuarioByNome(nome);
		return u;
	}
}
