package modelos.visitaterreno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VisitaTerreno {
    private int id;
    private LocalDate dia;
    private LocalDate hora;
    private String lugar;
    private String comentarios;

    /**
     * Constructor vacio
     */
    public VisitaTerreno() {
    }

    /**
     * Constructor con parametros
     * @param id
     * @param dia
     * @param hora
     * @param lugar
     * @param comentarios
     */
    public VisitaTerreno(int id, LocalDate dia, LocalDate hora, String lugar, String comentarios) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    /**
     * Metodo que retorna los parametros y valores de la clase
     *
     * @return mensaje con los datos de la visita a terreno
     */
    @Override
    public String toString() {
        return "VisitaTerreno{" +
                "id=" + id +
                ", dia=" + dia +
                ", hour=" + hora +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
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

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
