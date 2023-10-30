package com.senacsp.projeto.p1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
    @RequestMapping("/serie")

    public class SerieController {

    @GetMapping
    public List<Serie> Listar(){
        List<Serie> list = new ArrayList<>();
        list.add( new Serie( " Breacking Bad", "Drama", 2008));
        list.add( new Serie( "Game of Thrones", "Aventura", 2011));
        list.add( new Serie( "Round 6", "Ação", 2022));
        list.add( new Serie(" Avatar 3 ", "Ação", 2023));
        return list;

    }

}
