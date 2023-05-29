package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.nif;
import com.softtek.elnano.repo.INifRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NifServi implements INifServi {
    @Autowired
    private INifRepo repo;
    @Override
    public List<nif> ObtenerTodos() {
        return repo.findAll();
    }
}