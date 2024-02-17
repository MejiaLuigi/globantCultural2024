package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.ProponenteDTO;
import com.example.propuestacultura.models.Proponente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IProponenteMapa {

    @Mappings({
            @Mapping(source = "nombre_proponente", target = "nombre"),
            @Mapping(source = "trayectoria", target = "trayectoria"),
            @Mapping(source = "tipoProponente.tipo_proponente", target = "tipoPrponente")
    })

    ProponenteDTO proponenteDTO (Proponente proponente);
}
