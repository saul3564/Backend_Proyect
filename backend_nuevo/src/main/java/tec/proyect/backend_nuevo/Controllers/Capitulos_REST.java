package tec.proyect.backend_nuevo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tec.proyect.backend_nuevo.Dao.Capitulos_JDBC;
import tec.proyect.backend_nuevo.Model.Capitulos;
import tec.proyect.backend_nuevo.Model.Capitulos_x_temporada;
import tec.proyect.backend_nuevo.Model.HistorialCapitulo;

@RestController
@RequestMapping("/capitulos")
public class Capitulos_REST {
    
    @Autowired
    Capitulos_JDBC repository;

    @GetMapping("/{id}")
    public List<Capitulos> obtenerCapitulos(@PathVariable int id) {
        return repository.consultarCapitulos(id);
    }

    @GetMapping("/historial/{id}")
    public List<HistorialCapitulo> obtenerHistorialCapitulos(@PathVariable int id) {
        return repository.historialCapitulo(id);
    }

    @GetMapping("/por-temporada")
    public List<Capitulos_x_temporada> obtenerCapitulos_x_temporada() {
        return repository.capitulos_x_temporada();
    }

    @PostMapping
    public ResponseEntity<?>agregarCapitulo(@RequestBody Capitulos capitulo) {
        try {
            repository.agregarCapitulos(capitulo);
            return new ResponseEntity<Capitulos>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}
