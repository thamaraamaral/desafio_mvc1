package com.gft.milhas.interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gft.milhas.entities.Evento;

@Component
public interface IEventoRepository {

		void create(Evento evento) throws Exception;

		void update(Evento evento) throws Exception;

		void delete(Evento evento) throws Exception;

		List<Evento> findAll(Date dataMin, Date dataMax) throws Exception;
		
		List<String> findEventosPorNome() throws Exception;

		List<Integer> findEventosPorId() throws Exception;
		
		Evento findById(Integer idEvento) throws Exception;
		
		
	}