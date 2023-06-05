package modelos.profesional;

import interfaces.asesoria.Asesoria;
import modelos.usuario.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author nehemiasmunoz
 */
public class Profesional  extends Usuario implements Asesoria {
    private String titulo;
    private LocalDate fechaIngreso;

    /**
     * Constructor vacio
     */
    public Profesional() {
    }

    /**
     * Constructor de la clase con parametros
     * 
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String titulo, LocalDate fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Constructor de la clase con parametros y herencia
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param titulo
     * @param fechaIngreso
     */
    public Profesional(String nombre, LocalDate fechaNacimiento, String run, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     * 
     * @return String que contiene los parametros y valores de la clase
     */
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return fechaIngreso.format(dateFormat);
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Metodo que complementado con la interfaz muestra por consola datos del
     * usuario profesional
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Titulo: " + titulo + "\nFecha Ingreso: " + getFechaIngreso());
    }
}
