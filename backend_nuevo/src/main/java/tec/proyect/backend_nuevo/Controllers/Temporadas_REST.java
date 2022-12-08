package tec.proyect.backend_nuevo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tec.proyect.backend_nuevo.Dao.Temporadas_JDBC;
import tec.proyect.backend_nuevo.Model.Temporadas;

@RestController
@RequestMapping("/temporadas")
public class Temporadas_REST {
    
    @Autowired
    Temporadas_JDBC repository;

    @PostMapping
    public ResponseEntity<?> insertarTemporada(@RequestBody Temporadas temporada) {
        try {
            repository.agregarTemporadas(temporada);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}
