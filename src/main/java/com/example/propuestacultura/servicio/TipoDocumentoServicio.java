package com.example.propuestacultura.servicio;

import com.example.propuestacultura.DTO.TipoDocumentoDTO;
import com.example.propuestacultura.mapa.ITipoDocumentoMapa;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TipoDocumentoServicio {

    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;
    @Autowired
    ITipoDocumentoMapa iTipoDocumentoMapa;



    //Rutina para guardar en BD un tipo de documento
    public TipoDocumentoDTO agregarTipoDocumentoDTO(TipoDocumento datosTipoDocumento) throws Exception{

        try{
            //VALIDAR

            //llamar al repo para realizar la consulta
            return this.iTipoDocumentoMapa.tipoDocumentoTODTO(this.tipoDocumentoRepository.save(datosTipoDocumento));

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //RUTINA PARA BUSCAR UN ELEMENTO DENTRO DE BD POR ID
    public TipoDocumentoDTO buscarTipoDocumentoPorId(Integer id) throws Exception{
        try{
            if(this.tipoDocumentoRepository.findById(id).isPresent()){
                //return
                return this.iTipoDocumentoMapa.tipoDocumentoTODTO(this.tipoDocumentoRepository.findById(id).get());
            }else{
                throw new Exception("usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<TipoDocumentoDTO> buscarTodosTiposDocumentos() throws Exception{
        try{
            return this.iTipoDocumentoMapa.toDTOList(tipoDocumentoRepository.findAll());
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Rutina para modificar un elemento
    public TipoDocumentoDTO modificarTipoDocumento(Integer id, TipoDocumento tipoDocumento) throws Exception{
        try{
            if(this.tipoDocumentoRepository.findById(id).isPresent()){
                TipoDocumento objetoEncontrado=this.tipoDocumentoRepository.findById(id).get();

                objetoEncontrado.setTipo_documento(tipoDocumento.getTipo_documento());
               return this.iTipoDocumentoMapa.tipoDocumentoTODTO(this.tipoDocumentoRepository.save(objetoEncontrado));
            }else{
                throw new Exception("usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Rutina para elminiar un elemento
    public void eliminarTipoDocumento(Integer id) throws Exception{

        try{
            if(this.tipoDocumentoRepository.findById(id).isPresent()){
                //return
                tipoDocumentoRepository.deleteById(id);
            }else{
                throw new Exception("usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
