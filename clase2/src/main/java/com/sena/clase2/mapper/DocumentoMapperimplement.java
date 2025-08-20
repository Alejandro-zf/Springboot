package com.sena.clase2.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.sena.clase2.dto.DocumentoDto;
import com.sena.clase2.models.Documento;

@Component
public class DocumentoMapperimplement implements DocumentoMapper{
    
    @Override
    public Documento toDocumento(DocumentoDto documentoDto){
        if(documentoDto == null){
            return null;
        }
        Documento documento = new Documento();
        documento.setId_documento(documentoDto.getId_doc());
        documento.setTipo_documento(documentoDto.getTip_doc());
        return documento;        
    }

    @Override
    public DocumentoDto toDocumentoDto(Documento documento){
        if (documento == null) 
        return null;
        
    DocumentoDto documentoDto = new DocumentoDto();
    documentoDto.setId_doc(documento.getId_documento());
    documentoDto.setTip_doc(documento.getTipo_documento());
    return documentoDto;
    }

    @Override
    public List<DocumentoDto> toDocumentoLists(List<Documento> documentos){
        if (documentos == null || documentos.isEmpty()){
            return List.of();
        }
    List<DocumentoDto> documentoDtos = new ArrayList<DocumentoDto>(documentos.size());
    for(Documento documento:documentos)   {
        documentoDtos.add(toDocumentoDto(documento));
    }
    return documentoDtos;
    }
}
