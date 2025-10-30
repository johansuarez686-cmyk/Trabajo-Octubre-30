public class CursoVirtual extends Curso implements CursoAcciones {

    private String plataforma;

    public CursoVirtual(String nombre, String profesor, int cupos, String plataforma) {
        super(nombre, profesor, cupos);
        this.plataforma = plataforma;
    }

    @Override
    public void mostrar() {
        System.out.println("Curso virtual: " + nombre);
        System.out.println("Profesor: " + profesor);
        System.out.println("Cupos: " + cupos);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("-----------------");
    }

    @Override
    public void inscribir(int cantidad) {
        if(cantidad <= cupos){
            cupos -= cantidad;
            System.out.println("Inscritos: " + cantidad);
        } else {
            System.out.println("No hay cupos disponibles");
        }
    }

    @Override
    public void liberar(int cantidad) {
        cupos += cantidad;
        System.out.println("Cupos liberados: " + cantidad);
    }
}
