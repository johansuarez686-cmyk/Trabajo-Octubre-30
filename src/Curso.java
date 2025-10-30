public abstract class Curso {

    protected String nombre;
    protected String profesor;
    protected int cupos;

    public Curso(String nombre, String profesor, int cupos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.cupos = cupos;
    }

    public abstract void mostrar();
}
