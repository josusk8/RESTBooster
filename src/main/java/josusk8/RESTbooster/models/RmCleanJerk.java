package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the rmcleanJerk database table.
 * 
 */
@Entity
@NamedQuery(name="RmCleanJerk.findAll", query="SELECT r FROM RmCleanJerk r")
public class RmCleanJerk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRmCleanJerk;


	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal peso;

	//@Column(insertable=false, updatable=false)
	private int idUsuario;
	
	
	public RmCleanJerk() {
	}
	
	
	public int getIdRmCleanJerk() {
		return idRmCleanJerk;
	}


	public void setIdRmCleanJerk(int idRmCleanJerk) {
		this.idRmCleanJerk = idRmCleanJerk;
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