
package com.rafa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {
    
    @Autowired
    private PersonaRepositorio repo;
    
    @Override
    public List<Persona> listar() {
        return repo.findAll();
    }

    @Override
    public Persona listarId(int id) {
        return repo.findById(id);
    }

    @Override
    public Persona nuevo(Persona p) {
       return repo.save(p); 
    }

    @Override
    public Persona edit(Persona p) {
        return this.repo.save(p);
    }

    @Override
    public Persona delete(int id) {
        Persona p = repo.findById(id);
        if(p!=null) {
             repo.delete(p);
        }
        return p;
    }
    
}
