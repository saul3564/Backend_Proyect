package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import tec.proyect.backend_nuevo.Model.Temporada_x_serie;

public class Temporada_x_serieRM implements RowMapper<Temporada_x_serie> {
 
	@Override
	public Temporada_x_serie mapRow(ResultSet rs, int rowNum) throws SQLException {
        Temporada_x_serie temporadas = new Temporada_x_serie();
        temporadas.setSeries(rs.getString("Series"));
        temporadas.setTemporadas(rs.getByte("Temporadas"));
        return temporadas;
    }
}
