package Zadanie3;

public interface IGazeciarz {

    void registerObserver(IOdbiorca IOdbiorca);
    void removeObserver(IOdbiorca IOdbiorca);
    void updateObserver(String wiadomosc);
}
