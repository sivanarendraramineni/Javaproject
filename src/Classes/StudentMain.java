package Classes;

public class StudentMain {

    public static void main(String args[]){

        Student s1= new Student();
        s1.sid=101;
        s1.sname="John Doe";
        s1.course="Computer Science";
        s1.print();

        Student s2= new Student();
        s2.sid=102;
        s2.sname="Jane Smith";
        s2.course="Data Science";
        s2.print();
    }
}
