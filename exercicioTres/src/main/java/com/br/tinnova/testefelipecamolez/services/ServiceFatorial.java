package com.br.tinnova.testefelipecamolez.services;

import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class ServiceFatorial {
    //TODO comentar com metodo intStream
    public int calculaFatorial(int valorCalculo){
        return IntStream.
                rangeClosed(2, valorCalculo).
                reduce(1, (x, y) -> x * y);
    }

}
