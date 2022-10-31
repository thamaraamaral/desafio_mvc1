package com.gft.milhas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.milhas.entities.Grupo;
import com.gft.milhas.models.GrupoEdicaoModel;
import com.gft.milhas.repositories.GrupoRepository;

public class GrupoEdicaoController {
	@RequestMapping(value = "/grupos-edicao")
	public ModelAndView edicao(Integer id, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("grupos-edicao");

		try {

			GrupoRepository grupoRepository = new GrupoRepository();
			Grupo grupo = grupoRepository.findById(id);

			if (grupo != null) {

				GrupoEdicaoModel model = new GrupoEdicaoModel();

				model.setIdGrupo(grupo.getIdGrupo());

				model.setIdEvento(grupo.getEvento().getIdEvento());
				model.setNome(grupo.getNome());
				model.setQuantidadeParticipantes(grupo.getQuantidadeParticipantes());

				modelAndView.addObject("model", model);
			} else {
				modelAndView.setViewName("redirect:grupos-consulta");
			}
		} catch (Exception e) {

			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}
		return modelAndView;
	}

	@RequestMapping(value = "/editar-grupo", method = RequestMethod.POST)
	public ModelAndView editarGrupo(GrupoEdicaoModel model, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("grupos-edicao");

		try {

			Grupo grupo = new Grupo();

			model.setIdGrupo(grupo.getIdGrupo());
			
			model.setIdEvento(grupo.getEvento().getIdEvento());
			model.setNome(grupo.getNome());
			model.setQuantidadeParticipantes(grupo.getQuantidadeParticipantes());

			GrupoRepository grupoRepository = new GrupoRepository();
			grupoRepository.update(grupo);

			modelAndView.addObject("mensagem", "Grupo atualizado com sucesso!");
		} catch (Exception e) {

			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}

		modelAndView.addObject("model", model);

		return modelAndView;
	}
}