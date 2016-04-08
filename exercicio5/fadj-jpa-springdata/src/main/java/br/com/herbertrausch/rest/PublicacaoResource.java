package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Publicacao;
import br.com.herbertrausch.domain.PublicacaoService;

@Path("/publicacao")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PublicacaoResource {
	
	public PublicacaoService publicacaoService = new PublicacaoService();
	
	//todos//
	@GET
	public List<Publicacao> get() {
		List<Publicacao> publicacoes = publicacaoService.getPublicacoes();
		return publicacoes;
	}
	
	//pagina//
	@GET
	@Path("/pagina/{pagina}")
	public List<Publicacao> getByPagina(@PathParam("pagina") String pagina) {
		List<Publicacao> publicacoes = publicacaoService.getPublicacaoByPagina(pagina);
		return publicacoes;
	}
	
	//id//
	@GET
	@Path("/id/{id}")
	public Publicacao get(@PathParam("id") long id) {
		Publicacao p = publicacaoService.getPublicacao(id);
		return p;
	}
}
