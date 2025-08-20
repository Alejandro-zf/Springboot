package com.sena.clase2.mapper;

import java.util.List;

import com.sena.clase2.dto.DocumentoDto;
import com.sena.clase2.models.Documento;

public interface DocumentoMapper {

    Documento toDocumento(DocumentoDto documentoDto);    

    Documento toDocumentoDto (Documento documento);

    List <DocumentoDto> toDocumentoLists (List<Documento> documentos);
}
