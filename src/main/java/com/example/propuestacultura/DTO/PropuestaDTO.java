package com.example.propuestacultura.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data

public class PropuestaDTO {

    private String nombre_proponente;
    private String nombre_propuesta;
    private String descripcion_actividades;
    private String descripcion_propuesta;
    private LocalDate fecha_presentacion;
    private LocalDate fecha_inicio_evento;
    private String estado_propuesta;

}
