package tec.proyect.backend_nuevo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tec.proyect.backend_nuevo.Model.HistorialCapitulo;

public class HistorialCapitulo_RM implements RowMapper<HistorialCapitulo>{

    @Override
    public HistorialCapitulo mapRow(ResultSet rs, int rowNum) throws SQLException {
        HistorialCapitulo historial = new HistorialCapitulo();
        historial.setNombre(rs.getString("nombre"));
        historial.setFecha(rs.getString("fecha"));
        historial.setAvance(rs.getString("Avance"));
        return historial;
    }
}
