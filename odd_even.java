import java.util.*;
public class odd_even {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number :-");
        int a = sc.nextInt();
        sc.close();
        if(a%2==0){
            System.out.println(a + " is an even number");
        }
        else{
            System.out.println(a + " is an odd number");
        }
    }
}
