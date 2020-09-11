package com.primeira.continuada;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/porteiros")
public class PorteirosController {

    List<Porteiro> listaPorteiro = new ArrayList<>();

    @GetMapping
    public ResponseEntity listarPorteiro() {
        if (listaPorteiro.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listaPorteiro);

        }
    }

    @PostMapping("/porteiros")
    public ResponseEntity cadastrarPorteiro(@RequestBody Porteiro porteiro) {
        listaPorteiro.add(porteiro);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity DemitirPorteiro(@PathVariable int id) {
        if (listaPorteiro.size() >= id) {
            listaPorteiro.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public void contratarPorteiro() {
        listaPorteiro.add(new Porteiro(
                "Pedro Silva",
                "112",
                1500.00
        ));
        listaPorteiro.add(new Porteiro(
                "Laura Diaz",
                "113",
                1500.00
        ));
        listaPorteiro.add(new Porteiro(
                "Beatriz Souza",
                "114",
                1500.00
        ));
        listaPorteiro.add(new Porteiro(
                "Ricardo Almeida",
                "115",
                1500.00
        ));
    }
}