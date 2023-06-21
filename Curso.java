import java.util.ArrayList;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private ArrayList<Foro> foros;
    private ArrayList<ActividadSumativa> actividades;


    public Curso(String id, String nombre, boolean estadoDisponible, ArrayList<Foro> foros, ArrayList<ActividadSumativa> actividades) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.foros = foros;
        this.actividades = actividades;
    }

}
