class A{
    int i=10;
    int j=20;
    void showij(){
        System.out.println("This is class A");
        System.out.println("i= " +i+ "j=" +j);
    }
    void sum(){
        System.out.println("sum of i and j = "+(i+j));
    }
}
class B extends A{
    int i=15;
    int j=17;
    int k=30;
    void showk(){
        System.out.println("This is class B");
        System.out.println("k = "+k);
    }
    void sum(){
        System.out.println("sum of i, j, k ="+(i+j+k));
    }
}
class C extends B{
    int i=5;
    int j=7;
    int k=9;
    int l=40;
    void showl(){
        System.out.println("This is class C");
        System.out.println("l= "+l);
    }
    void sum(){
        System.out.println("i+j+k+l= "+(i+j+k+l));
    }
    void testsuper(){
        System.out.println("super :- " );
        super.sum();
    }
}

public class SuperKey {
    public static void main(String[] args){
        A ob1 = new A();
        ob1.showij();
        ob1.sum();
        B ob2 = new B();
        ob2.showk();
        ob2.sum();
        C ob3 = new C();
        ob3.showl();
        ob3.sum();
        ob3.testsuper();
    }
}
