
import java.util.Scanner; 
 
class GCD { 
    public static void main(String args[]) { 
        int  i,a,b,gcd=1; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("\n Enter a & b:"); 
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
                }
                
               

        } 
         System.out.println("\n GCD =" + gcd);
 
    }
}    