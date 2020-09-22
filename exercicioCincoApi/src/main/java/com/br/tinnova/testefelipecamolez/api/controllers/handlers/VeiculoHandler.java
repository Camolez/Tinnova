package com.br.tinnova.testefelipecamolez.api.controllers.handlers;

import com.br.tinnova.testefelipecamolez.api.controllers.handlers.responses.ErroRespostaModel;
import com.br.tinnova.testefelipecamolez.api.exceptions.VeiculoModelIncorretoException;
import com.br.tinnova.testefelipecamolez.api.exceptions.VeiculoNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class VeiculoHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = VeiculoNaoEncontradoException.class)
    public ErroRespostaModel handlerVeiculoNaoEncontradoException(VeiculoNaoEncontradoException exception){
        return ErroRespostaModel.builder().mensagem(exception.getMessage()).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = VeiculoModelIncorretoException.class)
    public ErroRespostaModel handlerVeiculoModelIncorreto(VeiculoModelIncorretoException exception){
        return ErroRespostaModel.builder().mensagem(exception.getMessage()).build();
    }
}
