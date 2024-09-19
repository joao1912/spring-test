package com.projeto.java_spring.UserController;

import com.projeto.java_spring.model.Profissao;
import com.projeto.java_spring.services.ProfissaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {

    @Autowired
    private ProfissaoService profissaoService;

    @GetMapping
    public List<Profissao> getAllProfissoes() {
        return profissaoService.getAllProfissoes();
    }

    @PostMapping
    public Profissao createProfissao(@RequestBody Profissao profissao) {

        return profissaoService.saveProfissao(profissao);
       
    }
}
