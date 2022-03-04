import java.util.Vector;

public class Wydzial{
    private    Vector<Student> listastudentow;

    Wydzial(){
       listastudentow = new Vector<Student>();
    }

    void dodaj(Student dododania){
        if(listastudentow.contains(dododania)){
             System.out.println("Student jest juz w bazie");
        }
        else{
           listastudentow.add(dododania);
        }
    }

    void wypiszstudentow(){
        for(Student t: listastudentow){
            t.printstudent();
        }
    }

    int getstudentcount(){
        return listastudentow.size();
    }
}