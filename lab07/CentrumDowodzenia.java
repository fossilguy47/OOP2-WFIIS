package Armia;
import java.util.*;
public class CentrumDowodzenia implements CentrumDowodzeniaInterface{

    private ArrayList<Czolg> tankList = new ArrayList<Czolg>();
    
    public void zarejestrujCzolg(Czolg nowaMaszyna){
        tankList.add(nowaMaszyna);
    }

    public void wydajRozkaz(String identyfikatorCzolgu, Rozkaz tresc){
        int index = Integer.parseInt(identyfikatorCzolgu) - 1;
        tankList.get(index).odbierzRozkaz(tresc);
    }

     public String toString(){
         String result = "";
         result += "Do tej pory centrum dowodzenia wyslalo nastepujace rozkazy: \n";
         for(int i =0; i < tankList.size();i++){
             result += "Czolg nr " + (i+1) + " otrzymal rozkazy: \n";
             for(int j=0; j< tankList.get(i).ordersListSize();j++){
                 result += tankList.get(i).getRozkaz(j) + "\n";
             }
             result += "\n";
         }
         return result;
     }
}

