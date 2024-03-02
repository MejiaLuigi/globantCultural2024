package com.example.propuestacultura.controladores;

import com.example.propuestacultura.DTO.ErrorDTO.TipoDocumentoErrorDTO;
import com.example.propuestacultura.DTO.TipoDocumentoDTO;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.servicio.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/documento")
public class TipoDocumentoControlador {

    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;
    @PostMapping
    public ResponseEntity<?> guardarDocumento(@RequestBody TipoDocumento datosRecibidos){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.tipoDocumentoServicio.agregarTipoDocumentoDTO(datosRecibidos));
        }catch (Exception error){
            TipoDocumentoErrorDTO errorPersonalizado = new TipoDocumentoErrorDTO();
            errorPersonalizado.setMensajeError(error.getMessage());
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorPersonalizado.getMensajeError());
        }
    }
    @GetMapping
    public ResponseEntity<?> buscarDocumentos(){
        
    }
}
