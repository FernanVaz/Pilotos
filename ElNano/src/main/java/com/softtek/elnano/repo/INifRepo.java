package com.softtek.elnano.repo;

import com.softtek.elnano.modelo.nif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INifRepo extends JpaRepository<nif, Long> {
}
