import java.lang.String;
import java.lang.Character;
public class lab3string{





    static int dlugosc(String given){
        return given.length();
    }

    static int ile_razy_literka_wystepuje(String given, char key){
        int liczbaWystapien = 0;
        char newgiven [] = new char [given.length()];
        newgiven = given.toCharArray();
        for(int i =0; i< given.length(); i++){
            if(newgiven[i]==key){
                liczbaWystapien ++;
            }
        }
        return liczbaWystapien;
    }

    static boolean czy_takie_same(String first, String second){
        return first.equals(second); 
    }

    static String wspak(String given){
        char tmp[] = new char[given.length()];
        tmp = given.toCharArray();
        char tmpend [] = new char[given.length()]; 
        for(int i =0;i<given.length();i++){
            tmpend[i] = tmp[given.length()-1-i];
        }
      return  given.copyValueOf(tmpend);
    }
/**
* return boolean wheather string is palindrom
* given argument is String that we check if it is palindrom or not
* @return true or false if it is palindrom  
* @param given String to check
 */
    static boolean czy_plaindrom(String given){
        String reverse = lab3string.wspak(given);
        return given.equals(reverse);
    }

    static boolean czy_abecadlowe(String given){
        String alfabet = "abcdefghijklmnoprstuwyz";
        return alfabet.contains(given);
    }

    static String rot13(String given){
        char tmp[] = new char[given.length()];
        tmp = given.toCharArray();
        for(int i=0;i<given.length();i++){
            if(tmp[i]!='x'){
            Integer tmpint =  Character.getNumericValue(tmp[i]) + 13;
            char tmpend [] = new char[given.length()]; 
            String tmpstring = tmpint.toString();
            tmpend = tmpstring.toCharArray();
            tmp[i] = tmpend[0];
            }
        }
        return given.copyValueOf(tmp);
    }

}