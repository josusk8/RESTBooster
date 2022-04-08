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

	private byte check;

	private String comentario;

	private int dia;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int semana;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	@JoinColumn(name="movPrincipal", insertable = false, updatable = false)
	private Ejercicio ejercicio1;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	@JoinColumn(name="pullMovPrincipal", insertable = false, updatable = false)
	private Ejercicio ejercicio2;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	@JoinColumn(name="varMovSecundario", insertable = false, updatable = false)
	private Ejercicio ejercicio3;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	@JoinColumn(name="squat", insertable = false, updatable = false)
	private Ejercicio ejercicio4;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usuario", insertable = false, updatable = false)
	private Usuario usuarioBean;

	//bi-directional many-to-one association to Ejercicio
	@ManyToOne
	@JoinColumn(name="varMovSecundario", insertable = false, updatable = false)
	private Ejercicio ejercicio5;

	public Wod() {
	}

	public int getIdWod() {
		return this.idWod;
	}

	public void setIdWod(int idWod) {
		this.idWod = idWod;
	}

	public byte getCheck() {
		return this.check;
	}

	public void setCheck(byte check) {
		this.check = check;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getSemana() {
		return this.semana;
	}

	public void setSemana(int semana) {
		this.semana = semana;
	}

	public Ejercicio getEjercicio1() {
		return this.ejercicio1;
	}

	public void setEjercicio1(Ejercicio ejercicio1) {
		this.ejercicio1 = ejercicio1;
	}

	public Ejercicio getEjercicio2() {
		return this.ejercicio2;
	}

	public void setEjercicio2(Ejercicio ejercicio2) {
		this.ejercicio2 = ejercicio2;
	}

	public Ejercicio getEjercicio3() {
		return this.ejercicio3;
	}

	public void setEjercicio3(Ejercicio ejercicio3) {
		this.ejercicio3 = ejercicio3;
	}

	public Ejercicio getEjercicio4() {
		return this.ejercicio4;
	}

	public void setEjercicio4(Ejercicio ejercicio4) {
		this.ejercicio4 = ejercicio4;
	}

	public Usuario getUsuarioBean() {
		return this.usuarioBean;
	}

	public void setUsuarioBean(Usuario usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	public Ejercicio getEjercicio5() {
		return this.ejercicio5;
	}

	public void setEjercicio5(Ejercicio ejercicio5) {
		this.ejercicio5 = ejercicio5;
	}

}