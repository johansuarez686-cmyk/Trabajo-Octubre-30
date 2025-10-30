public class Main {
    public static void main(String[] args) {

        CursoPresencial curso1 = new CursoPresencial("Matematicas", "Ana Torres", 20, "Salon 5");
        CursoVirtual curso2 = new CursoVirtual("Programacion", "Carlos Ruiz", 30, "Zoom");

        curso1.mostrar();
        curso2.mostrar();

        curso1.inscribir(5);
        curso2.inscribir(10);

        curso1.liberar(2);
        curso2.liberar(3);

        curso1.mostrar();
        curso2.mostrar();
    }
}

