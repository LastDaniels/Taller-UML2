import java.util.ArrayList;

public class Administrador extends Usuario{
    
    public Administrador(String usuario, String contraseña, String nombre, String apellido,
            ArrayList<Incidente> incidente) {
        super(usuario, contraseña, nombre, apellido, incidente);
        //TODO Auto-generated constructor stub
    }
    public void crearUsuarioConRol(String usuario, String contraseña){
        //logica
    }
    public void asignarPermiso(String usuario){
        //logica
    }
    public void actualizarSoftware(){
        //logica
    }
    public void asignarResponsable(Curso curso, Profesor responsable){
        //logica
    }
}
