package Armia;
interface CzolgInterface{
    public Rozkaz ostatniRozkaz();
    public void odbierzRozkaz(Rozkaz x);
    public Rozkaz getRozkaz(int index);
    public int ordersListSize();
}