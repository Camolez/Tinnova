package com.br.tinnova.testefelipecamolez.services;

import org.springframework.stereotype.Service;
import java.util.stream.LongStream;

@Service
public class ServiceSomaMultiplos {
    private boolean validaMultiplo(long valor){
        return valor%3 == 0 || valor%5 == 0;
    }
    public long buscaMultiplos(int range) {
        return LongStream.range(0, range).
                filter(this::validaMultiplo).
                sum();
    }

}
