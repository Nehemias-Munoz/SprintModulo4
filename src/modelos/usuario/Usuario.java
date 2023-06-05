package modelos.usuario;
import interfaces.asesoria.Asesoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario implements Asesoria {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    /**
     * Constructor vacio de la clase
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase
     * @param nombre
     * @param fechaNacimiento
     * @param run
     */
    public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    /**
     * Metodo que retorna parametros y valores de la clase
     * @return mensaje con valores y parametros
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return fechaNacimiento.format(dateFormat);
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    /**
     * Metodo que calcula la edad del usuario
     * @return mensaje con la edad en años de usuarios
     */
    public String mostrarEdad(){
        int anioActual = LocalDate.now().getYear();
        return "El usuario tiene " + (anioActual - this.fechaNacimiento.getYear())+"años.";
    }

    /**
     *Metodo implementado de Asesoria que muestra por consola el nombre y rut del usuario
     */
    @Override
    public void analizarUsuario() {
        String mensaje = "Nombre: "+ this.nombre + "\n Run: "+ this.run;
        System.out.println(mensaje);
    }

}
