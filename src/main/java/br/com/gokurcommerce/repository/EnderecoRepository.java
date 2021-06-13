package br.com.gokurcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gokuecommerce.modelo.Endereco;



@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{
	
	//crud repositorio (banco)
	
	

}
