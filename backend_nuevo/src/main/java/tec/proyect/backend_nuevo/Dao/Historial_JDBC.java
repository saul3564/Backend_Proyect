package tec.proyect.backend_nuevo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tec.proyect.backend_nuevo.Model.Historial;

@Repository
public class Historial_JDBC {
@Autowired
JdbcTemplate conexion;

public void agregar(Historial historial) {
	String sql = "INSERT INTO historial (fecha, tiempo_avance,perfiles_usuarios_id, peliculas_id)"
			+"VALUES (?,?,?,?)";
	conexion.update(sql,historial.getFecha(),
			historial.getTiempoAvance(),
			historial.getPerfilId(),
			historial.getPeliculaId());
			
}
public void actualizar(Historial historial) {
	String sql = "UPDATE historial SET tiempo_avance= ? WHERE id= ?";
	conexion.update(sql, historial.getTiempoAvance(),historial.getId());
//Actualizar
}

public void eliminar(Historial historial) {
	String sql = "DELETE FROM historial WHERE id= ?";
	conexion.update(sql,historial.getId());
	//Eliminar elemento
}
}
