package com.br.tinnova.testefelipecamolez.api.controllers.handlers.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErroRespostaModel implements Serializable {

    private String mensagem;
}
