package com.br.tinnova.testefelipecamolez.services;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class ServiceSomaMultiplosTestes {

  @Autowired
  private ServiceSomaMultiplos serviceSomaMultiplos;

  @Test
  public void buscaMultiplosTeste(){
   long resultado = serviceSomaMultiplos.buscaMultiplos(10);
    Assertions.assertEquals(23, resultado);


  }
}
