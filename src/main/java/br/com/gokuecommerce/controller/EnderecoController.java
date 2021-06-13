package br.com.gokuecommerce.controller;


import br.com.gokuecommerce.modelo.Endereco;
import br.com.gokuecommerce.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Endereco endereco) {
        try {
            return ResponseEntity.ok(enderecoService.salvar(endereco));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping
    public  ResponseEntity<?> deletar(@RequestParam ("cep")String cep){
        try{
            enderecoService.deletar(cep);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public ResponseEntity <?> buscarPorCep (@RequestParam("cep") String cep){
        return ResponseEntity.ok(enderecoService.buscarPorCep(cep));
    }


}
