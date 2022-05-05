import java.io.File;

public class Ejercicio1 {
    private File file = new File("c:'\'");

    public void mostrarRaiz() {
        file = file.listRoots()[0];

        int indice = 0;
        for (String c : file.list()) {
            System.out.println(indice + ". " + c);
            indice++;
        }
    }

}
