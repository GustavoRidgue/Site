package br.com.mastertech.hometeachear;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AppController {
    @GetMapping
    public String mostrarHome() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>Document</title>\n" +
                "    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"header\">\n" +
                "        <h1>\n" +
                "            <a href=\"index.html\">Home Teacher</a>\n" +
                "        </h1>\n" +
                "\n" +
                "        <div>\n" +
                "            <a href=\"produtos.html\">Produtos</a>\n" +
                "            <a href=\"sobre.html\">Sobre</a>\n" +
                "            <a href=\"contato.html\">Contato</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <img class=\"banner\" src=\"https://images.unsplash.com/photo-1547619292-8816ee7cdd50?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80\" alt=\"Não sei o que dizer.\">\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/styles.css")
    public String mostrarEstilos(){
        return "body {\n" +
                "    margin: 0;\n" +
                "    font-family: sans-serif;\n" +
                "}\n" +
                "\n" +
                ".header{\n" +
                "    background-color: silver;\n" +
                "    overflow: auto;\n" +
                "    color: darkred;\n" +
                "    display: flex;\n" +
                "    align-items: center;\n" +
                "    justify-content: space-between;\n" +
                "    padding: 10px;\n" +
                "}\n" +
                "a{\n" +
                "    color: darkslateblue;\n" +
                "    text-decoration: none;\n" +
                "   \n" +
                "}\n" +
                ".banner {\n" +
                "    width: 100%;\n" +
                "}\n" +
                ".products {\n" +
                "    display: flex;\n" +
                "    justify-content: space-around;\n" +
                "}\n" +
                ".products div{\n" +
                "    width: 30%;\n" +
                "    text-align: center;\n" +
                "}\n" +
                ".products img {\n" +
                "    width: 100%;\n" +
                "    border-radius: 15px;\n" +
                "}\n" +
                "a{\n" +
                "    color: floralwhite;\n" +
                "    text-decoration: none;\n" +
                "}\n" +
                ".menu a{\n" +
                "    font-size: 20px;\n" +
                "    padding: 0 10px;\n" +
                "}\n" +
                "input{\n" +
                "    display: block;\n" +
                "    width: 90%;\n" +
                "    padding: 10px;\n" +
                "    margin: 10px 0;\n" +
                "}\n" +
                "form{\n" +
                "    width: 75%;\n" +
                "    margin: auto;\n" +
                "\n" +
                "}";
    }

    @GetMapping("/contato")
    public String mostrarContato() {
        Random random = new Random();
        int sorteio = random.nextInt();

        return "<h1>Página de Contato</h1>" +
                "<p>" + sorteio + "</p>";
    }

    @GetMapping("/produto")
    public String mostrarProduto() {
        return "<h1>Página de Produto</h1>";
    }
}

