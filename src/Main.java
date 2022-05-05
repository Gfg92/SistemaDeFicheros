import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio1 ej = new Ejercicio1();

        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("-------");
            System.out.println("0. Directorio Padre");
            System.out.println("-1. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    ej.mostrarRaiz();

            }

        } while (opcion != -1);

    }
}
