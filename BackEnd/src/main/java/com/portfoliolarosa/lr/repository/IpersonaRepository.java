
package com.portfoliolarosa.lr.repository;

import com.portfoliolarosa.lr.entty.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IpersonaRepository extends JpaRepository <Persona, Long>{
    
}