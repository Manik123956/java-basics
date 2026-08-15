import java.util.Scanner;
public class average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        double a=sc.nextDouble();
        System.out.println("Enter the second number:-");
        double b=sc.nextDouble();
        double avg=(a+b)/2;
        System.out.println("Average ="+avg);
        sc.close();
    }
}
