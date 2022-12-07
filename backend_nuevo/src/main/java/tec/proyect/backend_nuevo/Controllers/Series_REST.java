package tec.proyect.backend_nuevo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tec.proyect.backend_nuevo.Dao.Series_JDBC;
import tec.proyect.backend_nuevo.Model.Series;

@RestController
@RequestMapping("/series")
public class Series_REST {
    
    @Autowired
    Series_JDBC repository;

    @GetMapping
    public List<Series>obtenerSeries() {
        return repository.consultarSeries();
    }
}
