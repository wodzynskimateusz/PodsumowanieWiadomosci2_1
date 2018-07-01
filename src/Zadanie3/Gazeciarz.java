package Zadanie3;

import java.util.ArrayList;

public class Gazeciarz implements IGazeciarz {

    private ArrayList<IOdbiorca> odbiorcy = new ArrayList<>();

    @Override
    public void registerObserver(IOdbiorca IOdbiorca) {
        odbiorcy.add(IOdbiorca);
    }

    @Override
    public void removeObserver(IOdbiorca IOdbiorca) {
        odbiorcy.remove(IOdbiorca);
    }

    @Override
    public void updateObserver(String wiadomosc) {
        for (IOdbiorca iOdbiorca : odbiorcy) {
            iOdbiorca.update(wiadomosc);
        }

    }
}
