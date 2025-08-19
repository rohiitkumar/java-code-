// Reverse of a number  
import java.util.Scanner; 
 
class reverse { 
    public static void main(String args[]) { 
        int  n, rev = 0; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("\n Enter n :"); 
        n = sc.nextInt(); 
        while (n != 0) { 
            int rem = n % 10; 
            rev = rev * 10 + rem; 
            n = n / 10; 
             
 
        } 
        System.out.print("\n reverse = " + rev);
 
    }
}    