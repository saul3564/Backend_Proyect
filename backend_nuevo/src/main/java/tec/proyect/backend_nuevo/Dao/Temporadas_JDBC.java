package tec.proyect.backend_nuevo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tec.proyect.backend_nuevo.Model.Temporadas;

@Repository
public class Temporadas_JDBC {
    
    @Autowired
    JdbcTemplate conexion;

    public void agregarTemporadas(Temporadas temporadas) {
        String sql = "INSERT INTO "+
        "temporadas(numero_temporada, año_estreno, descripcion, series_id) "+
        "VALUES (?, ?, ?, ?);";
        conexion.update(sql, 
            temporadas.getNumero_temporada(), 
            temporadas.getAnio_estreno(),
            temporadas.getDescripcion(),
            temporadas.getSeries_id()
        );
    }
}
