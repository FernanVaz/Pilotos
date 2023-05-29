package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.escuderia;
import com.softtek.elnano.repo.IEscuderiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscuderiaServi implements IEscuderiaServi {
    @Autowired
    private IEscuderiaRepo repo;
    @Override
    public List<escuderia> ObtenerTodos() {
        return repo.findAll();
    }
}
