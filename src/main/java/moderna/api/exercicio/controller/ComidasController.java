package moderna.api.exercicio.controller;


import moderna.api.exercicio.entidades.Comidas;
import moderna.api.exercicio.entidades.Filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comidas")
public class ComidasController {

    @GetMapping("/lista-comidas")
    public List<Comidas> listarComidasPreferidas(){
        List<Comidas> listarComidasPreferidas= new ArrayList<>();
        Comidas comida1 = new Comidas();
        Comidas comida2 = new Comidas();
        Comidas comida3 = new Comidas();
        comida1.setId(1);
        comida1.setNome("Macarrão");
        comida1.setIngredientes("Trigo");
        comida2.setId(2);
        comida2.setNome("Pao");
        comida2.setIngredientes("Farinha");
        comida3.setId(3);
        comida3.setNome("Lasanha");
        comida3.setIngredientes("Massa p lasanha");

        listarComidasPreferidas.add(comida1);
        listarComidasPreferidas.add(comida2);
        listarComidasPreferidas.add(comida3);

        return listarComidasPreferidas;
    }





}
