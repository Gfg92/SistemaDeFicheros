import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 ej = new Ejercicio1();

        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("-------");
            System.out.println("0.- Directorio padre");
            System.out.println("1.- Archivos de programa");
            System.out.println("2.- Program Files");
            System.out.println("3.- Recovery");
            System.out.println("4.- tmp");
            System.out.println("5.- Users");
            System.out.println("6.- Windows");
            System.out.println("-1.- Salir del programa");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("DIRECTORIO PADRE:");
                    ej.mostrarRaiz();

                case 1:
                    System.out.println("ARCHIVOS DE PROGRAMA");
            }

        } while (opcion != -1);

    }
}
