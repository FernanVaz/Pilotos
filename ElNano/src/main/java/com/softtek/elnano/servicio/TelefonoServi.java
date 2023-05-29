package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.telefono;
import com.softtek.elnano.repo.ITelefonoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoServi implements ITelefonoServi {
    @Autowired
    private ITelefonoRepo repo;
    @Override
    public List<telefono> ObtenerTodos() {
        return repo.findAll();
    }

    @Override
    public List<telefono> ByTelefono(long l) {
        return (List<telefono>) repo.findByPiloto();
    }
}