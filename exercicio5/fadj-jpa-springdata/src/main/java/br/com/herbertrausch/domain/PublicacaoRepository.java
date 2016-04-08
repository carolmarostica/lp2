package br.com.herbertrausch.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PublicacaoRepository extends CrudRepository<Publicacao, Long>{

	List<Publicacao> findByPagina(String pagina);

}