package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuario;

	private String apellidos;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	private String nombre;

	private String pass;

	private BigDecimal peso;

	private String sexo;

	//bi-directional many-to-one association to Rm
	@ManyToOne
	@JoinColumn(name="rmCleanJerk" , insertable = false, updatable = false)
	private Rm rm1;

	//bi-directional many-to-one association to Rm
	@ManyToOne
	@JoinColumn(name="rmSnatch" , insertable = false, updatable = false)
	private Rm rm2;

	//bi-directional many-to-one association to Rm
	@ManyToOne
	@JoinColumn(name="rmSquat",  insertable = false, updatable = false)
	private Rm rm3;

	//bi-directional many-to-one association to Wod
	@OneToMany(mappedBy="usuarioBean")
	private List<Wod> wods;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Rm getRm1() {
		return this.rm1;
	}

	public void setRm1(Rm rm1) {
		this.rm1 = rm1;
	}

	public Rm getRm2() {
		return this.rm2;
	}

	public void setRm2(Rm rm2) {
		this.rm2 = rm2;
	}

	public Rm getRm3() {
		return this.rm3;
	}

	public void setRm3(Rm rm3) {
		this.rm3 = rm3;
	}

	public List<Wod> getWods() {
		return this.wods;
	}

	public void setWods(List<Wod> wods) {
		this.wods = wods;
	}

	public Wod addWod(Wod wod) {
		getWods().add(wod);
		wod.setUsuarioBean(this);

		return wod;
	}

	public Wod removeWod(Wod wod) {
		getWods().remove(wod);
		wod.setUsuarioBean(null);

		return wod;
	}

}