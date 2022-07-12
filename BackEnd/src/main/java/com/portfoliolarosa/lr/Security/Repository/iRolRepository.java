
package com.portfoliolarosa.lr.Security.Repository;

import com.portfoliolarosa.lr.Security.Enums.RolNombre;
import com.portfoliolarosa.lr.Security.entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
   Optional <Rol> findByRolNombre(RolNombre rolNombre);
}
