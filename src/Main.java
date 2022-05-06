import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = File.listRoots()[0];

        System.out.println("Lista de ficheros y directorios de: " + file);
        System.out.println("---------------------------------------------");
        File[] arrayFiles = file.listFiles();
        for (int i = 0; i < arrayFiles.length; i++) {
            System.out.println(i + ". " + arrayFiles[i]);
        }
        int opcion;
        do {
            System.out.println("Introduzca una opcion");
            opcion = sc.nextInt();

            File nuevoArray = arrayFiles[opcion];
            File[] recorroArray = nuevoArray.listFiles();


            if (nuevoArray.isDirectory()) {
                for (int i = 0; i < nuevoArray.length(); i++) {
                    System.out.println(i + ". " + recorroArray[i]);
                }
            }
        }while (opcion != -1);
    }
}
