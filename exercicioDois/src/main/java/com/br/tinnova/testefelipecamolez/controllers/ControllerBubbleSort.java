package com.br.tinnova.testefelipecamolez.controllers;

import com.br.tinnova.testefelipecamolez.services.BublleSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ControllerBubbleSort {

    private final BublleSortService bublleSortService;

    @Autowired
    public ControllerBubbleSort(BublleSortService bublleSortService) {
        this.bublleSortService = bublleSortService;
    }

    @PostConstruct
    public void runBubbleSort(){
     int[] arrayDesordenado ={5,3,2,4,7,0,1,6};
         System.out.println("--ORDENANDO ARRAY!");
         bublleSortService.bubbleSort(arrayDesordenado);
         System.out.println("--ARRAY ORDENADO COM SUCESSO!");
    }


}
