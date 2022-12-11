package com.DH.Integrador.service;

import com.DH.Integrador.exceptions.OdontologoNotFoundException;
import com.DH.Integrador.model.Odontologo;
import com.DH.Integrador.repository.OdontologoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OdontologoService {
    private final OdontologoRepository repository;

    public void agregar(Odontologo odontologo){
        repository.save(odontologo);
    }

    public List<Odontologo>listar(){
        return repository.findAll();
    }
    public void modificar(Odontologo odontologo){
        repository.save(odontologo);
    }
    public void eliminarById(int id){
        repository.deleteById(id);
    }
    public void deleteByMatricula(String mat)throws OdontologoNotFoundException {
        repository.findBymatricula(mat).orElseThrow(()-> new OdontologoNotFoundException());
        repository.deleteByMatricula(mat);
    }

    public Odontologo findBymatricula(String mat) throws OdontologoNotFoundException {
        return repository.findBymatricula(mat).orElseThrow(()-> new OdontologoNotFoundException());
    }

}
