import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the first number: ");
		 double num1 = sc.nextDouble();
		 System.out.print("Enter the second number: ");
		 double num2 = sc.nextDouble();
		 sc.close();
		 double product = num1 * num2;
		 System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
	}
}
