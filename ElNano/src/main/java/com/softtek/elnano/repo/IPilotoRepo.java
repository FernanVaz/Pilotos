package com.softtek.elnano.repo;

import com.softtek.elnano.modelo.piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPilotoRepo extends JpaRepository<piloto, Long> {

    @Query("FROM piloto p")
    List<piloto> findAll();
    @Query("FROM piloto p JOIN p.temporadas t WHERE t.id = :temporada")
    List<piloto> findByTemporada(@Param("temporada") Long temporada);

    @Query("FROM piloto p WHERE p.escuderia.idescuderia=:escuderia")
    List<piloto> findByEscuderia(@Param("escuderia") Long escuderia);

    @Query("FROM piloto p WHERE p.facturacion.sueldo >:sueldo")
    List<piloto> findBySueldo(@Param("sueldo") Integer sueldo);


    @Query("FROM piloto p WHERE p.facturacion.publicidad BETWEEN :publicidad1 AND :publicidad2")
    List<piloto> findByPublicidad(@Param("publicidad1") Integer publicidad1, @Param("publicidad2") Integer publicidad2);

    @Query("FROM piloto p WHERE p.escuderia.pais != 'Italia' ")
    List<piloto> findNotInItaly();
}
