package tec.proyect.backend_nuevo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tec.proyect.backend_nuevo.Dao.Series_JDBC;
import tec.proyect.backend_nuevo.Model.Series;
import tec.proyect.backend_nuevo.Model.Temporada_x_serie;

@RestController
@RequestMapping("/series")
public class Series_REST {
    
    @Autowired
    Series_JDBC repository;

    @GetMapping
    public List<Series>obtenerSeries() {
        return repository.consultarSeries();
    }

	@PostMapping
	public ResponseEntity<?> insertarSerie(@RequestBody Series series){
		try {
			repository.insertar(series);
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
}
	@GetMapping("/por-temporada")
    public List<Temporada_x_serie> obtenerTemporada_x_serie() {
        return repository.Temporada_x_serie();
    }
}
