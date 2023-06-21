import java.util.ArrayList;

public class SoporteTecnico extends Usuario {

    
    public SoporteTecnico(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidente) {
        super(usuario, contraseña, nombre, apellido, incidente);
    }
    public void brindarAsistencia(Usuario usuario){
        //logica
    }
    public void resolverProblemaTecnico(Usuario usuario){
        //logica
    }
    public void derivarProblemaDeGestion(Administrador administrador){
        //logica
    }
}
