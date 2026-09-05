interface A {
    int i = 10;
    int j = 20;

    void Showij();
}

interface B {
    int k = 15;
    int l = 5;

    void Showkl();
}

class C implements A, B {
    int m = 30;

    public void Showij() {
        System.out.println("i = " + i + ", j = " + j);
    }

    public void Showkl() {
        System.out.println("k = " + k + ", l = " + l);
    }

    void Showm() {
        System.out.println("m = " + m);
    }

    void addition() {
        System.out.println("Sum of " + i + "," + j + "," + k + "," + l + " and " + m + " is : " + (i + j + k + l + m));
    }
}

public class multipleInheritance {
    public static void main(String[] args) {

        C subob2 = new C();

        System.out.println("----------subob2 data-------");

        subob2.Showij();
        subob2.Showkl();
        subob2.Showm();
        subob2.addition();
    }
}