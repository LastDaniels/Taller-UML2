import java.util.ArrayList;

public class Estudiante extends PersonalAcademico {

    private ArrayList<Curso> cursos;

    public Estudiante(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidente, ArrayList<Curso> cursos) {
        super(usuario, contraseña, nombre, apellido, incidente);
        this.cursos = cursos;
    }
    
    
    public void solicitarInscripcionCurso(Curso curso){
        //logica
    }
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //logica
    }
}
