package josusk8.RESTbooster.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the squat database table.
 * 
 */
@Entity
@NamedQuery(name="VarMovimientoSecundario.findAll", query="SELECT m FROM VarMovimientoSecundario m")
public class VarMovimientoSecundario implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVarmovimientosecundario;

	private int idWod;
	
	private int idUsuario;

	private String nombre;

	private BigDecimal pesoMax;

	private BigDecimal pesoMin;

	private int pocentajeMin;

	private int porcentajeMax;

	private int repsOptima;

	private int serieMax;

	private int serieMin;

	private int repsTotalMax;

	private int repsTotalMin;

	private BigDecimal rm;



	public VarMovimientoSecundario() {
	}



	public int getIdVarMovimientoSecundario() {
		return idVarmovimientosecundario;
	}



	public void setIdVarMovimientoSecundario(int idVarmovimientosecundario) {
		this.idVarmovimientosecundario = idVarmovimientosecundario;
	}



	public int getIdWod() {
		return idWod;
	}



	public void setIdWod(int idWod) {
		this.idWod = idWod;
	}



	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public BigDecimal getPesoMax() {
		return pesoMax;
	}



	public void setPesoMax(BigDecimal pesoMax) {
		this.pesoMax = pesoMax;
	}



	public BigDecimal getPesoMin() {
		return pesoMin;
	}



	public void setPesoMin(BigDecimal pesoMin) {
		this.pesoMin = pesoMin;
	}



	public int getPocentajeMin() {
		return pocentajeMin;
	}



	public void setPocentajeMin(int pocentajeMin) {
		this.pocentajeMin = pocentajeMin;
	}



	public int getPorcentajeMax() {
		return porcentajeMax;
	}



	public void setPorcentajeMax(int porcentajeMax) {
		this.porcentajeMax = porcentajeMax;
	}



	public int getRepsOptima() {
		return repsOptima;
	}



	public void setRepsOptima(int repsOptima) {
		this.repsOptima = repsOptima;
	}



	public int getSerieMax() {
		return serieMax;
	}



	public void setSerieMax(int serieMax) {
		this.serieMax = serieMax;
	}



	public int getSerieMin() {
		return serieMin;
	}



	public void setSerieMin(int serieMin) {
		this.serieMin = serieMin;
	}



	public int getRepsTotalMax() {
		return repsTotalMax;
	}



	public void setRepsTotalMax(int repsTotalMax) {
		this.repsTotalMax = repsTotalMax;
	}



	public int getRepsTotalMin() {
		return repsTotalMin;
	}



	public void setRepsTotalMin(int repsTotalMin) {
		this.repsTotalMin = repsTotalMin;
	}



	public BigDecimal getRm() {
		return rm;
	}



	public void setRm(BigDecimal rm) {
		this.rm = rm;
	}






}