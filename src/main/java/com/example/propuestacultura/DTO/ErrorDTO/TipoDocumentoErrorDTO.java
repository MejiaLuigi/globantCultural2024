package com.example.propuestacultura.DTO.ErrorDTO;

import lombok.Data;

@Data
public class TipoDocumentoErrorDTO {
    private String mensajeError;

    public TipoDocumentoErrorDTO() {
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
