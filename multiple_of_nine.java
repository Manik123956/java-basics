import java.util.*;
public class multiple_of_nine {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:-");
        int a =sc.nextInt();
        sc.close();
        if(a%9==0){
            System.out.println(a + " is a multiple of nine");
        }
        else{
            System.out.println(a + " is not a multiple of nine");
        }
    }
}
