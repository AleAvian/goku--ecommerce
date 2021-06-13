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

public class Endereco {
	
	@Id
	@GeneratedValue
	private Long id;
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;

	
	
	
	

}
