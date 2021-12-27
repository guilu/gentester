package com.fire.academy.api.controller;

import com.fire.academy.api.model.Pregunta;
import com.fire.academy.api.model.Tema;
import com.fire.academy.api.repository.TemaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Optional;

@RestController
@RequestMapping(path = "${spring.data.rest.base-path}")
public class TemaController {

    private final TemaRepository temaRepository;

    public TemaController(TemaRepository temaRepository) {
        this.temaRepository = temaRepository;
    }

    @GetMapping("/temas/shuffle/{id}")
    public ResponseEntity<Tema> shufflePreguntasOfTemaByIdTema(@PathVariable Long id) {
        Optional<Tema> tema = temaRepository.findById(id);

        if (tema.isEmpty()) return null;
        for (Pregunta pregunta : tema.get().getPreguntas()) {
            Collections.shuffle(pregunta.getRespuestas());
        }
        Collections.shuffle(tema.get().getPreguntas());
        return new ResponseEntity<>(tema.get(), HttpStatus.OK);

    }
}
