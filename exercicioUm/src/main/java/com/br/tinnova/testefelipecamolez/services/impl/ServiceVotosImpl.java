package com.br.tinnova.testefelipecamolez.services.impl;

import com.br.tinnova.testefelipecamolez.services.ServiceVotos;
import org.springframework.stereotype.Service;

@Service
public class ServiceVotosImpl implements ServiceVotos {
    /**
     *
     * @param totalEleitores
     * @param votosRelacionados
     * @return
     */
    @Override
    public double calculaRelacaoVotosTotalEleitores(double totalEleitores, double votosRelacionados) {
        if (totalEleitores > 0){
            return 100 * (votosRelacionados / totalEleitores);
        }
        return 0;
    }

}
