package tec.proyect.backend_nuevo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tec.proyect.backend_nuevo.Model.Historial;

@Repository
public class Historial_JDBC {
@Autowired
JdbcTemplate conexion;

public void actualizar(Historial historial) {
	String sql = "UPDATE historial SET tiempo_avance= ?, WHERE id= ?";
	conexion.update(sql, historial.getTiempoAvance(),historial.getId());
}
}
