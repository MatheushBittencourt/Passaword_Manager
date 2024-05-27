package br.univille.projfso2024a;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import br.univille.projfso2024a.entity.Password;
import br.univille.projfso2024a.service.PasswordService;

@Component
public class Startup {
    @Autowired
    private PasswordService service;

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event){
        // var cliente1 = new Cliente();
        // cliente1.setNome("Zezinho");
        // cliente1.setEndereco("Rua lalalalla 100");
        // cliente1.setDataNascimento(new Date(2024,04,17));
        // service.save(cliente1);
    }
}
