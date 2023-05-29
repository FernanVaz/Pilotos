package com.softtek.elnano.servicio;

import com.softtek.elnano.modelo.piloto;
import com.softtek.elnano.repo.IPilotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotoServi implements IPilotoServi {
    @Autowired
    private IPilotoRepo repo;
    @Autowired
    public List<piloto> findAll() {
        return repo.findAll();
    }
    @Override
    public List<piloto> ObtenerTodos() {
        return repo.findAll();
    }

    @Override
    public List<piloto> ByTemporada(Long idTemporada) {
        return repo.findByTemporada(idTemporada);
    }

    @Override
    public List<piloto> ByEscuderia(Long idEscuderia) {
        return repo.findByEscuderia(idEscuderia);
    }

    @Override
    public List<piloto> BySueldo(Integer sueldo) {
        return repo.findBySueldo(sueldo);
    }

    @Override
    public List<piloto> ByPublicidad(Integer publicidad1, Integer publicidad2) {
        return repo.findByPublicidad(publicidad1, publicidad2);
    }
    @Override
    public List<piloto> NotInItaly() {
        return repo.findNotInItaly();
    }
}
