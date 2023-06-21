import java.util.ArrayList;

public class Profesor extends PersonalAcademico {

    
    public Profesor(String usuario, String contraseña, String nombre, String apellido, ArrayList<Incidente> incidente) {
        super(usuario, contraseña, nombre, apellido, incidente);
        
    }
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //logica
    }
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
        //logica
    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //logica
    }
    public void crearNuevoForo(Foro foro){
        //logica
    }
}
