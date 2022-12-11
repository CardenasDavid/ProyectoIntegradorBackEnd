package com.DH.Integrador.Controller;

import com.DH.Integrador.exceptions.OdontologoNotFoundException;
import com.DH.Integrador.exceptions.PacienteNotFoundException;
import com.DH.Integrador.exceptions.TurnoNotFoundException;
import com.DH.Integrador.model.Turno;
import com.DH.Integrador.service.TurnoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
@CrossOrigin
@AllArgsConstructor
public class TurnoController {

    private final TurnoService turnoService;


    @PostMapping("/add")
    public ResponseEntity<String> Agregar(@RequestBody Turno turno) throws OdontologoNotFoundException, PacienteNotFoundException {
           turnoService.agregar(turno);
           return ResponseEntity.ok(turno + "agregado");
    }

    @GetMapping()
    public List<Turno> getAll(){
       return turnoService.listar();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> eliminarById(@PathVariable int id) throws TurnoNotFoundException {
        turnoService.eliminar(id);
        return ResponseEntity.ok("Turno con id: "+id + " eliminado");
    }
}
