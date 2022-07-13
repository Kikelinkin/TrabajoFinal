package com.portfoliolarosa.lr.Security.Service;

import com.portfoliolarosa.lr.Security.Enums.RolNombre;
import com.portfoliolarosa.lr.Security.Repository.iRolRepository;
import com.portfoliolarosa.lr.Security.entity.Rol;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
