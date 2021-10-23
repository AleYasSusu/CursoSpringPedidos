package com.aleDev.CursoSrpingPedidos.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDTO implements Serializable {

    public final static long serialVersionUID = -6435801736459637912L;
    private String name;

}
