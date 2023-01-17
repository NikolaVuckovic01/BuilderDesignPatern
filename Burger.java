package Klase;
import Interfejsi.*;

public abstract class Burger implements Item{
   @Override
    public Packing pack(){
       return new Wrapper();
   }
   @Override
    public abstract float price();
   @Override
    public abstract String name();
}
