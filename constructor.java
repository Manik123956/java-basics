class student{
    String name;
    int age;
    String course;
    student(){ //default constructor
        System.out.println("======default constructor called=========");
        name="unknown";
        age=0;
        course="not assigned";
    }
    student(String a,int c,String d){
        System.out.println("======parameterized constructor called=========");
        name=a;
        age=c;
        course=d;
    }
    student(student s){
        System.out.println("======copy constructor called=========");
        name=s.name;
        age=s.age;
        course=s.course;
    }
    void display(){
        System.out.println("======student details=========");
        System.out.println("name :-" +name);
        System.out.println("age :-" +age);
        System.out.println("course :-" +course);
    }

}
public class constructor {
    public static void main(String[] args){
        student s1=new student();
        s1.display();
        student s2 = new student("manik",21,"btech");
        s2.display();
        student s3 = new student(s2);
        s3.display();
    }
}
