package com.softtek.elnano.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefono")
public class telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 60)
    private long numero;

    @ManyToOne
    @JoinColumn(name = "piloto_id", nullable = false)
    private piloto piloto;
}
