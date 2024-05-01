import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: "); // Prompt the user to enter the base value
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz: "); // Prompt the user to enter the exponent value
        int us = scanner.nextInt();
        int sonuc = usAlma(taban, us); //Call the exponentiation method

        System.out.println("Sonuç: " + sonuc); // Display the result
    }
    // Method to calculate exponentiation using recursion
    public static int usAlma(int taban, int us) {
        if (us == 0)
            return 1;
        else
            return taban * usAlma(taban, us - 1);
    }
}