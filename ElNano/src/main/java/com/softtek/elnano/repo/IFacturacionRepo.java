package com.softtek.elnano.repo;

import com.softtek.elnano.modelo.facturacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturacionRepo extends JpaRepository<facturacion, Long> {
}
