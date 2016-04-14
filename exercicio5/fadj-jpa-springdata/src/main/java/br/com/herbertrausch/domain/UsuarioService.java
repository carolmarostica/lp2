package br.com.herbertrausch.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {
	private UsuarioRepository db;
	
	public UsuarioService(){

	ApplicationContext context=SpringUtil.getContext();
	db = context.getBean(UsuarioRepository.class);
}


//procurar usuario por nome//
public List<Usuario> getUsuarioByNome(String n) {
	try {
		
		List<Usuario> usuarios = db.findByNome(n);
		return usuarios;
		
	} catch (Exception e) {
		e.printStackTrace();
		return new ArrayList<Usuario>();

	}
}

//listar todos//
public List<Usuario> getUsuarios() {
	try {
		
		List<Usuario> usuarios = (List<Usuario>) db.findAll();
		return usuarios;
		
	} catch (Exception e) {
		e.printStackTrace();
		return new ArrayList<Usuario>();

	}
}
}

