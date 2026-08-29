class A{
    int i,j;
    void Showij(){
        System.out.println("i = " + i + ", j = " + j);
    }
}
class B extends A{
    int k;
    void Showk(){
        System.out.println("k = " + k);
    }
    void sum(){
        System.out.println("i+j+k = " + (i+j+k));
    }
}
public class simpleInheritance {
    public static void main(String[] args){
        A superob = new A();
        B subob = new B();
        superob.i=20;
        superob.j=30;
        System.out.println("----------superob data-------");
        superob.Showij();
        subob.i=7;
        subob.j=8;
        subob.k=9;
        System.out.println("----------subob data-------");
        subob.Showij();
        subob.Showk();
        System.out.println("sum of i, j and k in subob: ");
        subob.sum();
    }
}
