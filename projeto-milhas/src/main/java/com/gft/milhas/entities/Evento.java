package com.gft.milhas.entities;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Evento {

	private Long idEvento;
	private String nome;
	private Date dataInicial;
	private Date dataFinal;
	private List<Grupo> grupos;
	private List<Atividade> atividades;
	
}
