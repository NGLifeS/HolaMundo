import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese Nombres separador por punto: ");
        String nombres = s.nextLine();
        String[] nombre = nombres.split("[.]");
        for (int i = 0; i < nombre.length; i++) {
            String primera = "" + nombre[i].charAt(0);
            System.out.println("nombre = " + nombre[i].trim().replace(primera, primera.toUpperCase()));
        }
    }
}
