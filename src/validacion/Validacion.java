package validacion;

import java.util.*;

final public class Validacion {
    static Scanner scan = new Scanner(System.in);

    /**
     * Metodo que se encarga de validar que el parametro ingresado se encuentre entre los parametros de aceptacion
     * @param param
     * @param nombreParam
     * @param vMax
     * @param vMin
     * @return
     */
    public static String minMaxCaracter(String param,String nombreParam, int vMax, int vMin){
        while (param.length() < vMin ||  param.length() > vMax || param.isBlank()){
            System.out.println("Ingrese el dato "+nombreParam+" con un largo minimo de "+vMin+" y largo maximo de "+vMax);
            param = scan.nextLine();
        }
        return param;
    }

    /**
     * Metodo que se encarga de quitar guiones, puntos y k del parametro para validar
     * si es menor a 99999999, viene vacio o la longitud es mayor al numero maximo
     * @param param
     * @return String con el rut validado
     */
    public static String validarLargoRut(String param){
        if(param.contains("-")){
            param.replace("-","");
        } else if (param.contains(".")) {
            param.replace(".","");
        } else if (param.toLowerCase().contains("k")) {
            param.replace("k", "0");
        }
        while ( param.isBlank() || param.length() > 8|| Integer.parseInt(param) > 99999999){
            System.out.println("El rut debe ser menor a 99.999.999, ingreselo nuevamente");
            param = scan.nextLine();
            validarLargoRut(param);
        }

        return param;
    }

    /**
     * Metodo que valida que se cumplan los valores maximos y minimos en un parametro recibido
     * @param param
     * @param nombreParam
     * @param vMax
     * @param vMin
     * @return int con la cantidad correcta
     */
    public static int validarCantidad(String param,String nombreParam, int vMax, int vMin){
        int paramTemp = Integer.parseInt(param);
        while (paramTemp < vMin ||  paramTemp > vMax ){
            System.out.println("Ingrese el dato "+nombreParam+" con un valor minimo de "+vMin+" y valor maximo de "+vMax);
            paramTemp = Integer.parseInt(scan.nextLine());
        }
        return paramTemp;
    }

    /**
     * Metodo estatico que valida si el parametro ingresado se encuentra en la lista
     * @param param
     * @return String con el dia correcto
     */
    public static String validarDiaSemana(String param){
        String[] dias = {"lunes", "martes","miercoles","jueves","viernes","sabado","domingo"};
        List listaDias = Arrays.stream(dias).toList();
        while (!listaDias.contains(param.toLowerCase())){
            System.out.println("El dia ingresado no existe, ingreselo nuevamente");
            param = scan.nextLine();
            validarDiaSemana(param);
        }
        return param;
    }
}
