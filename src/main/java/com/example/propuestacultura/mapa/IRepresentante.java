package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.RepresentanteDTO;
import com.example.propuestacultura.models.Representante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IRepresentante {
    @Mappings({
            @Mapping(source = "tipo_documento.tipo_documento", target = "tipo_documento"),
            @Mapping(source = "numero_documento", target = "numero_documento"),
            @Mapping(source = "primer_nombre", target = "primer_nombre"),
            @Mapping(source = "primer_apellido", target = "primer_apellido"),
            @Mapping(source = "telefono_fijo", target = "telefono_fijo"),
            @Mapping(source = "telefono_celular", target = "telefono_celular"),
            @Mapping(source = "correo_electronico", target = "correo_electronico")

    })
    RepresentanteDTO representanteDTO (Representante representante);
}
