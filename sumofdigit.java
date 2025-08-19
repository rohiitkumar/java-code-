
import java.util.Scanner; 
 
class sod { 
    public static void main(String args[]) { 
        int  rem,n, sum = 0; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("\n Enter n :"); 
        n = sc.nextInt(); 
        while (n != 0) { 
            rem = n % 10; 
            sum = sum + rem ; 
            n=n/10;
             
 
        } 
        System.out.print("\n sum = " + sum);
 
    }
}    