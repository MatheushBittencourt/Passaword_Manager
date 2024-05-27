package br.univille.projfso2024a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notas")

public class NotasController {
    
    @GetMapping
    public ModelAndView notas(){
        return new ModelAndView("home/notas");
    }
}
