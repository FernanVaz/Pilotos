package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.temporada;
import com.softtek.elnano.repo.ITemporadaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporadaServi implements ITemporadaServi {
    @Autowired
    private ITemporadaRepo repo;
    @Override
    public List<temporada> ObtenerTodos() {
        return repo.findAll();
    }
}