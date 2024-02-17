package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.TipoProponenteDTO;
import com.example.propuestacultura.models.TipoProponente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ITipoProponentenMapa {

    @Mappings(
            {
                    @Mapping(source = "id_tipo_proponente", target = "id_tipo_proponente"),
                    @Mapping(source = "", target = "")
            }
    )
    TipoProponenteDTO tipoProponentetoDTO(TipoProponente tipoProponente);
}
