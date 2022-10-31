package com.gft.milhas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.milhas.entities.Evento;
import com.gft.milhas.helpers.DateHelper;
import com.gft.milhas.models.EventoEdicaoModel;
import com.gft.milhas.repositories.EventoRepository;

@Controller
public class EventoEdicaoController {

	@RequestMapping(value = "/eventos-edicao")
	public ModelAndView edicao(Integer id, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("eventos-edicao");

		try {

			EventoRepository eventoRepository = new EventoRepository();
			Evento evento = eventoRepository.findById(id);

			if (evento != null) {

				EventoEdicaoModel model = new EventoEdicaoModel();

				model.setIdEvento(evento.getIdEvento());
				model.setNome(evento.getNome());
				model.setDataInicio(DateHelper.formatToString(evento.getDataInicio()));
				model.setDataFinal(DateHelper.formatToString(evento.getDataFinal()));

				modelAndView.addObject("model", model);
			} else {
				modelAndView.setViewName("redirect:eventos-consulta");
			}
		} catch (Exception e) {

			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}
		return modelAndView;
	}

	@RequestMapping(value = "/editar-evento", method = RequestMethod.POST)
	public ModelAndView editarEvento(EventoEdicaoModel model, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("eventos-edicao");

		try {

			Evento evento = new Evento();

			evento.setIdEvento(model.getIdEvento());
			evento.setNome(model.getNome());
			model.setDataInicio(DateHelper.formatToString(evento.getDataInicio()));
			model.setDataFinal(DateHelper.formatToString(evento.getDataFinal()));
	
			EventoRepository eventoRepository = new EventoRepository();
			eventoRepository.update(evento);

			modelAndView.addObject("mensagem", "Evento atualizado com sucesso!");
		} catch (Exception e) {
			
			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}

		modelAndView.addObject("model", model);
		
		return modelAndView;
	}
}