package modelos.accidente;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author nehemiasmunoz
 */
public class Accidente {
    private int id;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private String origen;
    private String consecuencia;

    /**
     * Constructor vacio
     */
    public Accidente() {
    }

    /**
     * Constructor de la clase
     * @param id
     * @param dia
     * @param hora
     * @param lugar
     * @param origen
     * @param consecuencia
     */
    public Accidente(int id, LocalDate dia, LocalTime hora, String lugar, String origen, String consecuencia) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencia = consecuencia;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     *
     * @return mensaje con los datos de la clase accidente
     */
    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", dia=" + getDia() +
                ", hora=" + getHora() +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencia='" + consecuencia + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dia.format(dateFormat);
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public String getHora() {
        DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("HH:mm");
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencia() {
        return consecuencia;
    }

    public void setConsecuencia(String consecuencia) {
        this.consecuencia = consecuencia;
    }
}
