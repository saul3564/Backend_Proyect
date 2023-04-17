package tec.proyect.backend_nuevo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tec.proyect.backend_nuevo.Dao.Historial_JDBC;
import tec.proyect.backend_nuevo.Model.Historial;
import tec.proyect.backend_nuevo.Model.Mi_Lista;

@RestController
@RequestMapping("/historial")
public class Historial_REST {

	@Autowired
	Historial_JDBC repository;
	
	@PostMapping
	public ResponseEntity<?> agregar(@RequestBody Historial historial) {
		try {
			repository.agregar(historial);
			return new ResponseEntity<Mi_Lista>(HttpStatus.CREATED);
		}
		catch(Exception e){
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
}
