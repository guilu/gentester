package com.fire.academy.api.controller;

import com.fire.academy.api.model.Pregunta;
import com.fire.academy.api.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import static java.util.Collections.*;

@RestController
@RequestMapping(path = "${spring.data.rest.base-path}")
public class PreguntaController {

    private final PreguntaRepository preguntaRepository;

    @Autowired
    public PreguntaController(PreguntaRepository preguntaRepository){
        this.preguntaRepository = preguntaRepository;
    }

    @GetMapping("/preguntas/shuffle/{id}")
    public ResponseEntity<Pregunta> shufflePreguntaById(@PathVariable Long id){
        Optional<Pregunta> pregunta =  this.preguntaRepository.findById(id);
        if(pregunta.isPresent()) {
            shuffle(pregunta.get().getRespuestas());
            return new ResponseEntity<Pregunta>(pregunta.get(), HttpStatus.OK);
        }
        return null;
    }
}
