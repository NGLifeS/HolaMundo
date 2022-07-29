import java.util.Scanner;

public class Tarea05 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] nombres = new String[3];
        String mayor = "";
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese Nombre: ");
            nombres[i] = s.next();
        }

        for (int i = 0; i < 3; i++) {
            mayor = nombres[i].length() > mayor.length() ? nombres[i] : mayor;
        }

        System.out.println("El nombre mas largo es = " + mayor);
    }
}
