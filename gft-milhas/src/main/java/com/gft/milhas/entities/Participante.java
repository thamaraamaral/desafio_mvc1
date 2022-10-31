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

	private int idParticipante;
	private String nome;
	private int nivel;
	private String quatroLetras;
	private String email;
	
}
