class animal{
    int x=10;
}
class dog extends animal{
    int x=20;
    void display(){
        System.out.println(super.x);
    }
}

public class Super{
    public static void main(String[] args){
        dog A = new dog();
        A.display();
    }
}
