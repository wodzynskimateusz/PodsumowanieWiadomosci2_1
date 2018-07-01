package Zadanie3;

public class Odbiorca implements IOdbiorca {

    protected IGazeciarz iGazeciarz;
    public String imie;

    public Odbiorca(String imie, IGazeciarz iGazeciarz) {
        this.imie = imie;
        this.iGazeciarz = iGazeciarz;
        this.iGazeciarz.registerObserver(this);
    }

    @Override
    public void update(String wiadomosc) {
        System.out.println("Klient " + imie + " dostaje gazetę " + wiadomosc + ".");
    }
}
