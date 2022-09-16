/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgb.sav.controller;

import com.sgb.sav.model.Funcionario;
import com.sgb.sav.model.UtilizacaoVeiculo;
import com.sgb.sav.model.Veiculo;
import com.sgb.sav.repository.FuncionarioRepository;
import com.sgb.sav.repository.UtilizacaoVeiculoRepository;
import com.sgb.sav.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author herison.lopes
 */
@Controller
@RequestMapping("/sav/utilizacaoveiculo")
public class UtilizacaoVeiculoController {

    @Autowired
    private UtilizacaoVeiculoRepository uvr;

    @Autowired
    private VeiculoRepository vr;

    @Autowired
    private FuncionarioRepository fr;

    @RequestMapping(value = {"/novo"}, method = RequestMethod.GET)
    public ModelAndView formulario() {
        ModelAndView mav = new ModelAndView();
        UtilizacaoVeiculo utilizacaoVeiculo = new UtilizacaoVeiculo();

        Iterable<Veiculo> veiculos = vr.findAll();
        Iterable<Funcionario> funcionarios = fr.findAll();
        
        mav.setViewName("form-utilizacaoveiculo");
        mav.addObject("utilizacaoveiculoAtual", utilizacaoVeiculo);
        
        mav.addObject("allVeiculos", veiculos);
        mav.addObject("allFuncionarios", funcionarios);

        return mav;
    }

    @RequestMapping(value = {"/salvar"}, method = RequestMethod.POST)
    public String salvar(UtilizacaoVeiculo utilizacaoveiculo) {
        ModelAndView mav = new ModelAndView();
        System.out.println("Veiculo 1:"+utilizacaoveiculo.getVeiculo().getModelo());
        System.out.println("Solicitante :"+utilizacaoveiculo.getSolicitante().getNome());
        System.out.println("Despachante :"+utilizacaoveiculo.getDespachante().getNome());
        System.out.println("Motorista :"+utilizacaoveiculo.getMotorista().getNome());
//        uvr.save(utilizacaoveiculo);
//        System.out.println("PLACA :"+veiculo.getPlaca());
//        mav.setViewName("redirect:form-veiculo");

        return "redirect:/sav/utilizacaoveiculo/novo";
    }

}
