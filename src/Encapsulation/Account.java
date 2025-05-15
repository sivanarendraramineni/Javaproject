package Encapsulation;

public class Account {

    private int accno;
    private String accname;
    private int accbal;

    public int getAccno(){
        return accno;
    }

    public void setAccno(int accno){
        this.accno = accno;
    }
    public String getAccname(){
        return accname;
    }
    public void setAccname(String accname){
        this.accname = accname;

    }

    public int getAccbal(){
        return accbal;
    }
    public void setAccbal(int accbal){
        this.accbal = accbal;
    }
}
