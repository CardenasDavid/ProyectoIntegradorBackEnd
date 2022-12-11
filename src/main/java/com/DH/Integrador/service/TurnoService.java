package com.DH.Integrador.service;

import com.DH.Integrador.exceptions.OdontologoNotFoundException;
import com.DH.Integrador.exceptions.PacienteNotFoundException;
import com.DH.Integrador.exceptions.TurnoNotFoundException;
import com.DH.Integrador.model.Turno;
import com.DH.Integrador.repository.OdontologoRepository;
import com.DH.Integrador.repository.PacienteRepository;
import com.DH.Integrador.repository.TurnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TurnoService {
    private final TurnoRepository repository;
    private final OdontologoRepository odontologoRepository;
    private final PacienteRepository pacienteRepository;
    public void agregar(Turno turno) throws OdontologoNotFoundException, PacienteNotFoundException {
        odontologoRepository.findById(turno.getOdontologo().getId()).orElseThrow(()->new OdontologoNotFoundException());
        pacienteRepository.findById(turno.getPaciente().getId()).orElseThrow(()->new PacienteNotFoundException());
        repository.save(turno);
    }

    public List<Turno>listar(){
        return repository.findAll();
    }

    public void eliminar(int id) throws TurnoNotFoundException {
        repository.findById(id).orElseThrow(()->new TurnoNotFoundException());
        repository.deleteById(id);
    }

    public void modificar(Turno turno){
        repository.save(turno);
    }

}
