package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.piloto;

import java.util.List;

public interface IPilotoServi {
    List<piloto> findAll();
    List<piloto> ObtenerTodos();
    List<piloto> ByTemporada(Long idTemporada);

    List<piloto> ByEscuderia(Long idEscuderia);

    List<piloto> BySueldo(Integer sueldo);

    List<piloto> ByPublicidad(Integer publicidad1, Integer publicidad2);

    List<piloto> NotInItaly();
}
