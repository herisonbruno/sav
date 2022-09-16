/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sgb.sav.repository;

import com.sgb.sav.model.UtilizacaoVeiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author herison.lopes
 */
@Repository
public interface UtilizacaoVeiculoRepository extends CrudRepository<UtilizacaoVeiculo, Long>{
    
}
