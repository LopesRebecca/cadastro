package Controller.pessoas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PessoaController {

    @RequestMapping("/cadastrarPessoa")
    public String form(){
        return "FormPessoaCadastro";
    }
}
