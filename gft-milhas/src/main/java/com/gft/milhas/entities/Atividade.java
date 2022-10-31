package com.gft.milhas.entities;

import java.util.Date;

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
public class Atividade {

	private int idAtividade;
	private String nome;
	private Date prazo_inicial;
	private Date prazo_final;
	private Evento evento;
	
}
