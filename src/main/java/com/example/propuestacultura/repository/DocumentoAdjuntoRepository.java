package com.example.propuestacultura.repository;

import com.example.propuestacultura.models.DocumentosAdjuntos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DocumentoAdjuntoRepository extends JpaRepository <DocumentosAdjuntos, Integer> {
}
