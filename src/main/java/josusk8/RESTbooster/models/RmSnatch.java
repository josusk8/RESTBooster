package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the rmsnatch database table.
 * 
 */
@Entity
@NamedQuery(name="RmSnatch.findAll", query="SELECT r FROM RmSnatch r")
public class RmSnatch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRmSnatch;


	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal peso;

	//@Column(insertable=false, updatable=false)
	private int idUsuario;
	
	
	public RmSnatch() {
	}
	
	
	public int getIdRmSnatch() {
		return idRmSnatch;
	}


	public void setIdRmSnatch(int idRmSnatch) {
		this.idRmSnatch = idRmSnatch;
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