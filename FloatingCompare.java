import java.util.Scanner;
public class FloatingCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-"); 
        double a = sc.nextDouble();
        System.out.println("Enter second number :-");
        double b = sc.nextDouble();
        System.out.println(a>b);
        sc.close();
    }
}
