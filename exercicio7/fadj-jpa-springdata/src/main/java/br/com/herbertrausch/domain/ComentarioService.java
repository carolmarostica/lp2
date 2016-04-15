package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class ComentarioService {
private ComentarioRepository db;
	
	public ComentarioService(){

	ApplicationContext context=SpringUtil.getContext();
	db = context.getBean(ComentarioRepository.class);
}


//procurar comentario por comentario//
public List<Comentario> getComentarioByComentario(String c) {
	try {
		
		List<Comentario> comentarios = db.findByComentario(c);
		return comentarios;
		
	} catch (Exception e) {
		e.printStackTrace();
		return new ArrayList<Comentario>();

	}
}

//listar todos//
public List<Comentario> getComentarios() {
	try {
		
		List<Comentario> comentarios = (List<Comentario>) db.findAll();
		return comentarios;
		
	} catch (Exception e) {
		e.printStackTrace();
		return new ArrayList<Comentario>();

	}
}

//FindOne//
public Comentario getComentarios(Long id) {
	try {
		
		Comentario comentarios = db.findOne(id);
		return comentarios;
		
	} catch (Exception e) {
		e.printStackTrace();
		return new Comentario();

	}
}
}
