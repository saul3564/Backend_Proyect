package tec.proyect.backend_nuevo.Model;

import java.sql.Time;
import java.sql.Timestamp;

public class Historial {
	private int id;
	private Timestamp fecha;
	private Time tiempoAvance;
	private int peliculaId;
	private int perfilId;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
	public Time getTiempoAvance() {
		return tiempoAvance;
	}
	public void setTiempoAvance(Time tiempoAvance) {
		this.tiempoAvance = tiempoAvance;
	}
	public int getPeliculaId() {
		return peliculaId;
	}
	public void setPeliculaId(int peliculaId) {
		this.peliculaId = peliculaId;
	}
	public int getPerfilId() {
		return perfilId;
	}
	public void setPerfilId(int perfilId) {
		this.perfilId = perfilId;
	}
}
