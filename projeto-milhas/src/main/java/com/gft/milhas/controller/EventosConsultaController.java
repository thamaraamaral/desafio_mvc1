package com.gft.milhas.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.milhas.entities.Evento;
import com.gft.milhas.entities.Usuario;
import com.gft.milhas.helpers.DateHelper;
import com.gft.milhas.models.EventoConsultaModel;
import com.gft.milhas.repositories.EventoRepository;

@Controller
public class EventosConsultaController {

	@RequestMapping(value = "/eventos-consulta")
	public ModelAndView consulta() {
		
		ModelAndView modelAndView = new ModelAndView("eventos-consulta");
		
		modelAndView.addObject("model", new EventoConsultaModel());
		return modelAndView;
	}
	
	@RequestMapping(value = "/consultar-eventos", method = RequestMethod.GET)
	public ModelAndView consultarEventos(EventoConsultaModel model, HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView("eventos-consulta");
		
		try {
			
			//capturar o usuário autenticado (sessão)
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario_auth");
			
			//capturar as datas informadas no formulário
			Date dataMin = DateHelper.formatToDate(model.getDataInicio());
			Date dataMax = DateHelper.formatToDate(model.getDataFinal());
			
			//acessando o repositório e consultar as tarefas
			EventoRepository eventoRepository = new EventoRepository();
			List<Evento> lista = eventoRepository.findAll(dataMin, dataMax);
			
			//enviando a lista de tarefas para a página:
			modelAndView.addObject("eventos", lista);
			
			//gerando uma mensagem
			if(lista.size() > 0) {
				modelAndView.addObject("mensagem", lista.size() + " evento(s) encontrado(s) para o período especificado.");
			}
			else {
				modelAndView.addObject("mensagem", "Nenhuma evento foi encontrada para o período especificado.");
			}
		}
		catch(Exception e) {
			//gerando uma mensagem de erro
			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}
		
		modelAndView.addObject("model", model);		
		return modelAndView;
	}
		
	@RequestMapping(value = "/eventos-exclusao")
	public ModelAndView excluirEvento(Long id, HttpServletRequest request) {
		
		ModelAndView modelAndView = new ModelAndView("eventos-consulta");
		
		try {
			
			//capturar o usuário autenticado (sessão)
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario_auth");
			
			Evento evento = new Evento();
			evento.setIdEvento(id);
			
			//excluindo a tarefa
			EventoRepository eventoRepository = new EventoRepository();
			eventoRepository.delete(evento);
			
			modelAndView.addObject("mensagem", "Evento excluído com sucesso.");
		}
		catch(Exception e) {
			//gerando uma mensagem de erro
			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}
		
		modelAndView.addObject("model", new EventoConsultaModel());
		return modelAndView;
	}
	
}
