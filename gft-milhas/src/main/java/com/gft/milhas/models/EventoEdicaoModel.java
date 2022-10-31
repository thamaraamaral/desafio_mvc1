package com.gft.milhas.models;

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
public class EventoEdicaoModel {

	private int idEvento;
	private String nome;
	private String dataInicio;
	private String dataFinal;
}
