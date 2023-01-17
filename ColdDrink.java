package Klase;
import Interfejsi.*;

public abstract class ColdDrink implements Item{
    @Override
    public Packing pack(){
        return new Bottle();
    }
    @Override
    public abstract float price();
    @Override
    public abstract String name();
}
