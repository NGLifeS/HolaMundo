import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {
        //Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese Nombre del emisor: ");
        String nombreE = s.nextLine();
        System.out.print("Ingrese Nombre del receptor: ");
        String nombreR = s.nextLine();
        System.out.println("nombreE = " + nombreE);
        System.out.println("nombreR = " + nombreR);
    }
}
