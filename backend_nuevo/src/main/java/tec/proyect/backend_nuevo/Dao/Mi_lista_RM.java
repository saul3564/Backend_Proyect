package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tec.proyect.backend_nuevo.Model.Mi_Lista;

public class Mi_lista_RM implements RowMapper <Mi_Lista>{
	
	@Override
	public Mi_Lista mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mi_Lista lista = new Mi_Lista();
		lista.setNombre(rs.getString("nombre"));
		lista.setPeliculas_id(rs.getInt("peliculas_id"));
		lista.setTitulo(rs.getString("titulo"));
		return lista;
	
		
	}

}
