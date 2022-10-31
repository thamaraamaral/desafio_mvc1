package com.gft.milhas.entities;

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
public class Grupo {

	private Long idGrupo;
	private String nome;
	private Integer quantidadeDeParticipantes;
	private List<Participante> participantes;
	
}