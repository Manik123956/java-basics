class A{
    int i,j;
    void Showij(){
        System.out.println("i = " + i + ", j = " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k = " + k);
    }
    void addition(){
        System.out.println("Sum of "+ i + "," + j + " and " + k + " is : " + (i+j+k));
    }
}
class C extends A{
    int l;
    void showl(){
        System.out.println("l = " + l);
    }
    void addition(){
        System.out.println("Sum of "+ i + "," + j + " and " + l + " is : " + (i+j+l));
    }
}
class D extends A{
    int k;
    void showk(){
        System.out.println("k = " + k);
    }
    void addition(){
        System.out.println("Sum of "+ i + "," + j + " and " + k + " is : " + (i+j+k));
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args){
        A superob = new A();
        B subob1 = new B();
        C subob2 = new C();
        D subob3 = new D();
        superob.i=10;
        superob.j=20;
        System.out.println("----------superob data-------");
        superob.Showij();
        subob1.i=15;
        subob1.j=5;
        subob1.k=20;
        System.out.println("----------subob1 data-------");
        subob1.Showij();
        subob1.showk();
        subob1.addition();
        subob2.i=5;
        subob2.j=10;
        subob2.l=25;
        System.out.println("----------subob2 data-------");
        subob2.Showij();
        subob2.showl();
        subob2.addition();
        subob3.i=7;
        subob3.j=14;
        subob3.k=21;
        System.out.println("----------subob3 data-------");
        subob3.Showij();
        subob3.showk();
        subob3.addition();
    }
}
