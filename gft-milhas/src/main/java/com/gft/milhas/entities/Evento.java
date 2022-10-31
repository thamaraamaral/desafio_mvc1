package com.gft.milhas.entities;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Evento {

	private int idEvento;
	private String nome;
	private Date dataInicio;
	private Date dataFinal;
	private List<Atividade> atividades;
	private List<Grupo> grupo;
	
}
