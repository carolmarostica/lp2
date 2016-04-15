package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Comentario;
import br.com.herbertrausch.domain.ComentarioService;

@Path("/comentario")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class ComentarioResource {
public ComentarioService comentarioService = new ComentarioService();
	
	//todos//
	@GET
	public List<Comentario> get() {
		List<Comentario> comentarios = comentarioService.getComentarios();
		return comentarios;
	}
	
	////
	@GET
	@Path("/comentario/{comentario}")
	public List<Comentario> get(@PathParam("comentario") String comentario) {
		List<Comentario> c = comentarioService.getComentarioByComentario(comentario);
		return c;
	}
	
	////
		@GET
		@Path("/id/{id}")
		public Comentario get(@PathParam("id") Long id) {
			Comentario c = comentarioService.getComentarios(id);
			return c;
		}
	
	
}
