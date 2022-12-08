package tec.proyect.backend_nuevo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tec.proyect.backend_nuevo.Model.Capitulos;
import tec.proyect.backend_nuevo.Model.Capitulos_x_temporada;
import tec.proyect.backend_nuevo.Model.HistorialCapitulo;

@Repository
public class Capitulos_JDBC {
    
    @Autowired
    JdbcTemplate conexion;

    public List<Capitulos> consultarCapitulos(int id) {
        String sql = "SELECT * "+
                     "FROM capitulos C "+
                         "JOIN temporadas T ON (T.id = C.temporadas_id) "+
                         "JOIN series S ON (S.id = T.series_id) "+
                     "WHERE C.id = 94 AND S.Activo = 1;";
        return conexion.query(sql, new Capitulos_RM(), id);
    }

    public List<HistorialCapitulo> historialCapitulo(int id) {
        String sql = "SELECT  C.nombre, "+
                "H.fecha, "+
                "H.tiempo_avance Avance "+
        "FROM perfiles_usuarios P "+
                "JOIN historial_serie H ON (H.perfiles_usuarios_id = P.id) "+
                "JOIN capitulos C ON (C.id = H.capitulos_id) "+
        "WHERE P.id = ?;";
        return conexion.query(sql, new HistorialCapitulo_RM(), id);
    }

    public List<Capitulos_x_temporada> capitulos_x_temporada() {
        String sql = "SELECT T.id Temporada, C.nombre Capitulo "+
                     "FROM capitulos C "+
                        "JOIN temporadas T ON (T.id = C.temporadas_id) "+
                        "JOIN series S ON (S.id = T.series_id) "+
                     "WHERE S.Activo = 1;";
        return conexion.query(sql, new Capitulos_x_temporada_RM());
    }

    public void agregarCapitulos(Capitulos capitulo) {
        String sql = "INSERT INTO "+
                     "capitulos(nombre, idioma, duracion, subtitulos, tamano_descarga, descripcion, temporadas_id) "+
                     "VALUES (?, ?, ?, ?, ?, ?, ?);";
        conexion.update(
            sql, 
            capitulo.getNombre(), 
            capitulo.getIdioma(), 
            capitulo.getDuracion(), 
            capitulo.getSubtitulos(),
            capitulo.getTamano_descarga(),
            capitulo.getDescripcion(),
            capitulo.getTemporadas_id()
        );
    }
}
