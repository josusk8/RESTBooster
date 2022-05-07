package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the wod database table.
 * 
 */
@Entity
@NamedQuery(name="Wod.findAll", query="SELECT w FROM Wod w")
public class Wod implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idWod;
	
	private int idUsuario;


	private String comentario;

	private int dia;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int semana;
	
	private int completo;

	public Wod() {
	}

	public int getIdWod() {
		return idWod;
	}

	public void setIdWod(int idWod) {
		this.idWod = idWod;
	}

	public int getCompleto() {
		return completo;
	}

	public void setCompleto(int completo) {
		this.completo = completo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSemana() {
		return semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	

}