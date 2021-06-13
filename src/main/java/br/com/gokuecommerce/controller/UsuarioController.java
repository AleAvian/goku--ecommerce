package br.com.gokuecommerce.controller;


import br.com.gokuecommerce.modelo.Usuario;
import br.com.gokuecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Usuario usuario) {
        try {
            return ResponseEntity.ok(usuarioService.salvar(usuario));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping
    public  ResponseEntity<?> deletar (@RequestParam ("id")Long id ){
        try{
            usuarioService.deletar(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }




}
