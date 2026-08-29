interface A {
    int a = 10;
    int b = 5;

    void addition();
}

interface B extends A {
    void subtraction();
}

interface C extends A {
    void multiplication();
}

class D implements B, C {

    public void addition() {
        System.out.println("Addition = " + (a + b));
    }

    public void subtraction() {
        System.out.println("Subtraction = " + (a - b));
    }

    public void multiplication() {
        System.out.println("Multiplication = " + (a * b));
    }
}

public class HybridInheritance{
    public static void main(String[] args) {

        D obj = new D();

        System.out.println("a = " + A.a);
        System.out.println("b = " + A.b);

        obj.addition();
        obj.subtraction();
        obj.multiplication();
    }
}