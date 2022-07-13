
package com.portfoliolarosa.lr.Security.Service;

import com.portfoliolarosa.lr.Security.Repository.iUsuarioRepository;
import com.portfoliolarosa.lr.Security.entity.Usuario;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
    return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    public boolean existsByNombreUsuario(String nombreUsuario){
    return iusuarioRepository.existByNombreUsuario(nombreUsuario);
    }
   
    public boolean existsByEmail(String email){
    return iusuarioRepository.existByNombreEmail(email);
    }
    
    public void save (Usuario usuario){
    iusuarioRepository.save(usuario);
    }
}
