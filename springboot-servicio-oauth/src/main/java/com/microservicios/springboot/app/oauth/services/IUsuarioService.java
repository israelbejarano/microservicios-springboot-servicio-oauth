package com.microservicios.springboot.app.oauth.services;


import com.microservicios.springboot.app.usercom.commons.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
