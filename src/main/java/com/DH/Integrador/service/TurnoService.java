package com.DH.Integrador.service;

import com.DH.Integrador.model.Turno;
import com.DH.Integrador.repository.TurnoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@AllArgsConstructor
@Service
public class TurnoService {
    private final TurnoRepository repository;

    public void agregar(Turno turno){
        repository.save(turno);
    }

    public List<Turno>listar(){
        return repository.findAll();
    }

    public void eliminar(int id){
        repository.deleteById(id);
    }


    @Transactional
    public void modificar(Turno turno){
        repository.save(turno);
    }

}
