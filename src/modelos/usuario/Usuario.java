package modelos.usuario;

import javax.swing.*;
import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
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

    public String mostrarEdad(){
        int anioActual = LocalDate.now().getYear();
        return "El usuario tiene " + (anioActual - this.fechaNacimiento.getYear())+"años.";
    }

    public void analizarUsuario(){
        String mensaje = "Nombre: "+ this.nombre + "\n Run: "+ this.run;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
