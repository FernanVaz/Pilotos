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
@Table(name = "escuderia")
public class escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idescuderia;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false, length = 40)
    private String pais;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<piloto> pilotos;
}
