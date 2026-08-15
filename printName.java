import java.util.Scanner;
public class printName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name:-");
        String a = sc.nextLine();
        System.out.println("Enter the last name:-");
        String b =sc.nextLine();
        System.out.println("name :-"+a+" "+b);
        sc.close();

    }
}
