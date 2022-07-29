import java.util.Scanner;

public class Tarea04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = 5;
        int[] n = new int[length];
        int temp;

        for (int i = 0; i < length; i++) {
            System.out.print("Ingrese numero: ");
            n[i] = s.nextInt();
        }

        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if (n[i] < n[j]) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println("n = " + n[i]);
        }
    }
}
