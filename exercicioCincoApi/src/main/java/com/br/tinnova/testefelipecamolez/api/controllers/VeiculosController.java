package com.br.tinnova.testefelipecamolez.api.controllers;

import com.br.tinnova.testefelipecamolez.api.models.VeiculoModel;
import com.br.tinnova.testefelipecamolez.api.models.VendaVeiculoModel;
import com.br.tinnova.testefelipecamolez.api.services.VeiculosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/veiculos")
public class VeiculosController {

    private final VeiculosService veiculosService;

    public VeiculosController(VeiculosService veiculosService) {
        this.veiculosService = veiculosService;
    }

    @GetMapping
    public ResponseEntity<List<VeiculoModel>> listarTodos (){
        return ResponseEntity.ok(veiculosService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoModel> buscarPorId (@PathVariable("id") int id){
        return ResponseEntity.ok(veiculosService.buscarPorId(id));
    }

    @GetMapping("/find")
    public ResponseEntity<VeiculoModel> buscarPorParametro(@RequestParam(required = false) String veiculo,
                                                           @RequestParam(required = false) String marca,
                                                           @RequestParam(required = false) String descricao,
                                                           @RequestParam(required = false) Integer ano,
                                                           @RequestParam(required = false) Boolean vendido ){
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarVeiculo (@RequestBody VeiculoModel veiculoModel){
        long id = veiculosService.cadastrarVeiculo(veiculoModel);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri()).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarVeiculo (@RequestBody VeiculoModel veiculoModel, @PathVariable("id") long id){
        veiculosService.atualizarVeiculo(veiculoModel, id);
        return ResponseEntity.noContent().build();
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Void> atualizarVendaVeiculo (@RequestBody VendaVeiculoModel vendaVeiculoModel, @PathVariable("id") long id){
        veiculosService.atualizarVendaVeiculo(vendaVeiculoModel, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagarVeiculo (@PathVariable("id") long id){
        veiculosService.apagarVeiculo(id);
        return ResponseEntity.noContent().build();
    }

}
