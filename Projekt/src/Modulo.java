import java.util.Scanner;

public class Modulo {
    public int  modulo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int a = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int b = in.nextInt();
        if (a > 0 && b > 0) { //funkcja modulo
            int divided = a / b;
            return a - (divided * b);
        }
        else{
            throw new RuntimeException("Liczba musi być więksa od 0");
        }
    }
}