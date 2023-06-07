import modelos.administrativo.Administrativo;
import modelos.cliente.Cliente;
import modelos.contenedor.Contenedor;
import modelos.profesional.Profesional;

import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        int opcion = 0;
        opcion = mostrarMenu();
    }

    public static int mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        final String MENU = """
                1 - Almacenar cliente\s
                2 - Almacenar profesional\s
                3 - Almacenar administrativo\s
                4 - Almacenar capacitación\s
                5 - Eliminar usuario\s
                6 - Listar usuarios\s
                7 - Listar usuarios por tipo\s
                8 - Listar capacitaciones\s
                0 - Salir
                """;

        do {
            System.out.println(MENU);
            System.out.println("Ingrese el numero de la accion que desea realizar:");
            try{
                opcion = Integer.parseInt(scan.next());
            }catch (NumberFormatException e){
                System.out.println("Ingrese un caracter valido");
                mostrarMenu();
            }

        }while (opcion != 0);
        return opcion;
    }

    public static void ejecutarAccion(int opcion, Contenedor contenedor){
        Scanner scan = new Scanner(System.in);
        switch (opcion){
            case 1:
                Cliente nuevoCliente = new Cliente();
                System.out.println("Ingrese el nombre del cliente");
                nuevoCliente.setNombre(scan.next());
                System.out.println("Ingrese el primer apellido");
                nuevoCliente.setApellido1(scan.next());
                System.out.println("Ingrese el segundo apellido");
                nuevoCliente.setApellido2(scan.next());
                System.out.println("Ingrese la fecha de nacimiento del cliente \n Formato: año-mes-dia");
                nuevoCliente.setFechaNacimiento(LocalDate.parse(scan.next()));
                System.out.println("Ingrese el run del cliente");
                nuevoCliente.setRun(scan.next());
                System.out.println("Ingrese el nombre de la empresa");
                nuevoCliente.setNombreEmpresa(scan.next());
                System.out.println("Ingrese el giro de la empresa");
                nuevoCliente.setGiroEmpresa(scan.next());
                System.out.println("Ingrese el rut de la empresa");
                nuevoCliente.setRutEmpresa(scan.next());
                System.out.println("Ingrese el giro de la empresa");
                nuevoCliente.setGiroEmpresa(scan.next());
                System.out.println("Ingrese el telefono del representante de la empresa");
                nuevoCliente.setTelefonoRepresentante(scan.next());
                System.out.println("Ingrese la direccion de la empresa");
                nuevoCliente.setDireccionEmpresa(scan.next());
                System.out.println("Ingrese la comuna de la empresa");
                nuevoCliente.setComunaEmpresa(scan.next());
                contenedor.almacenarCliente(nuevoCliente);
                System.out.println("Cliente añadido");
                break;
            case 2:
                Profesional nuevoProfesional = new Profesional();
                System.out.println("Ingrese el nombre del profesional");
                nuevoProfesional.setNombre(scan.next());
                System.out.println("Ingrese el primer apellido");
                nuevoProfesional.setApellido1(scan.next());
                System.out.println("Ingrese el segundo apellido");
                nuevoProfesional.setApellido2(scan.next());
                System.out.println("Ingrese la fecha de nacimiento del profesional \n Formato: año-mes-dia");
                nuevoProfesional.setFechaNacimiento(LocalDate.parse(scan.next()));
                System.out.println("Ingrese el run del profesional");
                nuevoProfesional.setRun(scan.next());
                System.out.println("Ingrese el titulo del profesional");
                nuevoProfesional.setTitulo(scan.next());
                System.out.println("Ingrese la fecha de ingreso del profesional \n Formato: año-mes-dia");
                nuevoProfesional.setFechaIngreso(LocalDate.parse(scan.next()));
                break;
            case 3:
                Administrativo nuevoAdministrativo = new Administrativo();
                System.out.println("Ingrese el nombre del administrativo");
                nuevoAdministrativo.setNombre(scan.next());
                System.out.println("Ingrese el primer apellido");
                nuevoAdministrativo.setApellido1(scan.next());
                System.out.println("Ingrese el segundo apellido");
                nuevoAdministrativo.setApellido2(scan.next());
                System.out.println("Ingrese la fecha de nacimiento del administrativo \n Formato: año-mes-dia");
                nuevoAdministrativo.setFechaNacimiento(LocalDate.parse(scan.next()));
                System.out.println("Ingrese el run del administrativo");
                nuevoAdministrativo.setRun(scan.next());
                System.out.println("Ingrese el area del administrativo");
                nuevoAdministrativo.setArea(scan.next());
                System.out.println("Ingrese la experiencia del administrativo");
                nuevoAdministrativo.setExperiencia(scan.next());
                contenedor.almacenarAdministrativo(nuevoAdministrativo);
                System.out.println("Administrativo añadido");
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
//                contenedor.listarUsuarios
                break;
            case 8:
                    //contenedor.listarCapacitaciones();
                break;
            case 0:
                System.out.println("El programa ha finalizado");
                break;
            default:
                System.out.println("No existe esa opcion");
        }
    }
}
