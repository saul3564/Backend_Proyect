package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import tec.proyect.backend_nuevo.Model.Temporadas;

public class Temporadas_RM implements RowMapper<Temporadas> {

    @Override
    @Nullable
    public Temporadas mapRow(ResultSet rs, int rowNum) throws SQLException {
        Temporadas temporada = new Temporadas();
        temporada.setId(rs.getByte("id"));
        temporada.setNumero_temporada(rs.getByte("numero_temporada"));
        temporada.setAnio_estreno(rs.getString("año_estreno"));
        temporada.setDescripcion(rs.getString("descripcion"));
        temporada.setSeries_id(rs.getByte("series_id"));
        return temporada;
    }
    
}
