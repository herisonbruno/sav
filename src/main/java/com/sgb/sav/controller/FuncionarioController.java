/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sgb.sav.controller;

import com.sgb.sav.model.Funcionario;
import com.sgb.sav.model.Veiculo;
import com.sgb.sav.repository.FuncionarioRepository;
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
@RequestMapping("/sav/funcionario")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository fr;
    
    
    @RequestMapping(value = {"/novo"}, method = RequestMethod.GET)
    public ModelAndView formulario(){
        ModelAndView mav = new ModelAndView();
        Funcionario funcionario = new Funcionario();
        mav.setViewName("form-funcionario");
        mav.addObject("funcionarioAtual", funcionario);
                     
        return mav;
    }
    
    @RequestMapping(value = {"/salvar"}, method = RequestMethod.POST)
    public String salvar(Funcionario funcionario){
        ModelAndView mav = new ModelAndView();
        fr.save(funcionario);
//        System.out.println("PLACA :"+veiculo.getPlaca());
//        mav.setViewName("redirect:form-veiculo");
        
        return "redirect:/sav/funcionario/novo";
    }
}
