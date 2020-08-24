
package com.rafa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/persona"})
public class Controlador {
    
    @Autowired
    PersonaService service;
    
    //Listar todas las personas
    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Persona nuevo(@RequestBody Persona p){
        return service.nuevo(p);
    }
    
    @GetMapping(path = {"/{id}"})
    public Persona listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    @PutMapping(path= {"/{id}"})
    public Persona editar(@RequestBody Persona p,@PathVariable("id")int id){
        p.setId(id);
        return service.edit(p);
    }
    
    @DeleteMapping(path = {"/{id}"})
    public Persona delete(@PathVariable("id")int id){
        return service.delete(id);
    }
}
