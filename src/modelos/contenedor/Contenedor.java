package modelos.contenedor;

import interfaces.asesoria.Asesoria;
import modelos.capacitacion.Capacitacion;
import modelos.usuario.Usuario;

import java.util.List;

public class Contenedor {
    private List<Asesoria> tiposUsuarios;
    private List<Capacitacion> capacitaciones;

    /**
     * Constructor Vacio
     */
    public Contenedor() {
    }

    /**
     * Constructor de la clase con parametros
     * @param tiposUsuarios
     * @param capacitaciones
     */
    public Contenedor(List<Asesoria> tiposUsuarios, List<Capacitacion> capacitaciones) {
        this.tiposUsuarios = tiposUsuarios;
        this.capacitaciones = capacitaciones;
    }

    /**
     * Metodo que devuelve los parametros y valores de la clase
     * @return String con los datos de la clase
     */
    @Override
    public String toString() {
        return "Contenedor{" +
                "tiposUsuarios=" + tiposUsuarios +
                ", capacitaciones=" + capacitaciones +
                '}';
    }

    public List<Asesoria> getTiposUsuarios() {
        return tiposUsuarios;
    }

    public void setTiposUsuarios(List<Asesoria> tiposUsuarios) {
        this.tiposUsuarios = tiposUsuarios;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    //Metodos solicitados

    /**
     * Metodo que permite agregar un nuevo cliente a la lista de instancias
     * dela interface Asesoria.
     * @param cliente
     */
    public void almacenarCliente(Asesoria cliente){
        tiposUsuarios.add(cliente);
    }

    /**
     * Metodo que permite agregar un nuevo profesional a la lista de
     * instancias de la interface Asesoria.
     * @param profesional
     */
    public void almacenarProfesional(Asesoria profesional){
        tiposUsuarios.add(profesional);
    }

    /**
     * Metodo que permite agregar un nuevo administrativo a la lista de
     * instancias de la interface Asesoria.
     * @param administrativo
     */
    public void almacenarAdministrativo(Asesoria administrativo){
        tiposUsuarios.add(administrativo);
    }

    /**
     * Metodo que permite agregar una nueva capacitación a la lista de
     * instancias de la clase Capacitación.
     * @param capacitacion
     */
    public void almacenarCapacitacion(Capacitacion capacitacion){
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(String rut){
        for (Asesoria user: tiposUsuarios) {

        }
    }

    public void listarUsuario(){
        for (int i = 0; i < tiposUsuarios.size(); i++) {
            System.out.println(tiposUsuarios.get(i).);
        }
    }

}
