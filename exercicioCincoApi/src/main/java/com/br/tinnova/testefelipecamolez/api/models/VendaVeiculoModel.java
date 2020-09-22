package com.br.tinnova.testefelipecamolez.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaVeiculoModel implements Serializable {
    private boolean vendido;
    private String veiculo;
}
