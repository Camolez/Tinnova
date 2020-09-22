package com.br.tinnova.testefelipecamolez.controllers;

import com.br.tinnova.testefelipecamolez.services.ServiceSomaMultiplos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ControllerSomaMultipos {

    private final ServiceSomaMultiplos serviceSomaMultiplos;

    @Autowired
    public ControllerSomaMultipos(ServiceSomaMultiplos serviceSomaMultiplos) {
        this.serviceSomaMultiplos = serviceSomaMultiplos;
    }

    @PostConstruct
    public void runController(){
        System.out.println(serviceSomaMultiplos.buscaMultiplos(10));
        System.out.println(serviceSomaMultiplos.buscaMultiplos(1000));
    }


}
