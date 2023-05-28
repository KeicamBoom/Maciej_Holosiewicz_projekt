public class Newton {
    public static double newton(int element, int kontrola) { //funkcja symbolu Newtona
        double wynik = 1;       // Deklaracja zmiennych
        int i;

        for (i = 1; i <= kontrola; i++) // Od 1 do k wykonujemy :
        {
            wynik = wynik * (element - i + 1) / (double) i;      // Obliczanie ze wzoru iteracyjnego
        }
        return wynik;   // Zwróć Wynik
    }
}
