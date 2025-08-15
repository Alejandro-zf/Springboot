package com.sena.clase2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDto {
    private Integer idd;
    private String nombr;
    private Integer prec;
    private String categ; 
}
