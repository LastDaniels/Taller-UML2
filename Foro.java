public class Foro {
    private Curso curso;
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    public Foro(Curso curso, String id, String tematica, int numeroDeComentarios) {
        this.curso = curso;
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = numeroDeComentarios;
    }

}
