package com.hildo.costa.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/tarefas")
public class ApiController {

    private List<String> tarefas = new ArrayList<>();

    private ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<String> listTarefas() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tarefas));
    }

    @PostMapping
    public ResponseEntity<Void> createTarefas(@RequestBody String novaTarefa) {
        tarefas.add(novaTarefa);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> cleatTarefas(){
        tarefas = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}
