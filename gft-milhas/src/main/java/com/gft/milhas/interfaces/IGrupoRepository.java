package com.gft.milhas.interfaces;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gft.milhas.entities.Evento;
import com.gft.milhas.entities.Grupo;

@Component
public interface IGrupoRepository {

	void create(Grupo grupo) throws Exception;

	void update(Grupo grupo) throws Exception;

	void delete(Grupo grupo) throws Exception;

	Grupo findById(Integer idGrupo) throws Exception;

	List<Grupo> findByNome(String nome) throws Exception;

	List<Grupo> findGruposPorEvento(Evento evento) throws SQLException, Exception;
	
	
}