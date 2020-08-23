
package com.rafa;

import java.util.List;


public interface PersonaService {
    
    List<Persona>listar();
    
    Persona listarId(int id);
    Persona nuevo(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    
}
