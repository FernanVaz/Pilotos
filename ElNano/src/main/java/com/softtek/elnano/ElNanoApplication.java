package com.softtek.elnano;

import com.softtek.elnano.servicio.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElNanoApplication implements CommandLineRunner {
    @Autowired
    private IPilotoServi pilotoService;
    @Autowired
    private IEscuderiaServi iescuderiaService;
    @Autowired
    private IFacturacionServi ifacturacionService;
    @Autowired
    private INifServi inifService;
    @Autowired
    private IPilotoServi ipilotoService;
    @Autowired
    private ITelefonoServi itelefonoService;
    @Autowired
    private ITemporadaServi itemporadaService;

    public static void main(String[] args) {
        SpringApplication.run(ElNanoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        pilotoService.findAll().forEach(p -> System.out.println(p.getNombre()));
        pilotoService.ByTemporada(1L).forEach(p -> System.out.println(p.getNombre()));
        pilotoService.ByEscuderia(1L).forEach(p -> System.out.println(p.getNombre()));

        pilotoService.BySueldo(100).forEach(p -> System.out.println(p.getNombre()));

        pilotoService.ByPublicidad(100, 30000).forEach(p -> System.out.println(p.getNombre()));
        pilotoService.NotInItaly().forEach(p -> System.out.println(p.getNombre()));

        itelefonoService.ByTelefono(1L).forEach(p -> System.out.println(p));
    }
}
