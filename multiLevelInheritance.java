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
class C extends B{
    int l;
    void showl(){
        System.out.println("l = " + l);
    }
    void addition(){
        System.out.println("Sum of "+ i + "," + j + "," + k + " and " + l + " is : " + (i+j+k+l));
    }
}

public class multiLevelInheritance {
    public static void main(String[] args){
        A superob = new A();
        B subob = new B();
        C subsubob = new C();
        superob.i=10;
        superob.j=20;
        System.out.println("----------superob data-------");
        superob.Showij();
        subob.i=15;
        subob.j=5;
        subob.k=20;
        System.out.println("----------subob data-------");
        subob.Showij(); 
        subob.showk();
        subob.addition();
        subsubob.i=5;
        subsubob.j=10;
        subsubob.k=15;
        subsubob.l=25;
        System.out.println("----------subsubob data-------");
        subsubob.Showij();
        subsubob.showk();
        subsubob.showl();
        subsubob.addition();
    }
}
