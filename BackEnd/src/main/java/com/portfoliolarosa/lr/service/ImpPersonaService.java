
package com.portfoliolarosa.lr.service;

import com.portfoliolarosa.lr.entty.Persona;
import com.portfoliolarosa.lr.interfase.IpersonaServices;
import com.portfoliolarosa.lr.repository.IpersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IpersonaServices{
@Autowired IpersonaRepository IpersonaRepository;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona=IpersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        IpersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        IpersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona=IpersonaRepository.findById(id).orElse(null);
        return persona;
        
    }
    
}
