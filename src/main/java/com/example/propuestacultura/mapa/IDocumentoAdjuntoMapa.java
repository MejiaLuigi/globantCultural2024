package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.DocumentosAdjuntoDTO;
import com.example.propuestacultura.models.DocumentosAdjuntos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IDocumentoAdjuntoMapa {
    @Mappings({
            @Mapping(source = "nombre_documento", target = "nombre_documento"),
            @Mapping(source = "URL", target = "enlace")
    })
    DocumentosAdjuntoDTO documentosAdjuntoDTO (DocumentosAdjuntos documentosAdjuntos);
}
