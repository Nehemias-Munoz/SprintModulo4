package modelos.administrativo;

import modelos.usuario.Usuario;

import java.time.LocalDate;

public class Administrativo extends Usuario {
    private String area;
    private String experiencia;

    /**
     * Constructor vacio
     */
    public Administrativo() {
    }

    /**
     * Constructor de la clase
     * @param area
     * @param experiencia
     */
    public Administrativo(String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
    }

    /**
     * Constructor de la clase con herencia
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param area
     * @param experiencia
     */
    public Administrativo(String nombre, LocalDate fechaNacimiento, String run, String area, String experiencia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experiencia = experiencia;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     * @return String que contiene los parametros y valores de la clase
     */
    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
    /**
     * Metodo que complementado con la interfaz muestra por consola datos del usuario Administrativo
     */
    public void analizarUsuario(){
        //Todo: Implementar interfaz (Asesoria)
        System.out.println("Area: "+ area + "\nExperiencia: "+experiencia);
    }
}
