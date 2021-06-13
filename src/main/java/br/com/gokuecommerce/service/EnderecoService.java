package br.com.gokuecommerce.service;

import br.com.gokuecommerce.modelo.Endereco;
import br.com.gokuecommerce.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;


    public Endereco salvar(Endereco endereco) throws Exception {
        Endereco cepExistente = enderecoRepository.findByCep(endereco.getCep());
        if (cepExistente == null || cepExistente.getId() == endereco.getId()) {
            endereco = enderecoRepository.save(endereco);
        } else {
            throw new Exception("endereço já existente! ");
        }
        return endereco;
    }


    public void deletar(String cep) throws Exception{
        Endereco endereco =  enderecoRepository.findByCep(cep);
        if (endereco != null){
            enderecoRepository.delete(endereco);
        }else{
            throw new Exception("Endereço não encontrado...");
        }
    }

    public Endereco buscarPorCep (String cep) {
        Endereco enderecoCep = enderecoRepository.findByCep(cep);
        return enderecoCep;
    }


}
