package Classes;

public class EmpMain {
    public static void main(String args[]){
        Emp em=new Emp();
        em.setempdetails(1,"Siva", 'A');
        em.display();
        Emp em1=new Emp();
        em1.setempdetails(2,"Ravi", 'B');
        em1.display();
    }
}
