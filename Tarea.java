import java.util.Date;

public class Tarea extends ActividadSumativa {
    
    private Date fechaDePublicacion;

    public Tarea(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion,
            String id, Date fechaDePublicacion) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;       
    }

   
}
