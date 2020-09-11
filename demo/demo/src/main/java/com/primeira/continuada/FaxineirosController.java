package com.primeira.continuada;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/faxineiros")
public class FaxineirosController {

    List<Faxineiro> listaFaxineiro = new ArrayList<>();


    @GetMapping
    public ResponseEntity listarFaxineiros() {
        if (listaFaxineiro.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(listaFaxineiro);
        }
    }
    

    @PostMapping
    public ResponseEntity cadastrarPorteiro(@RequestBody Faxineiro faxineiro) {
        listaFaxineiro.add(faxineiro);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity DemitirFaxineiro(@PathVariable int id) {
        if (listaFaxineiro.size() >= id) {
            listaFaxineiro.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public void contratarFaxineiros() {
        listaFaxineiro.add(new Faxineiro(
                "Carlos Santos",
                "221",
                5,
                200.00
        ));
        listaFaxineiro.add(new Faxineiro(
                "Marcia Pereira",
                "222",
                7,
                200.00
        ));
        listaFaxineiro.add(new Faxineiro(
                "Henrique Costa",
                "223",
                3,
                200.00
        ));
        listaFaxineiro.add(new Faxineiro(
                "Alice Silva",
                "224",
                8,
                200.00
        ));

    }

}
