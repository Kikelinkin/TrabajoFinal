
package com.portfoliolarosa.lr.interfase;

import com.portfoliolarosa.lr.entty.Persona;
import java.util.List;

public interface IpersonaServices {
    
   //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
