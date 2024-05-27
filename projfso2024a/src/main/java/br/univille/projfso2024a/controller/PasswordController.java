package br.univille.projfso2024a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projfso2024a.entity.Password;
import br.univille.projfso2024a.service.PasswordService;

@Controller
@RequestMapping("/passwords")
public class PasswordController {

    @Autowired
    private PasswordService service;

    @GetMapping
    public ModelAndView index(){
        var listaPasswords = service.getAll();
        return new ModelAndView("password/index", "listaPasswords", listaPasswords);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var password = new Password();
        return new ModelAndView("password/form", "password", password);
    }

    @PostMapping
    public ModelAndView save(Password password){
        service.save(password); 
        return new ModelAndView("redirect:/passwords");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var password = new Password();
        password.setId(id); 
        return new ModelAndView("password/form", "password", password);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        service.delete(id);
        return new ModelAndView("redirect:/passwords");
    }
}