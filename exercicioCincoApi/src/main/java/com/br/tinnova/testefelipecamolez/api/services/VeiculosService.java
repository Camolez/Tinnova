package com.br.tinnova.testefelipecamolez.api.services;

import com.br.tinnova.testefelipecamolez.api.models.VeiculoModel;
import com.br.tinnova.testefelipecamolez.api.models.VendaVeiculoModel;

import java.util.List;

public interface VeiculosService {

    List<VeiculoModel> listarTodos();

    VeiculoModel buscarPorId(long id);

    long cadastrarVeiculo(VeiculoModel veiculoModel);

    void atualizarVeiculo(VeiculoModel veiculoModel, long id);

    void atualizarVendaVeiculo(VendaVeiculoModel vendaVeiculoModel, long id);

    void apagarVeiculo(long id);



}
