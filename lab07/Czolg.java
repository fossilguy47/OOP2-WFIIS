package Armia;
import java.util.*;
public class Czolg implements CzolgInterface{
    private ArrayList<Rozkaz> orders = new ArrayList<Rozkaz>();
    public void odbierzRozkaz(Rozkaz tresc){
        orders.add(tresc);
    }
    public Rozkaz ostatniRozkaz(){
        Rozkaz tmp = new Rozkaz("Ostatni rozkaz do mnie: " + orders.get(orders.size()-1));
        return tmp;
    }
    public Rozkaz getRozkaz(int index){
        return orders.get(index);
    }
    public int ordersListSize(){
        return orders.size();
    }
}