import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Wybierz kalkulator do uruchomienia: "); //Wybieranie z 3 opcji.
        System.out.println("1) Kalkulator Modulo");
        System.out.println("2) Kalkulator NWD");
        System.out.println("3) Kalkulator obliczania prawdopodobieństwa przyjęcia partii towarów");
        int choice = menu.nextInt();
        switch (choice) {
            case 1: //Obliczanie za pomocą Modulo
                Modulo wynik1 = new Modulo();
                System.out.println("Wynik modulo to " + wynik1.modulo());
                break;
            case 2:
                Nwd wynik2 = new Nwd(); //Obliczanie Największej wspólnej dzielnej
                System.out.println("Wynik największej wspólnej dzielnej to " + wynik2.nwd());
                break;
            case 3: //Obliczanie prawdopodobieństwa przyjęcia partii towarów przy maksymalnej jednej wadliwej
                Kombinatoryka wynik3 = new Kombinatoryka();
                DecimalFormat decFormat = new DecimalFormat("#%"); //Wyświetlanie wyniku procentowo
                System.out.println("Partia będzie przyjęta jeżeli jest nie więcej, niż jedna wadliwa sztuka.");
                System.out.println("Proszę podać ilość w partii towaru: ");
                int e = menu.nextInt();
                System.out.println("Proszę podać ilość wadliwych towarów: ");
                int w = menu.nextInt();
                System.out.println("Proszę podać ilość kontrolowanych elementów: ");
                int k = menu.nextInt();
                wynik3.setElement(e); //Ustawianie wartości w Kombinatoryka.java
                wynik3.setWada(w);
                wynik3.setKontrola(k);
                double result = wynik3.kombinatoryka();
                if (k == 0 || k == e) System.out.println("1");
                else System.out.println("Prawdopodobieństwo przyjęcia partii to " + result + ", albo procentowo zaokrąglone " + decFormat.format(result));
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji");
                break;
        }
        menu.close();
    }
    }
