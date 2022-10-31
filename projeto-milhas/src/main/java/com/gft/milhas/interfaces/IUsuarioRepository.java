package com.gft.milhas.interfaces;

import com.gft.milhas.entities.Usuario;

public interface IUsuarioRepository {

	void create(Usuario usuario) throws Exception;
	
	Usuario find(String email) throws Exception;
	
	Usuario find(String email, String senha) throws Exception;
	
}
