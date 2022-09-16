/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgb.sav.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "utilizacaoveiculo")
public class UtilizacaoVeiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String trajeto;
    private String justificativa;

    @ManyToOne(fetch = FetchType.LAZY)
    private Veiculo veiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    private Funcionario solicitante;

    @ManyToOne(fetch = FetchType.LAZY)
    private Funcionario despachante;

    @ManyToOne(fetch = FetchType.LAZY)
    private Funcionario motorista;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(String trajeto) {
        this.trajeto = trajeto;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Funcionario solicitante) {
        this.solicitante = solicitante;
    }

    public Funcionario getDespachante() {
        return despachante;
    }

    public void setDespachante(Funcionario despachante) {
        this.despachante = despachante;
    }

    public Funcionario getMotorista() {
        return motorista;
    }

    public void setMotorista(Funcionario motorista) {
        this.motorista = motorista;
    }

    public UtilizacaoVeiculo() {
        super();
    }

    public UtilizacaoVeiculo(Long id, String trajeto, String justificativa, Veiculo veiculo, Funcionario solicitante, Funcionario despachante, Funcionario motorista) {
        this.id = id;
        this.trajeto = trajeto;
        this.justificativa = justificativa;
        this.veiculo = veiculo;
        this.solicitante = solicitante;
        this.despachante = despachante;
        this.motorista = motorista;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UtilizacaoVeiculo other = (UtilizacaoVeiculo) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

}
