package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ejercicio database table.
 * 
 */
@Entity
@NamedQuery(name="Ejercicio.findAll", query="SELECT e FROM Ejercicio e")
public class Ejercicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEjercicio;

	private String nombre;

	private BigDecimal pesoMax;

	private BigDecimal pesoMin;

	private int pocentajeMin;

	private int porcentajeMax;

	private int repsOptima;

	private int repsSerieMax;

	private int repsSerieMin;

	private int repsTotalMax;

	private int repsTotalMin;

	private BigDecimal rm;

	//bi-directional many-to-one association to Wod
	@OneToMany(mappedBy="ejercicio1")
	private List<Wod> wods1;

	//bi-directional many-to-one association to Wod
	@OneToMany(mappedBy="ejercicio2")
	private List<Wod> wods2;

	//bi-directional many-to-one association to Wod
	@OneToMany(mappedBy="ejercicio3")
	private List<Wod> wods3;

	//bi-directional many-to-one association to Wod
	@OneToMany(mappedBy="ejercicio4")
	private List<Wod> wods4;

	//bi-directional many-to-one association to Wod
	@OneToMany(mappedBy="ejercicio5")
	private List<Wod> wods5;

	public Ejercicio() {
	}

	public int getIdEjercicio() {
		return this.idEjercicio;
	}

	public void setIdEjercicio(int idEjercicio) {
		this.idEjercicio = idEjercicio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPesoMax() {
		return this.pesoMax;
	}

	public void setPesoMax(BigDecimal pesoMax) {
		this.pesoMax = pesoMax;
	}

	public BigDecimal getPesoMin() {
		return this.pesoMin;
	}

	public void setPesoMin(BigDecimal pesoMin) {
		this.pesoMin = pesoMin;
	}

	public int getPocentajeMin() {
		return this.pocentajeMin;
	}

	public void setPocentajeMin(int pocentajeMin) {
		this.pocentajeMin = pocentajeMin;
	}

	public int getPorcentajeMax() {
		return this.porcentajeMax;
	}

	public void setPorcentajeMax(int porcentajeMax) {
		this.porcentajeMax = porcentajeMax;
	}

	public int getRepsOptima() {
		return this.repsOptima;
	}

	public void setRepsOptima(int repsOptima) {
		this.repsOptima = repsOptima;
	}

	public int getRepsSerieMax() {
		return this.repsSerieMax;
	}

	public void setRepsSerieMax(int repsSerieMax) {
		this.repsSerieMax = repsSerieMax;
	}

	public int getRepsSerieMin() {
		return this.repsSerieMin;
	}

	public void setRepsSerieMin(int repsSerieMin) {
		this.repsSerieMin = repsSerieMin;
	}

	public int getRepsTotalMax() {
		return this.repsTotalMax;
	}

	public void setRepsTotalMax(int repsTotalMax) {
		this.repsTotalMax = repsTotalMax;
	}

	public int getRepsTotalMin() {
		return this.repsTotalMin;
	}

	public void setRepsTotalMin(int repsTotalMin) {
		this.repsTotalMin = repsTotalMin;
	}

	public BigDecimal getRm() {
		return this.rm;
	}

	public void setRm(BigDecimal rm) {
		this.rm = rm;
	}

	public List<Wod> getWods1() {
		return this.wods1;
	}

	public void setWods1(List<Wod> wods1) {
		this.wods1 = wods1;
	}

	public Wod addWods1(Wod wods1) {
		getWods1().add(wods1);
		wods1.setEjercicio1(this);

		return wods1;
	}

	public Wod removeWods1(Wod wods1) {
		getWods1().remove(wods1);
		wods1.setEjercicio1(null);

		return wods1;
	}

	public List<Wod> getWods2() {
		return this.wods2;
	}

	public void setWods2(List<Wod> wods2) {
		this.wods2 = wods2;
	}

	public Wod addWods2(Wod wods2) {
		getWods2().add(wods2);
		wods2.setEjercicio2(this);

		return wods2;
	}

	public Wod removeWods2(Wod wods2) {
		getWods2().remove(wods2);
		wods2.setEjercicio2(null);

		return wods2;
	}

	public List<Wod> getWods3() {
		return this.wods3;
	}

	public void setWods3(List<Wod> wods3) {
		this.wods3 = wods3;
	}

	public Wod addWods3(Wod wods3) {
		getWods3().add(wods3);
		wods3.setEjercicio3(this);

		return wods3;
	}

	public Wod removeWods3(Wod wods3) {
		getWods3().remove(wods3);
		wods3.setEjercicio3(null);

		return wods3;
	}

	public List<Wod> getWods4() {
		return this.wods4;
	}

	public void setWods4(List<Wod> wods4) {
		this.wods4 = wods4;
	}

	public Wod addWods4(Wod wods4) {
		getWods4().add(wods4);
		wods4.setEjercicio4(this);

		return wods4;
	}

	public Wod removeWods4(Wod wods4) {
		getWods4().remove(wods4);
		wods4.setEjercicio4(null);

		return wods4;
	}

	public List<Wod> getWods5() {
		return this.wods5;
	}

	public void setWods5(List<Wod> wods5) {
		this.wods5 = wods5;
	}

	public Wod addWods5(Wod wods5) {
		getWods5().add(wods5);
		wods5.setEjercicio5(this);

		return wods5;
	}

	public Wod removeWods5(Wod wods5) {
		getWods5().remove(wods5);
		wods5.setEjercicio5(null);

		return wods5;
	}

}