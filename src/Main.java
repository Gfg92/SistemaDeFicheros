import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = File.listRoots()[0];

        System.out.println("Lista de ficheros y directorios de: " + file);
        System.out.println("---------------------------------------------");
        File[]arrayFiles = file.listFiles();
        for (int i = 0; i < arrayFiles.length; i++) {
            System.out.println(i + ". " + arrayFiles[i]);
        }
        System.out.println("Introduzca una opcion");
        int opcion = sc.nextInt();




        if(opcion == ){

        }
    }





}
