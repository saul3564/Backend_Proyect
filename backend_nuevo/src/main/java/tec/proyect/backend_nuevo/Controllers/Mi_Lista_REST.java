package tec.proyect.backend_nuevo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import tec.proyect.backend_nuevo.Dao.Mi_Lista_JDBC;
import tec.proyect.backend_nuevo.Model.Mi_Lista;

@RestController
@RequestMapping("/netflix")
public class Mi_Lista_REST {
 
	@Autowired
	Mi_Lista_JDBC repository;
	
	 @GetMapping ("/lista")
	    public List<Mi_Lista> Obtener_Datos(@RequestParam int perfiles_usuarios_id) {
	        return repository.Obtener_Lista(perfiles_usuarios_id);
	    }
}
