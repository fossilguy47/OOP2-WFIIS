
public class lab03{
    public static void main(String[] args){
        Student student1 = new Student(27236, "Jan", "Nowak");
        Student student2 = new Student(89347, "Ela", "Kowalska");
        Student student3 = new Student(95461, "Entomologia", "Motylkowska");
        student1.getid("Jan", "Nowak");
        student2.getname(89347);
        Wydzial fiis = new Wydzial();
        fiis.dodaj(student1);
        fiis.dodaj(student2);
        fiis.dodaj(student3);
        //fiis.dodaj(student1);
        System.out.println(fiis.getstudentcount());
        fiis.wypiszstudentow();
    }
}