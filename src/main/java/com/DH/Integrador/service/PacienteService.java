package com.DH.Integrador.service;

import com.DH.Integrador.exceptions.PacienteNotFoundException;
import com.DH.Integrador.model.Paciente;
import com.DH.Integrador.repository.PacienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PacienteService {
    private final PacienteRepository repository;

    public void agregar(Paciente paciente){
        repository.save(paciente);
    }

    public List<Paciente> listar(){
        return repository.findAll();
    }
    public void modificar(Paciente paciente){
        repository.save(paciente);
    }
    public void eliminar(int id) throws PacienteNotFoundException {
        repository.findById(id).orElseThrow(()->new PacienteNotFoundException());
        repository.deleteById(id);
    }

    public Paciente findByDni(String dni) throws PacienteNotFoundException {

        return repository.findBydni(dni).orElseThrow(()->new PacienteNotFoundException());
    }

}
