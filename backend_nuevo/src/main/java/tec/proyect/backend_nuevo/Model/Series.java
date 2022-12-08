package tec.proyect.backend_nuevo.Model;

public class Series {
    
    private byte id;
    private String anio_estreno;
    private Float valoracion;
    private String productora;
    private String titulo;
    private String sinopsis;
    private byte categorias_id;


    public byte getId() {
        return this.id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getAnio_estreno() {
        return this.anio_estreno;
    }

    public void setAnio_estreno(String anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public Float getValoracion() {
        return this.valoracion;
    }

    public void setValoracion(Float valoracion) {
        this.valoracion = valoracion;
    }

    public String getProductora() {
        return this.productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public byte getCategorias_id() {
        return this.categorias_id;
    }

    public void setCategorias_id(byte categorias_id) {
        this.categorias_id = categorias_id;
    }

}
