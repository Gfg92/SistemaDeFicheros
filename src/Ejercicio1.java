import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    private File file = new File("c:'\'");

    public void mostrarRaiz() {
        file = file.listRoots()[0];
        int i = 0;
        for (String f : file.list()) {
            System.out.println(i + ". " + f);
            i++;
        }

    }


}