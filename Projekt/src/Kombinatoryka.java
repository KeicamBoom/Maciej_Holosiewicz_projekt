
public class Kombinatoryka extends  Newton { //dziedziczenie z klasy Newton
    private int element;
    private int wada;
    private int kontrola;
    final private int maxWada = 1;
    public void setElement(int element){ // funckja Setter
        this.element = element;
    }
    public void setWada(int wada){
        this.wada = wada;
    }
    public void setKontrola(int kontrola){
        this.kontrola = kontrola;
    }

    public double kombinatoryka() { //funkcja na obliczanie prawdopodobieństwa
    double partia = newton(element - wada, kontrola) + newton(element - wada, kontrola - 1) * newton(wada, maxWada);
    return partia / newton(element, kontrola);
    }
}