package com.br.tinnova.testefelipecamolez.controllers;


import com.br.tinnova.testefelipecamolez.services.ServiceVotos;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@EnableScheduling
@Service
public class ControllerExercicioUm {

    private static final int TOTAL_ELEITORES = 1000;
    private static final int TOTAL_VALIDOS = 800;
    private static final int TOTAL_BRANCOS = 150;
    private static final int TOTAL_NULOS = 50;
    private final ServiceVotos serviceVotos;


    public ControllerExercicioUm(ServiceVotos serviceVotos) {
        this.serviceVotos = serviceVotos;
    }

    @PostConstruct
    public void processandoVotos(){
        final double percentualVotosValidos = serviceVotos.calculaRelacaoVotosTotalEleitores(TOTAL_ELEITORES, TOTAL_VALIDOS);
        final double percentualVotosBrancos = serviceVotos.calculaRelacaoVotosTotalEleitores(TOTAL_ELEITORES, TOTAL_BRANCOS);
        final double percentualVotosNulos = serviceVotos.calculaRelacaoVotosTotalEleitores(TOTAL_ELEITORES, TOTAL_NULOS);
        System.out.println("--INICIANDO CALCULO DOS VOTOS");
        System.out.printf("Relação de votos válidos = %s %%%n",percentualVotosValidos);
        System.out.printf("Relação de votos nulos = %s %%%n",percentualVotosBrancos);
        System.out.printf("Relação de votos nulos = %s %%%n",percentualVotosNulos);
        System.out.println("--VOTOS CALCULADOS COM SUCESSO!!");
    }

}
