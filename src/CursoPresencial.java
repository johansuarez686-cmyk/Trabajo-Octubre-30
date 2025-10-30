public class CursoPresencial extends Curso implements CursoAcciones {

    private String salon;

    public CursoPresencial(String nombre, String profesor, int cupos, String salon) {
        super(nombre, profesor, cupos);
        this.salon = salon;
    }

    @Override
    public void mostrar() {
        System.out.println("Curso presencial: " + nombre);
        System.out.println("Profesor: " + profesor);
        System.out.println("Cupos: " + cupos);
        System.out.println("Salon: " + salon);
        System.out.println("-----------------");
    }

    @Override
    public void inscribir(int cantidad) {
        if(cantidad <= cupos){
            cupos -= cantidad;
            System.out.println("Inscritos: " + cantidad);
        } else {
            System.out.println("No hay cupos suficientes");
        }
    }

    @Override
    public void liberar(int cantidad) {
        cupos += cantidad;
        System.out.println("Cupos liberados: " + cantidad);
    }
}
