/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgb.sav.controller;

import com.sgb.sav.model.Veiculo;
import com.sgb.sav.repository.VeiculoRepository;
//import java.util.List;
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
@RequestMapping("/sav/veiculo")
public class VeiculoControler {
    
    @Autowired
    private VeiculoRepository vr;
    
    
//    @RequestMapping(value = {"/", "/lista"}, method = RequestMethod.GET)
//    public ModelAndView listaVeiculo(){
//        List<Veiculo> veiculos = (List<Veiculo>) vr.findAll();
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("form-listaveiculo");
//        mav.addObject("allVeiculos", veiculos);
//        
//        return mav;
//    }
    
    @RequestMapping(value = {"/novo"}, method = RequestMethod.GET)
    public ModelAndView formulario(){
        ModelAndView mav = new ModelAndView();
        Veiculo veiculo = new Veiculo();
        mav.setViewName("form-veiculo");
        mav.addObject("veiculoAtual", veiculo);
                     
        return mav;
    }
    
    @RequestMapping(value = {"/salvar"}, method = RequestMethod.POST)
    public String salvar(Veiculo veiculo){
        ModelAndView mav = new ModelAndView();
        vr.save(veiculo);
//        System.out.println("PLACA :"+veiculo.getPlaca());
//        mav.setViewName("redirect:form-veiculo");
        
        return "redirect:/sav/veiculo/novo";
    }
    
    
}
