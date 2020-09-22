package com.br.tinnova.testefelipecamolez.api.services.impl;

import com.br.tinnova.testefelipecamolez.api.exceptions.VeiculoModelIncorretoException;
import com.br.tinnova.testefelipecamolez.api.exceptions.VeiculoNaoEncontradoException;
import com.br.tinnova.testefelipecamolez.api.models.VeiculoModel;
import com.br.tinnova.testefelipecamolez.api.models.VendaVeiculoModel;
import com.br.tinnova.testefelipecamolez.api.services.VeiculosService;
import com.br.tinnova.testefelipecamolez.repository.VeiculoRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VeiculosServiceImpl implements VeiculosService {

    private final VeiculoRepository veiculoRepository;

    public VeiculosServiceImpl(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public List<VeiculoModel> listarTodos() {
        return veiculoRepository.findAll();
    }

    @Override
    public VeiculoModel buscarPorId(long id) {
        return veiculoRepository
                .findById(id)
                .orElseThrow(()->new VeiculoNaoEncontradoException("ID NÃO ENCONTRADO"));
    }

    @Override
    public long cadastrarVeiculo(VeiculoModel veiculoModel) {
        try {
            veiculoRepository.saveAndFlush(veiculoModel);
            return veiculoModel.getIdVeiculo();
        }catch (DataIntegrityViolationException exception){
            throw new VeiculoModelIncorretoException("FAVOR VERIFICAR AS INFORMAÇÕES ENVIADAS");
        }
    }

    @Override
    public void atualizarVeiculo(VeiculoModel veiculoModel, long id) {
          try{
                VeiculoModel veiculoModelMetodo = this.buscarPorId(id);
                veiculoModel.setIdVeiculo(veiculoModelMetodo.getIdVeiculo());
                veiculoRepository.saveAndFlush(veiculoModel);
            }catch (DataIntegrityViolationException exception){
                throw new VeiculoModelIncorretoException("FAVOR VERIFICAR AS INFORMAÇÕES ENVIADAS");
            }
    }

    @Override
    public void atualizarVendaVeiculo(VendaVeiculoModel vendaVeiculoModel, long id) {
        try {
            VeiculoModel veiculoModelMetodo = this.buscarPorId(id);
            veiculoModelMetodo.setVendido(vendaVeiculoModel.isVendido());
            veiculoModelMetodo.setVeiculo(vendaVeiculoModel.getVeiculo());
            veiculoRepository.saveAndFlush(veiculoModelMetodo);
          }catch (DataIntegrityViolationException exception){
              throw new VeiculoModelIncorretoException("FAVOR VERIFICAR AS INFORMAÇÕES ENVIADAS");
          }
    }

    @Override
    public void apagarVeiculo(long id) {
        VeiculoModel veiculoModelMetodo = this.buscarPorId(id);
        veiculoRepository.delete(veiculoModelMetodo);
    }
}
