package br.com.gokuecommerce.service;


import br.com.gokuecommerce.modelo.Usuario;
import br.com.gokuecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario salvar(Usuario usuario) {
        usuario = usuarioRepository.save(usuario);
        return usuario;
    }

    public void deletar(long id) throws Exception {
        Optional<Usuario> opt = usuarioRepository.findById(id);
        if (opt.isPresent()) {
            usuarioRepository.delete(opt.get());
        } else {
            throw new Exception("Usuário nao encontrado...");
        }
    }

    public boolean logar(String login, String senha) throws Exception {
        Usuario usuario = usuarioRepository.findByLogin(login);
        if (usuario == null) {
            throw new Exception("Usuário nao encontrado...");
        }
        if (senha.equals(usuario.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

}
