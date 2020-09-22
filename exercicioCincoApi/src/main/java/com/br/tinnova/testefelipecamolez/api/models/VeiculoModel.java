package com.br.tinnova.testefelipecamolez.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculos")
public class VeiculoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVeiculo;

    @Column(name = "VEICULO")
    private String veiculo;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "ANO")
    private int ano;

    @Column(name = "DESC_VEICULO")
    private String descricao;

    @Column(name = "STATUS_VENDIDO",  columnDefinition = "TINYINT")
    private boolean vendido;

    @Column(name = "DATA_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date created;

    @Column(name = "DATA_ATUALIZACAO")
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updated;


}
