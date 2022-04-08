package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the rm database table.
 * 
 */
@Entity
@NamedQuery(name="Rm.findAll", query="SELECT r FROM Rm r")
public class Rm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRm;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nombre;

	private BigDecimal peso;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="rm1")
	private List<Usuario> usuarios1;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="rm2")
	private List<Usuario> usuarios2;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="rm3")
	private List<Usuario> usuarios3;

	public Rm() {
	}

	public int getIdRm() {
		return this.idRm;
	}

	public void setIdRm(int idRm) {
		this.idRm = idRm;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public List<Usuario> getUsuarios1() {
		return this.usuarios1;
	}

	public void setUsuarios1(List<Usuario> usuarios1) {
		this.usuarios1 = usuarios1;
	}

	public Usuario addUsuarios1(Usuario usuarios1) {
		getUsuarios1().add(usuarios1);
		usuarios1.setRm1(this);

		return usuarios1;
	}

	public Usuario removeUsuarios1(Usuario usuarios1) {
		getUsuarios1().remove(usuarios1);
		usuarios1.setRm1(null);

		return usuarios1;
	}

	public List<Usuario> getUsuarios2() {
		return this.usuarios2;
	}

	public void setUsuarios2(List<Usuario> usuarios2) {
		this.usuarios2 = usuarios2;
	}

	public Usuario addUsuarios2(Usuario usuarios2) {
		getUsuarios2().add(usuarios2);
		usuarios2.setRm2(this);

		return usuarios2;
	}

	public Usuario removeUsuarios2(Usuario usuarios2) {
		getUsuarios2().remove(usuarios2);
		usuarios2.setRm2(null);

		return usuarios2;
	}

	public List<Usuario> getUsuarios3() {
		return this.usuarios3;
	}

	public void setUsuarios3(List<Usuario> usuarios3) {
		this.usuarios3 = usuarios3;
	}

	public Usuario addUsuarios3(Usuario usuarios3) {
		getUsuarios3().add(usuarios3);
		usuarios3.setRm3(this);

		return usuarios3;
	}

	public Usuario removeUsuarios3(Usuario usuarios3) {
		getUsuarios3().remove(usuarios3);
		usuarios3.setRm3(null);

		return usuarios3;
	}

}