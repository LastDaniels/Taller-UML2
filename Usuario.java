import java.util.ArrayList;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidente;

    protected boolean logIn(){
        return false;

    }
    protected boolean logOut(){
        return false;

    }
}