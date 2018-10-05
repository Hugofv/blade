package com.squadra.blade.repositories;

import com.squadra.blade.entities.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long> {

}
