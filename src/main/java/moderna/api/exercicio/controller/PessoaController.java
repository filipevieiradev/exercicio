package moderna.api.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

    // Endpoint que recebe o ano nascimento e devolve a idade da pessoa
    @GetMapping("anonascimento/{n1}")
    public int idade(@PathVariable int n1){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        return n1-year;
    }

    // Endpoint que recebe o ano anoscimento e devolve a faixa etaria do cliente
    @GetMapping("anonascimento2/{n1}")
    public int idade(@PathVariable int n1){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        int idadeReal = n1-year;

        if idadeReal < 3 {
            return "Você é um Bebê";
        }else if idadeReal >2 && idadeReal<14 {
            return "Você é uma criança";
        }else if idadeReal >13 && idadeReal<20 {
            return "Você é Adolescente";
        }else if idadeReal>19 && idadeReal<30 {
            return "Você é jovem";
        }else if idadeReal>29 && idadeReal<60{
            return "Você é adulto";
        }else if idadeReal>59{
            return "Você é idoso";
        }
    }




}
