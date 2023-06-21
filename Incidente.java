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
}
