package com.softtek.elnano.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "piloto")
public class piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false)
    private int edad;

    @OneToOne(cascade = CascadeType.ALL)
    private facturacion facturacion;

    @OneToOne(cascade = CascadeType.ALL)
    private nif nif;

    @ManyToOne
    private escuderia escuderia;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<telefono> telefonos;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<temporada> temporadas;
}
