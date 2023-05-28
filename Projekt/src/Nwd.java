import java.util.Scanner;

public class Nwd {
    public int nwd() {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int pierwsza = in.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int druga = in.nextInt();
        if (pierwsza > 0 && druga > 0) { // funkcja nwd
            while (pierwsza != druga) { //będzie działać dopóki pierwsa liczba jest rózna od drugiej
                if (pierwsza > druga) {
                    pierwsza = pierwsza - druga;
                } else {
                    druga = druga - pierwsza;
                }
            }
            return pierwsza;
        } else {
            throw new RuntimeException("Liczba musi być większa od 0");
        }
    }
}