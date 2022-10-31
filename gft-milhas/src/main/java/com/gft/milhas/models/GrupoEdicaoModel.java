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
public class GrupoEdicaoModel {

	private int idGrupo;
	private String nome;
	private int quantidadeParticipantes;
	private int idEvento;
	
}
