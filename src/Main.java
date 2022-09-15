import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = File.listRoots()[0];

        int indice = 1;
        System.out.println("Lista de ficheros y directorios de: " + file);
        System.out.println("-----------------------------------------");
        File[] arrayFiles = file.listFiles();
        for (int i = 0; i < arrayFiles.length; i++) {
            if (arrayFiles[i].isDirectory()) {
                System.out.println(indice + ". " + arrayFiles[i] + " <directory>");
            }
            if (arrayFiles[i].isFile()) {
                System.out.println(indice + ". " + arrayFiles[i] + " <file> " + file.length() + " bytes.");
            }
            indice++;
        }

        int opcion;
        System.out.println("Introduzca una opcion");
        opcion = sc.nextInt();

        while (opcion != -1) {
            File newArray = arrayFiles[opcion - 1];
            File[] arr = newArray.listFiles();
            int contador = 1;
            System.out.println("Lista de ficheros y directorios de: " + newArray);
            System.out.println("-----------------------------------------");
            System.out.println("0. Directorio PADRE");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].isDirectory()) {
                    System.out.println(contador + ". " + arr[j] + " <directory>");
                }
                if (arr[j].isFile()) {
                    System.out.println(contador + ". " + arr[j] + " <file> " + file.length());
                }
                contador++;
            }
            System.out.println("Introduzca una opcion");
            opcion = sc.nextInt();
        }
    }
}

