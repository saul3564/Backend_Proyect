package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tec.proyect.backend_nuevo.Model.Capitulos_x_temporada;

public class Capitulos_x_temporada_RM implements RowMapper<Capitulos_x_temporada>{

    @Override
    public Capitulos_x_temporada mapRow(ResultSet rs, int rowNum) throws SQLException {
        Capitulos_x_temporada capitulos = new Capitulos_x_temporada();
        capitulos.setTemporada(rs.getByte("Temporada"));
        capitulos.setCapitulo(rs.getString("Capitulo"));
        return capitulos;
    }
    
}
