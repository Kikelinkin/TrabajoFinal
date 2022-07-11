
package com.portfoliolarosa.lr.controller;

import com.portfoliolarosa.lr.entty.Persona;
import com.portfoliolarosa.lr.interfase.IpersonaServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IpersonaServices ipersonaServices;
   @GetMapping("personas/traer")
    public List<Persona> getPersona(){
    return ipersonaServices.getPersona();
    }
    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona persona){
    ipersonaServices.savePersona(persona);
    return "La Persona fue creada correctamente";
    }
    @DeleteMapping("/persona/borrar/(id)")
    public String deletePersona(@PathVariable Long id){
    ipersonaServices.deletePersona(id);
    return "La Persona fue eliminada correctamente";
    }
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre")String nuevoNombre,
                               @RequestParam("apellido")String nuevoApellido,
                               @RequestParam("img")String nuevoImg){
    Persona persona = ipersonaServices.findPersona(id);
    persona.setNombre(nuevoNombre);
    persona.setApellido(nuevoApellido);
    persona.setImg(nuevoImg);
    ipersonaServices.savePersona(persona);
    return persona;
    }
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaServices.findPersona((long)1);
    }
}
