public class Student{
    int ID;
    String imie;
    String nazwisko;
    Student(int givenid, String givenname, String givwnsurname){
        ID = givenid;
        imie = givenname;
        nazwisko = givwnsurname;
    }
    int getid(String name, String surname){
        if(nazwisko == surname && imie == name){
            return ID;
        }
        else{
            System.out.println("Blednie podane dane");
            return 0;
        }
    }
    String getname(int givenid){
        if(ID == givenid){
            return imie + " "+ nazwisko;
        }
        else{
            return "Blednie podane dane";
        }
    }
    void printstudent(){
        System.out.println(ID + " "+ imie + " "+ nazwisko);
    }
}
