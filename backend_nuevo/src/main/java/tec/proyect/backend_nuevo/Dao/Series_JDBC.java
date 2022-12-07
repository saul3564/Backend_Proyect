package tec.proyect.backend_nuevo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tec.proyect.backend_nuevo.Model.Series;

@Repository
public class Series_JDBC {
    
    @Autowired
    JdbcTemplate conexion;

    public List<Series> consultarSeries() {
        String sql = "SELECT * FROM series WHERE Activo=1;";
        return conexion.query(sql, new Series_RM());
    }
    public void insertar(Series series) {
		String sql = "INSERT INTO Series (año_estreno,valoracion, productora,titulo,sinopsis,categorias_id, activo) VALUES(?,?,?,?,?,?,?)";
		conexion.update(sql,series.getAnio_estreno(), series.getValoracion(), series.getProductora(), series.getTitulo(), series.getSinopsis(), series.getCategorias_id(), series.getActivo());
	}
}
