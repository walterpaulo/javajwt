package com.demo.javajwt.controllers;

import com.demo.javajwt.domain.DTO.RepositoryDTO;
import com.demo.javajwt.domain.model.IRepository;
import com.demo.javajwt.infra.model.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RepositoryController {

    @GetMapping("/repo")
    public ResponseEntity<Iterable<Repository>> index(){
        Iterable<Repository> listaRepo = new ArrayList<>();
        return ResponseEntity.status(200).body(listaRepo);
    }

    @PostMapping("/repo")
    public ResponseEntity<RepositoryDTO> creat(@RequestBody RepositoryDTO repo){
        return ResponseEntity.status(201).body(repo);
    }

}
