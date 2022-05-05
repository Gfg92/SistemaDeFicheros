import java.io.File;

public class Ejercicio1 {

    public void mostrarRaiz(File file) {
        file = file.listRoots()[0];
        int i = 1;
        for (String f : file.list()) {
            System.out.println(i + ". " + f);
            i++;
        }
    }


}
