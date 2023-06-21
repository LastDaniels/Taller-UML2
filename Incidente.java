import java.util.Date;
import java.util.List;

public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    protected Usuario usuario;
    protected PersonalAcademico personalAcademico;


    public Incidente(int id, Date fecha_reportado, String estado, String titulo, List<String> log_actualizaciones, Date fecha_cerrado, String tipo, Usuario usuario, PersonalAcademico personalAcademico) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.usuario = usuario;
        this.personalAcademico = personalAcademico;
    }

}
