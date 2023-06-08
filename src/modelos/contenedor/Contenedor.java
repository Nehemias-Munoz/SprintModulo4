package modelos.contenedor;

import interfaces.asesoria.Asesoria;
import modelos.administrativo.Administrativo;
import modelos.capacitacion.Capacitacion;
import modelos.cliente.Cliente;
import modelos.profesional.Profesional;
import modelos.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<Asesoria> tiposUsuarios = new ArrayList<>();
    private List<Capacitacion> capacitaciones = new ArrayList<>();

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


    //Metodos solicitados

    /**
     * Metodo que permite agregar un nuevo cliente a la lista de instancias
     * dela interface Asesoria.
     * @param cliente
     */
    public void almacenarCliente(Cliente cliente){
        tiposUsuarios.add(cliente);
    }

    /**
     * Metodo que permite agregar un nuevo profesional a la lista de
     * instancias de la interface Asesoria.
     * @param profesional
     */
    public void almacenarProfesional(Profesional profesional){
        tiposUsuarios.add(profesional);
    }

    /**
     * Metodo que permite agregar un nuevo administrativo a la lista de
     * instancias de la interface Asesoria.
     * @param administrativo
     */
    public void almacenarAdministrativo(Administrativo administrativo){
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

    public void eliminarUsuario(String run){
        if (tiposUsuarios == null){
            System.out.println("No existen registros en la tabla");
        }else{
            for (Asesoria item: tiposUsuarios) {
                Usuario user = (Usuario) item;
                if (user.getRun().equals(run)){
                    tiposUsuarios.remove(item);
                }
                System.out.println("Usuario rut: "+run+" eliminado");
            }
        }
    }

    /**
     * Metodo que muestra por consola los datos de todos los usuarios almacenados en la lista
     * tipo usuarios
     */
    public void listarUsuario(){
        if (tiposUsuarios == null){
            System.out.println("No existe registros en la tabla");
        }else{
            for (Asesoria tiposUsuario : tiposUsuarios) {
                Usuario user = (Usuario) tiposUsuario;
                System.out.println(user.toString());
            }
        }
    }

    public void listarUsuarioPorTipo(String tipoUsuario){
        if (tiposUsuarios == null) {
            System.out.println("No existe registros en la tabla");
        }else{
            for (Asesoria user : tiposUsuarios){
                System.out.println(user.getClass());
            }
        }
    }
    public void listarCapacitaciones(){
        if(capacitaciones == null){
            System.out.println("Actualmente no existen capacitaciones almacenadas");
        }else{
            for (Capacitacion capacitacion: capacitaciones) {
                System.out.println(capacitacion.toString());
                //todo: mostrar datos cliente
            }
        }
    }

}
