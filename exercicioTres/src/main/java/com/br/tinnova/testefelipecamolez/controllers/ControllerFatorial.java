package com.br.tinnova.testefelipecamolez.controllers;

import com.br.tinnova.testefelipecamolez.services.ServiceFatorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class ControllerFatorial {

    private final ServiceFatorial serviceFatorial;

    @Autowired
    public ControllerFatorial(ServiceFatorial serviceFatorial) {
        this.serviceFatorial = serviceFatorial;
    }


    @PostConstruct
    public void runFatorial(){
        Arrays.asList(0,1,2,3,4,5,6,7,8,9,10).parallelStream().
                forEachOrdered(valor->
                        System.out.println(valor+"! = "+serviceFatorial.calculaFatorial(valor)));

    }


}
