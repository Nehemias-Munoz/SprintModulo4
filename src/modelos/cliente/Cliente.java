package modelos.cliente;

public class Cliente {
    private String rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private String sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    /**
     * Constructor vacio
     */
    public Cliente() {
    }

    /**
     * Constructor de la clase
     * @param rut
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     * @param edad
     */
    public Cliente(String rut, String nombres, String apellidos, String telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     * @return mensaje con lo datos del cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud='" + sistemaSalud + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comunal='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

    //Getter and Setter
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que retorna el nombre completo del cliente
     * @return String que contiene los nombres y apellidos concatenados con un espacio
     */
    public String obtenerNombre(){
        return nombres +" "+ apellidos;
    }

    /**
     * Metodo que retorna el sistema de salud del cliente
     * @return String que contiene (Fonasa o Isapre)
     */
    public String obtenerSistemaSalud(){
        return sistemaSalud;
    }

    /**
     * Metodo que complementado con la interfaz muestra por consola datos del usuario
     */
    public void analizarUsuario(){
        //Todo: Implementar interfaz (Asesoria)
        System.out.println("Direccion"+ direccion + "\nComuna"+comuna);
    }
}
