package modelos.capacitacion;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author nehemiasmunoz
 */
public class Capacitacion {
    private int identificador;
    private String rut;
    private String dia;
    private LocalTime hora;
    private String lugar;
    private LocalTime duracion;
    private int cantidadAsistentes;

    /**
     * Constructor vacio de clase
     */
    public Capacitacion() {
    }

    /**
     * Constructor de la clase con parametros
     * @param identificador
     * @param rut
     * @param dia
     * @param hora
     * @param lugar
     * @param duracion
     * @param cantidadAsistentes
     */
    public Capacitacion(int identificador, String rut, String dia, LocalTime hora, String lugar, LocalTime duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     * @return mensaje con los datos del cliente
     */
    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut='" + rut + '\'' +
                ", dia='" + getDia() + '\'' +
                ", hora=" + getHora() +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }

    //Getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("HH.mm");
        return hora.format(hourFormat);
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    /**
     * Metodo que retorna un mensaje con datos de la capacitacion
     * @return String con el lugar, hora, dia, duracion del objeto
     */
    public String mostrarDetalle(){
        return "La capacitación será en "+lugar+" a las "+getHora()+" del día "+dia+" , y durará "+duracion+" minutos";
    }
}
