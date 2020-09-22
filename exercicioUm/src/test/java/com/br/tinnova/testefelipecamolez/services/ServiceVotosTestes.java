package com.br.tinnova.testefelipecamolez.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ServiceVotosTestes {

    @Autowired
    private ServiceVotos serviceVotos;


    @Test
    public void calculaRelacaoVotosTotalEleitoresValidos(){
        final double result = serviceVotos.calculaRelacaoVotosTotalEleitores(1000, 800);
        Assertions.assertEquals(80.0, result);
    }

    @Test
    public void calculaRelacaoVotosRelacionadosZero(){
        final double result = serviceVotos.calculaRelacaoVotosTotalEleitores(1000, 0);
        Assertions.assertEquals(0.0, result);
    }

    @Test
    public void calculaRelacaoVotosTotalEleitoresZero(){
        final double result = serviceVotos.calculaRelacaoVotosTotalEleitores(0, 10);
        Assertions.assertEquals(0.0, result);
    }

}
