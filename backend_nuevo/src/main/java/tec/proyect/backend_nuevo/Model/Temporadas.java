package tec.proyect.backend_nuevo.Model;

public class Temporadas {
    
    private byte id;
    private byte numero_temporada;
    private String anio_estreno;
    private String descripcion;
    private byte series_id;


    public byte getId() {
        return this.id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getNumero_temporada() {
        return this.numero_temporada;
    }

    public void setNumero_temporada(byte numero_temporada) {
        this.numero_temporada = numero_temporada;
    }

    public String getAnio_estreno() {
        return this.anio_estreno;
    }

    public void setAnio_estreno(String anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getSeries_id() {
        return this.series_id;
    }

    public void setSeries_id(byte series_id) {
        this.series_id = series_id;
    }

}
