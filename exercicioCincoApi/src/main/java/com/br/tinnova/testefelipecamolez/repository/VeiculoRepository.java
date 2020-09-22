package com.br.tinnova.testefelipecamolez.repository;

import com.br.tinnova.testefelipecamolez.api.models.VeiculoModel;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoModel, Long> {




}
