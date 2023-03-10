package tec.proyect.backend_nuevo.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import tec.proyect.backend_nuevo.Dao.Mi_Lista_JDBC;
import tec.proyect.backend_nuevo.Model.Mi_Lista;
import tec.proyect.backend_nuevo.Model.PerfilUsuarioRequest;

@RestController
@RequestMapping("/netflix/lista")
public class Mi_Lista_REST {

	@Autowired
	Mi_Lista_JDBC repository;

	@PostMapping()
	public ResponseEntity<?> agregarNuevaLista(@RequestBody PerfilUsuarioRequest perfil) {
		try {
			repository.agregarNuevaLIsta(perfil);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}

	@GetMapping()
	public ResponseEntity<?> Obtener_Datos(@RequestParam int perfiles_usuarios_id) {
		try {
			List<Mi_Lista> lista = repository.Obtener_Lista(perfiles_usuarios_id);
			return new ResponseEntity<List<Mi_Lista>>(lista, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			// TODO: handle exception
		}
	}

	

	@DeleteMapping()
	public ResponseEntity<?> eliminarPelicula(@RequestParam int pelicula_id, @RequestParam int perfil_usuario_id)

{
	try {
		repository.eliminarPelicula(pelicula_id, perfil_usuario_id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	}
}

}