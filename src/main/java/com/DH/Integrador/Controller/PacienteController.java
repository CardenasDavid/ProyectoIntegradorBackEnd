package com.DH.Integrador.Controller;


import com.DH.Integrador.exceptions.PacienteNotFoundException;
import com.DH.Integrador.model.Paciente;
import com.DH.Integrador.service.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin
@AllArgsConstructor
public class PacienteController {
    private final PacienteService pacienteService;

    @PostMapping("/add")
    public ResponseEntity<String> Agregar(@RequestBody Paciente paciente){
        pacienteService.agregar(paciente);
        return ResponseEntity.ok(paciente + "agregado");
    }

    @GetMapping()
    public List<Paciente> getall(){
        return pacienteService.listar();
    }

    @GetMapping("find/{dni}")
    public Paciente findByDni(@PathVariable String dni) throws PacienteNotFoundException {
        return pacienteService.findByDni(dni);
    }

    @PutMapping("/update")
    public void modificar(@RequestBody Paciente paciente){
        pacienteService.modificar(paciente);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> eliminar(@RequestBody int id){
        pacienteService.eliminar(id);
        return ResponseEntity.ok("Paciente con id: "+id + " eliminado");
    }


}
