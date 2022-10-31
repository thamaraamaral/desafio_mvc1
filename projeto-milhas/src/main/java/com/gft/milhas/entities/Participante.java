package com.gft.milhas.entities;

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
public class Participante {

	private Long idParticipante;
	private String nome;
	private String quatroLetras;
	private String email;
	private Integer nivel;
	private Grupo grupo;
}
