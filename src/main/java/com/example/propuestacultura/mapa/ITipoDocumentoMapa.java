package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.TipoDocumentoDTO;
import com.example.propuestacultura.models.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITipoDocumentoMapa {
    @Mappings(
            {               //EL SOURCE ES COMO SE LLAMA EN EL MODELO    TARGET ES COMO SE LLAMA EN EL DTO
                    @Mapping(source = "id_tipo_documento", target = "id"),
                    @Mapping(source = "tipo_documento", target = "tipo_documento"),
            }
    )
    TipoDocumentoDTO tipoDocumentoTODTO(TipoDocumento tipoDocumento);

   List <TipoDocumentoDTO> toDTOList(List<TipoDocumento> tipoDocumentoList);
}
