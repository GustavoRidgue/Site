package br.com.mastertech.hometeachear;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
    @GetMapping
    public String mostrarHome() {
        return "index";
    }

    @GetMapping("/contato")
    public String mostrarContato() {
        return "contato";
    }

    @GetMapping("/produtos")
    public String mostrarProduto() {
        return "produtos";
    }
    @GetMapping("/sobre")
    public String mostrarSobre() {
        return "sobre";
    }
}

