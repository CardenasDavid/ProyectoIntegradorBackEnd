package com.DH.Integrador.config;

import com.DH.Integrador.model.Rol;
import com.DH.Integrador.model.Usuario;
import com.DH.Integrador.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Harcode implements ApplicationRunner {
    private final UsuarioRepository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        var user=new Usuario("nico","taglia@gmail.com",new BCryptPasswordEncoder().encode("1010"), Rol.USER);
//        var userAdmin=new Usuario("messi","messi10@gmail.com",new BCryptPasswordEncoder().encode("1010"), Rol.ADMIN);
//
//        repository.save(user);
//        repository.save(userAdmin);
    }
}
