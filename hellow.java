class teachers{
    int i=10;
    int j=20;
    void show(){
        System.out.println("i = "+ i +" j ="+ j);
        System.out.println("sum of "+i+" and "+j+" = "+(i+j));
        System.out.println("mul of all = " +(i*j));
    }
}
class student extends teachers{
    int k = 30;
    void show(){
        System.out.println("k = "+k);
        System.out.println("sum of "+i+ " ,"+j+ " and" +k+ " =" +(i+j+k));
        System.out.println("mul of all = "+(i*j*k));
    }
}
class child extends student{
    int l = 40;
    void show(){
        System.out.println("l= "+l);
        System.out.println("sum of "+i+" , "+j+" , "+k+" and "+l+" = "+(i+j+k+l));
        System.out.println("mul of all = " +(i*j*k*l));
    }
}

public class hellow {
    public static void main(String[] args) {
        teachers t = new teachers();
        t.show();
        student s = new student();
        s.show();
        child c = new child();
        c.show();
    }
}
