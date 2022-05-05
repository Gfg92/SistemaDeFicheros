import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 ej = new Ejercicio1();
        File currentFile = File.listRoots()[0];


        int opcion;
        System.out.println("MENU");
        System.out.println("-------");
        System.out.println("0. Directorio Padre");
        System.out.println("-1. Salir");


        do {
            System.out.println("Elige tu opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    currentFile = File.listRoots()[0];
                    break;
                case 1:
                    currentFile = currentFile.listFiles()[opcion-1];
                    break;
                case 2:


            }

        } while (opcion != -1);

    }
}
