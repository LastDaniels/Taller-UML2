import java.util.ArrayList;

public class PersonalAcademico extends Usuario {

    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidente) {
        super(usuario, contraseña, nombre, apellido, incidente);
    }
    private ArrayList<Incidente> incidentes;
    
    public void reportarError(String email,String contenido){
        //logica
    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
        //logica
    }
    public void comentarEnForo(Foro foro, String comentario){
        //logica
    }
}
