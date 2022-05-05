import java.io.*;

public class Ejercicio1 {
    public void mostrarRaiz(File file) {


        int i = 1;
        for (String t : file.list()) {
            System.out.println(i + ". " + t);
            i++;
        }

    }


}
