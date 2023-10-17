package moderna.api.exercicio.controller;


import moderna.api.exercicio.entidades.Noticias;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiasController {

    @GetMapping("/clima")
    public List<Noticias> listarNoticiasClima(){
        List<Noticias> listarNoticiasClima = new ArrayList<>();

        Noticias clima1 = new Noticias();
        Noticias clima2 = new Noticias();
        Noticias clima3 = new Noticias();

        clima1.setId(1);
        clima1.setTexto("Hoje o dia esta ensolarado");
        clima1.setDataPublicacao("28/08/2023");
        clima2.setId(2);
        clima2.setTexto("Chuvas e parcialmente nublado");
        clima2.setDataPublicacao("29/08/2023");
        clima3.setId(3);
        clima3.setTexto("Sol e calor");
        clima3.setDataPublicacao("30/08/2023");

        listarNoticiasClima.add(clima1);
        listarNoticiasClima.add(clima2);
        listarNoticiasClima.add(clima3);

        return listarNoticiasClima;
    }

    @GetMapping("/esportes")
    public List<Noticias> listarNoticiasEsportes(){
        List<Noticias> listarNoticiasEsportes = new ArrayList<>();

        Noticias esportes1 = new Noticias();
        Noticias esportes2 = new Noticias();
        Noticias esportes3 = new Noticias();

        esportes1.setId(1);
        esportes1.setTexto("Nautico Campeao");
        esportes1.setDataPublicacao("28/08/2023");
        esportes2.setId(2);
        esportes2.setTexto("Sport perde na ilha");
        esportes2.setDataPublicacao("29/08/2023");
        esportes3.setId(3);
        esportes3.setTexto("Santa Cruz rebaixado");
        esportes3.setDataPublicacao("30/08/2023");

        listarNoticiasEsportes.add(esportes1);
        listarNoticiasEsportes.add(esportes2);
        listarNoticiasEsportes.add(esportes3);

        return listarNoticiasEsportes;
    }


    @GetMapping("/celebridades")
    public List<Noticias> listarNoticiasCelebridades(){
        List<Noticias> listarNoticiasCelebridades = new ArrayList<>();

        Noticias celebridade1 = new Noticias();
        Noticias celebridade2 = new Noticias();
        Noticias celebridade3 = new Noticias();

        celebridade1.setId(1);
        celebridade1.setTexto("Lady Gaga desembarca em Recife");
        celebridade1.setDataPublicacao("28/08/2023");
        celebridade2.setId(2);
        celebridade2.setTexto("Sport perde na ilha");
        celebridade2.setDataPublicacao("29/08/2023");
        celebridade3.setId(3);
        celebridade3.setTexto("Santa Cruz rebaixado");
        celebridade3.setDataPublicacao("30/08/2023");

        listarNoticiasCelebridades.add(celebridade1);
        listarNoticiasCelebridades.add(celebridade2);
        listarNoticiasCelebridades.add(celebridade3);

        return listarNoticiasCelebridades;

    }


    @GetMapping("/tecnologia")
    public List<Noticias> listarNoticiasTecnologia(){
        List<Noticias> listarNoticiasTecnologia = new ArrayList<>();

        Noticias tecnologia1 = new Noticias();
        Noticias tecnologia2 = new Noticias();
        Noticias tecnologia3 = new Noticias();

        tecnologia1.setId(1);
        tecnologia1.setTexto("Lançado novo android");
        tecnologia1.setDataPublicacao("28/08/2023");
        tecnologia2.setId(2);
        tecnologia2.setTexto("iOS ultrapassado");
        tecnologia2.setDataPublicacao("29/08/2023");
        tecnologia3.setId(3);
        tecnologia3.setTexto("SQL Server revoluciona");
        tecnologia3.setDataPublicacao("30/08/2023");

        listarNoticiasTecnologia.add(tecnologia1);
        listarNoticiasTecnologia.add(tecnologia2);
        listarNoticiasTecnologia.add(tecnologia3);

        return listarNoticiasTecnologia;

    }






}
