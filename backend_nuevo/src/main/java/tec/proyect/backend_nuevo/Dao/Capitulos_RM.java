package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tec.proyect.backend_nuevo.Model.Capitulos;

public class Capitulos_RM implements RowMapper<Capitulos>{

    @Override
    public Capitulos mapRow(ResultSet rs, int rowNum) throws SQLException {
        Capitulos capitulos = new Capitulos();
        capitulos.setId(rs.getByte("id"));
        capitulos.setNombre(rs.getString("nombre"));
        capitulos.setIdioma(rs.getString("idioma"));
        capitulos.setDuracion(rs.getString("duracion"));
        capitulos.setSubtitulos(rs.getString("subtitulos"));
        capitulos.setTamano_descarga(rs.getString("tamano_descarga"));
        capitulos.setDescripcion(rs.getString("descripcion"));
        capitulos.setTemporadas_id(rs.getByte("temporadas_id"));
        return capitulos;
    }
}
