// grerting message
// => input hrs from user & print
// if hrs 0-12 good morning
//        13-18 good afternoon
//        19-24 good evening
//        invalid input otherwise
 
import java.util.Scanner; 

class greeting { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour: ");
        int hrs;
        hrs = sc.nextInt();
        if (hrs >= 0 && hrs <= 12) {
            System.out.println("Good Morning");
            }
        else if (hrs >= 13 && hrs <= 18) {
            System.out.println("Good Afternoon");
            }
        else if (hrs >= 19 && hrs <= 24) {
            System.out.println("Good Evening");
            }
        else {
            System.out.println("Invalid input");
            }

 
    }
}    