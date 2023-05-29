package com.softtek.elnano.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "facturacion")
public class facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 60)
    private int sueldo;

    @Column(nullable = false)
    private int publicidad;

    @OneToOne(mappedBy = "facturacion")
    private piloto piloto;
}
