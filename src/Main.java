import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 ej = new Ejercicio1();

        //Para Windows
        File windows = new File("c:'\'");
        //Para Linux
        File linux = new File("/");

        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("-------");
            System.out.println("0. Directorio Padre");
            System.out.println("-1. Salir");
            System.out.println("Elige tu opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    ej.mostrarRaiz(linux);

            }

        } while (opcion != -1);

    }
}
