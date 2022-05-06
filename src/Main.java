import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = File.listRoots()[0];

        System.out.println("Lista de ficheros y directorios de: " + file);
        System.out.println("---------------------------------------------");
        File[] arrayFiles = file.listFiles();
        for (int i = 0; i < arrayFiles.length; i++) {
            if (arrayFiles[i].isDirectory()) {
                System.out.println((i + 1) + ". " + arrayFiles[i] + " <directory>");
            }
            if (arrayFiles[i].isFile()) {
                System.out.println((i + 1) + ". " + arrayFiles[i] + " <file> " + file.length() + " bytes.");
            }

        }
        int opcion;
        System.out.println("Introduzca una opcion");
        opcion = sc.nextInt();
        while (opcion != -1) {
            if (opcion == 0) {
                if (!file.equals(File.listRoots()[0])) {
                    file = file.getParentFile();
                } else {
                    System.out.println("No hoy directorio padre");
                }
            } else if (opcion > 0) {
                file = arrayFiles[opcion - 1];
            }
            arrayFiles = file.listFiles();
            if (file.isDirectory()) {
                System.out.println("0. Volver atras");
                for (int i = 0; i < arrayFiles.length; i++) {
                    if (arrayFiles[i].isDirectory()) {
                        System.out.println((i + 1) + ". " + arrayFiles[i] + " <directory>");
                    }
                    if (arrayFiles[i].isFile()) {
                        System.out.println((i + 1) + ". " + arrayFiles[i] + " <file> " + file.length() + " bytes.");
                    }
                }
            }
            System.out.println("Introduzca una opcion");
            opcion = sc.nextInt();
        }
    }
}
