package modelos.revision;

/**
 * @author nehemiasmunoz
 */
public class Revision {
    private int idRevision;
    private int idVisitaTerreno;
    private String nombre;
    private int estado;

    /**
     * Constructor vacio
     */
    public Revision() {
    }

    /**
     * Constructor de la clase con parametros
     * @param idRevision
     * @param idVisitaTerreno
     * @param nombre
     * @param estado
     */
    public Revision(int idRevision, int idVisitaTerreno, String nombre, int estado) {
        this.idRevision = idRevision;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombre = nombre;
        this.estado = estado;
    }
}
