package com.DH.Integrador.Controller;


import com.DH.Integrador.model.Paciente;
import com.DH.Integrador.service.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin
@AllArgsConstructor
public class PacienteController {
    private final PacienteService pacienteService;

    @PostMapping("/add")
    public void Agregar(@RequestBody Paciente paciente){
        pacienteService.agregar(paciente);
    }

    @GetMapping()
    public List<Paciente> getall(){
        return pacienteService.listar();
    }

    @GetMapping("find/{dni}")
    public Paciente findByMatricula(@PathVariable String dni){
        return pacienteService.findByMatricula(dni);
    }

    @PutMapping("/update")
    public void modificar(@RequestBody Paciente paciente){
        pacienteService.modificar(paciente);
    }

    @DeleteMapping("delete")
    public void eliminar(@RequestBody int id){
        pacienteService.eliminar(id);
    }


}
