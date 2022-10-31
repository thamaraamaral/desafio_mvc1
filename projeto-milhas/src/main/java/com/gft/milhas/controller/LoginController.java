package com.gft.milhas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gft.milhas.entities.Usuario;
import com.gft.milhas.models.LoginModel;
import com.gft.milhas.repositories.UsuarioRepository;

@Controller
public class LoginController {

	@RequestMapping(value = "/")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");

		modelAndView.addObject("model", new LoginModel());

		return modelAndView;
	}

	@RequestMapping(value = "/autenticar-usuario", method = RequestMethod.POST)
	public ModelAndView autenticarUsuario(LoginModel model, HttpServletRequest request) {

		ModelAndView modelAndView = new ModelAndView("login");

		try {
			UsuarioRepository usuarioRepository = new UsuarioRepository();
			Usuario usuario = usuarioRepository.find(model.getEmail(), model.getSenha());

			if (usuario != null) {
				request.getSession().setAttribute("usuario_auth", usuario);
				modelAndView.addObject("mensagem", "Olá " + usuario.getNome() + ", você está em GFT Milhas!");
				modelAndView.setViewName("eventos-consulta");
			} else {
				modelAndView.addObject("mensagem", "Acesso negado, email ou senha inválidos.");
			}
		} catch (Exception e) {
			modelAndView.addObject("mensagem", "Ocorreu um erro: " + e.getMessage());
		}

		if (modelAndView.getViewName().equals("login"))
			modelAndView.addObject("model", new LoginModel());

		return modelAndView;
	}

}
