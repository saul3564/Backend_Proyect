package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tec.proyect.backend_nuevo.Model.Series;

public class Series_RM implements RowMapper<Series> {

    @Override
    public Series mapRow(ResultSet rs, int rowNum) throws SQLException {

        Series series = new Series();
        series.setId(rs.getByte("id"));
        series.setAnio_estreno(rs.getString("año_estreno"));
        series.setValoracion(rs.getFloat("valoracion"));
        series.setProductora(rs.getString("productora"));
        series.setTitulo(rs.getString("titulo"));
        series.setSinopsis(rs.getString("sinopsis"));
        series.setCategorias_id(rs.getByte("categorias_id"));
        series.setActivo(rs.getString("activo"));
        return series;
    }
    
}
