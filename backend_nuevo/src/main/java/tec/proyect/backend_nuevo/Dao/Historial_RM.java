package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import tec.proyect.backend_nuevo.Model.Historial;

public class Historial_RM  implements RowMapper<Historial>{

@Override
@Nullable
public Historial mapRow(ResultSet rs, int rowNum) throws SQLException {
	Historial historial = new Historial();
	historial.setId(rs.getInt("id"));
	historial.setFecha(rs.getTimestamp("fecha"));
	historial.setTiempoAvance(rs.getTime("tiempo_avance"));
	historial.setPeliculaId(rs.getInt("pelicula_id"));
	historial.setPerfilId(rs.getInt("perfil_id"));
	return historial;
}

}