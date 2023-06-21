import java.util.ArrayList;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidente;


    public Usuario(String usuario, String contraseña, String nombre, String apellido, ArrayList<Incidente> incidente) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidente = incidente;
    }
    

    protected boolean logIn(){
        return false;

    }
    protected boolean logOut(){
        return false;

    }
}