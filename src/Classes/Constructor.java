package Classes;

public class Constructor {
    int sid;
    String sname;
    char sgrade;

    void print(){
        System.out.println("Student ID: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Student Grade: " + sgrade);
    }

    Constructor(int id, String name, char grade) {
        sid = id;
        sname = name;
        sgrade = grade;
    }
}
