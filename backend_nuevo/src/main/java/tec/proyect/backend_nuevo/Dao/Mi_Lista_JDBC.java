package tec.proyect.backend_nuevo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tec.proyect.backend_nuevo.Model.Mi_Lista;

@Repository
public class Mi_Lista_JDBC {
	
	@Autowired
	 JdbcTemplate conexion;
	
	 public List<Mi_Lista> Obtener_Lista(int perfiles_usuarios_id) {
	        String sql = "SELECT PU.nombre, M.peliculas_id, P.titulo\r\n"
	        		+ "FROM mi_lista M\r\n"
	        		+ "JOIN peliculas P ON (P.id = M.peliculas_id)\r\n"
	        		+ "JOIN perfiles_usuarios PU ON (PU.id = M.perfiles_usuarios_id)\r\n"
	        		+ "WHERE perfiles_usuarios_id = ?;";
	        return conexion.query(sql, new Mi_lista_RM(), perfiles_usuarios_id);
	
}
	 }
