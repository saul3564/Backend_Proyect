package tec.proyect.backend_nuevo.Model;

public class Capitulos {
    
    private byte id;
    private String nombre;
    private String idioma;
    private String duracion;
    private String subtitulos;
    private String tamano_descarga;
    private String descripcion;
    private byte temporadas_id;


    public byte getId() {
        return this.id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSubtitulos() {
        return this.subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getTamano_descarga() {
        return this.tamano_descarga;
    }

    public void setTamano_descarga(String tamano_descarga) {
        this.tamano_descarga = tamano_descarga;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte getTemporadas_id() {
        return this.temporadas_id;
    }

    public void setTemporadas_id(byte temporadas_id) {
        this.temporadas_id = temporadas_id;
    }

}
