package validacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

final public class Validacion {
    static Scanner scan = new Scanner(System.in);

    public static String minMaxCaracter(String param,String nombreParam, int vMax, int vMin){
        while (param.length() < vMin ||  param.length() > vMax || param.isBlank()){
            System.out.println("Ingrese el dato "+nombreParam+" con un largo minimo de "+vMin+" y largo maximo de "+vMax);
            param = scan.nextLine();
        }
        return param;
    }

    public static String validarLargoRut(String param){
        if(param.contains("-")){
            param.replace("-","");
        } else if (param.contains(".")) {
            param.replace(".","");
        } else if (param.toLowerCase().contains("k")) {
            param.replace("k", "0");
        }
        while (Integer.parseInt(param) > 99999999 || param.isBlank()){
            System.out.println("El rut debe ser menor a 99.999.999, ingreselo nuevamente");
            param = scan.nextLine();
            validarLargoRut(param);
        }

        return param;
    }

    public static int validarCantidad(String param,String nombreParam, int vMax, int vMin){
        int paramTemp = Integer.parseInt(param);
        while (paramTemp < vMin ||  paramTemp > vMax ){
            System.out.println("Ingrese el dato "+nombreParam+" con un valor minimo de "+vMin+" y valor maximo de "+vMax);
            paramTemp = Integer.parseInt(scan.nextLine());
        }
        return paramTemp;
    }
//    public static String validarDiaSemana(String param){
//        String[] dias = {"lunes", "martes","miercoles","jueves","viernes","sabado","domingo"};
//        while (Collections. dias.contains(param.toLowerCase())){
//
//        }
//        return param;
//    }
}
