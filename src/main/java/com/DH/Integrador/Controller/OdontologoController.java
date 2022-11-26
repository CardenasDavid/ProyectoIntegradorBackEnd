package com.DH.Integrador.Controller;

import com.DH.Integrador.model.Odontologo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.DH.Integrador.service.OdontologoService;

import java.util.List;


@RestController
@RequestMapping("/odontologos")
@CrossOrigin
@AllArgsConstructor
public class OdontologoController {
    private final OdontologoService odontologoService;

    @PutMapping("/update")
    public void modificar(@RequestBody Odontologo odontologo){
        odontologoService.modificar(odontologo);
    }

    @GetMapping()
    public ResponseEntity<List<Odontologo>> getall(){
        return ResponseEntity.ok(odontologoService.listar());
    }

    @PostMapping("/add")
    public ResponseEntity<String> Agregar(@RequestBody Odontologo odontologo){
         odontologoService.agregar(odontologo);
         return ResponseEntity.ok(odontologo + "agregado");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String>  eliminar(@PathVariable int id){
        odontologoService.eliminarById(id);
        return ResponseEntity.ok("Odontologo con id: "+id + " eliminado");

    }

    @GetMapping("find/{mat}")
    public ResponseEntity<Odontologo> search(@PathVariable String mat){
        return ResponseEntity.ok(odontologoService.findBymatricula(mat));
    }



}
