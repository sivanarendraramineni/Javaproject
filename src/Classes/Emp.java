package Classes;

public class Emp {

    int eid;
    String ename;
    char egrade;
    void display(){
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Grade: " + egrade);
    }
    void setempdetails(int id,String name,char grade){
        eid=id;
        ename=name;
        egrade=grade;
    }
}
