package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.facturacion;
import com.softtek.elnano.repo.IFacturacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturacionServi implements IFacturacionServi {
    @Autowired
    private IFacturacionRepo repo;
    @Override
    public List<facturacion> ObtenerTodos() {
        return repo.findAll();
    }
}