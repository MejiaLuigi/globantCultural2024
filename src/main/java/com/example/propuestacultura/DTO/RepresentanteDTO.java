package com.example.propuestacultura.DTO;

import com.example.propuestacultura.models.TipoDocumento;
import lombok.Data;

@Data
public class RepresentanteDTO {
    private TipoDocumento tipo_documento;
    private String numero_documento;
    private String primer_nombre;
    private String primer_apellido;
    private String telefono_fijo;
    private String telefono_celular;
    private String correo_electronico;
}
