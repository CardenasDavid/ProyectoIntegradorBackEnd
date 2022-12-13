package com.DH.Integrador.Controller;


import com.DH.Integrador.model.Usuario;
import com.DH.Integrador.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService service;

    @PostMapping("/add")
    public ResponseEntity<String> Agregar (@RequestBody Usuario usuario){
        service.agregar(usuario);
        return ResponseEntity.ok("Usuario creado");
    }

}
