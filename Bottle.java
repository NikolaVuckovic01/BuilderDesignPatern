package Klase;
import Interfejsi.*;

public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
