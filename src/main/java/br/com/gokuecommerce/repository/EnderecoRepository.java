package br.com.gokuecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gokuecommerce.modelo.Endereco;



@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{

	Endereco findByCep(String cep);
	
	//crud repositorio (banco)
	
	

}
