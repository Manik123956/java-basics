
class student{
    private String name;
    private int age;
    private int roll;
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getroll(){
        return roll;
    }
    void setname(String name){
        this.name=name;
    }
    void setage(int age){
        this.age=age;
    }
    void setroll(int roll){
        this.roll=roll;
    }
}
public class Encaptulation {
    public static void main(String[] args){
        student a = new student();
        a.setname("manik");
        a.setage(21);
        a.setroll(1);
        System.out.println("Name :- " + a.getname() );
        System.out.println("age :- " + a.getage() );
        System.out.println("roll :- " + a.getroll() );
    }
}
