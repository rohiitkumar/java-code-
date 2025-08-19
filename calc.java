import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter first number A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter second number B: ");
        double b = scanner.nextDouble();


        System.out.println("\nChoose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        double result = 0;
        
       
        
        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Addition: " + a + " + " + b + " = " + result);
                break;
                
            case 2:
                result = a - b;
                System.out.println("Subtraction: " + a + " - " + b + " = " + result);
                break;
                
            case 3:
                result = a * b;
                System.out.println("Multiplication: " + a + " * " + b + " = " + result);
                break;
                
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division: " + a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
                
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

    }
}
