package br.com.gokuecommerce.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String login;
	private String senha;
	
	

}
