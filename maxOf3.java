import java.util.*;
public class maxOf3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:-");
        int a =sc.nextInt();
        System.out.println("Enter the second number:-");
        int b =sc.nextInt();
        System.out.println("Enter the third number:-");
        int c =sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println("The maximum number is:-"+a);
        }
        else if(b>c && b>a){
            System.out.println("The maximum number is:-"+b);
        }
        else{
            System.out.println("The maximum number is:-"+c);
        }
    }
}
