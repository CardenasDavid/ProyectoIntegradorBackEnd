package com.DH.Integrador.service;

import com.DH.Integrador.exceptions.ResourceNotFoundException;
import com.DH.Integrador.model.Usuario;
import com.DH.Integrador.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService implements UserDetailsService {
    private UsuarioRepository repository;
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        return repository.findByEmail(email).orElseThrow(()-> new UsernameNotFoundException("Usuario no encontrado"));
    }

    public void agregar(Usuario usuario){
        Usuario user= new Usuario(usuario.getName(),usuario.getEmail(),passwordEncoder.encode(usuario.getPass()),usuario.getRol());
        repository.save(user);
    }
}
