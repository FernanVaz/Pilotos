package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.telefono;

import java.util.List;

public interface ITelefonoServi {
    List<telefono> ObtenerTodos();

    List<telefono> ByTelefono(long l);
}
