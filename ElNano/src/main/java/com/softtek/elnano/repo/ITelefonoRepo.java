package com.softtek.elnano.repo;

import com.softtek.elnano.modelo.telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ITelefonoRepo extends JpaRepository<telefono, Long> {
    @Query("FROM telefono t WHERE t.piloto.nombre = 'Sebastian Vettel'")
    public telefono findByPiloto();
}
