package com.example.propuestacultura.models;

import com.example.propuestacultura.models.keys.DocumentoAdjuntoPropuestaPK;
import jakarta.persistence.*;

@Entity
@Table(name = "propuesta_documento")
public class DocumentoAdjuntoPropuesta {
    @Id
    private Propuesta propuesta;

    @Id
    private DocumentosAdjuntos documentosAdjuntos;


    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public DocumentosAdjuntos getDocumentosAdjuntos() {
        return documentosAdjuntos;
    }

    public void setDocumentosAdjuntos(DocumentosAdjuntos documentosAdjuntos) {
        this.documentosAdjuntos = documentosAdjuntos;
    }
}
