package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the rmsquat database table.
 * 
 */
@Entity
@NamedQuery(name="RmSquat.findAll", query="SELECT r FROM RmSquat r")
public class RmSquat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRmSquat;


	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal peso;

	//@Column(insertable=false, updatable=false)
	private int idUsuario;
	
	
	public RmSquat() {
	}
	
	
	public int getIdRmSquat() {
		return idRmSquat;
	}


	public void setIdRmSquat(int idRmSquat) {
		this.idRmSquat = idRmSquat;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}


}