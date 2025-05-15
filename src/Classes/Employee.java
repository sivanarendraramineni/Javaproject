package Classes;

public class Employee {

    int eid;
    String ename;
    String job;
    int sal;

    public void display(){
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Job Title: " + job);
        System.out.println("Salary: " + sal);
    }
    public static void main(String args[]){

        Employee emp1= new Employee();
        emp1.eid=101;
        emp1.ename="John Doe";
        emp1.job="Software Engineer";
        emp1.sal=60000;
        emp1.display();

        Employee emp2= new Employee();
        emp2.eid=102;
        emp2.ename="Jane Smith";
        emp2.job="Data Analyst";
        emp2.sal=55000;
        emp2.display();
    }

}
