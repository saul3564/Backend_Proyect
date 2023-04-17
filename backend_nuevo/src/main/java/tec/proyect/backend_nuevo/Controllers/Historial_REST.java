package tec.proyect.backend_nuevo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tec.proyect.backend_nuevo.Dao.Historial_JDBC;
import tec.proyect.backend_nuevo.Model.Historial;

@RestController
@RequestMapping("/historial")
public class Historial_REST {

	@Autowired
	Historial_JDBC repository;

@PutMapping
public ResponseEntity<?> actualizar(@RequestBody Historial historial) {
	try {
		repository.actualizar(historial);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	catch(Exception e){
		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	}
}
}
