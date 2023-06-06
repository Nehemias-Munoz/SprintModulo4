package modelos.cliente;

import java.time.LocalDate;

import interfaces.asesoria.Asesoria;
import modelos.usuario.Usuario;

/**
 * @author nehemiasmunoz
 */
public class Cliente extends Usuario implements Asesoria {
	private String nombreEmpresa;
	private String giroEmpresa;
	private String telefonoRepresentante;
	private String direccionEmpresa;
	private String comunaEmpresa;

	/**
	 * Constructor vacio
	 */
	public Cliente() {
	}

	/**
	 * Constructor de la clase
	 * 
	 * @param nombreEmpresa
	 * @param giroEmpresa
	 * @param telefonoRepresentante
	 * @param direccionEmpresa
	 * @param comunaEmpresa
	 */
	public Cliente(String nombreEmpresa, String giroEmpresa, String telefonoRepresentante, String direccionEmpresa,
			String comunaEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.giroEmpresa = giroEmpresa;
		this.telefonoRepresentante = telefonoRepresentante;
		this.direccionEmpresa = direccionEmpresa;
		this.comunaEmpresa = comunaEmpresa;
	}

	/**
	 * Constructor de la clase propio y herencia
	 * 
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param fechaNacimiento
	 * @param run
	 * @param nombreEmpresa
	 * @param giroEmpresa
	 * @param telefonoRepresentante
	 * @param direccionEmpresa
	 * @param comunaEmpresa
	 */
	public Cliente(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String run,
			String nombreEmpresa, String giroEmpresa, String telefonoRepresentante, String direccionEmpresa,
			String comunaEmpresa) {
		super(nombre, apellido1, apellido2, fechaNacimiento, run);
		this.nombreEmpresa = nombreEmpresa;
		this.giroEmpresa = giroEmpresa;
		this.telefonoRepresentante = telefonoRepresentante;
		this.direccionEmpresa = direccionEmpresa;
		this.comunaEmpresa = comunaEmpresa;
	}

	/**
	 * Metodo que retorna los parametros y valores de la clase
	 * 
	 * @return mensaje con lo datos del cliente
	 */
	@Override
	public String toString() {
		return "Cliente [nombreEmpresa=" + nombreEmpresa + ", giroEmpresa=" + giroEmpresa + ", telefonoRepresentante="
				+ telefonoRepresentante + ", direccionEmpresa=" + direccionEmpresa + ", comunaEmpresa=" + comunaEmpresa
				+ "]";
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTelefonoRepresentante() {
		return telefonoRepresentante;
	}

	public void setTelefonoRepresentante(String telefonoRepresentante) {
		this.telefonoRepresentante = telefonoRepresentante;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public String getComunaEmpresa() {
		return comunaEmpresa;
	}

	public void setComunaEmpresa(String comunaEmpresa) {
		this.comunaEmpresa = comunaEmpresa;
	}

	/**
	 * Metodo que retorna el nombre completo de la empresa
	 * 
	 * @return String que contiene el nombre de la empresa
	 */
	public String obtenerNombre() {
		return nombreEmpresa;
	}

	/**
	 * Metodo que complementado con la interfaz muestra por consola datos del
	 * cliente
	 */
	@Override
	public void analizarUsuario() {
		System.out.println("Direccion" + direccionEmpresa + "\nComuna" + comunaEmpresa);
	}

	public String getGiroEmpresa() {
		return giroEmpresa;
	}

	public void setGiroEmpresa(String giroEmpresa) {
		this.giroEmpresa = giroEmpresa;
	}
}
