import java.util.Scanner; 
 
class table { 
    public static void main(String args[]) { 
        int  n,i,temp; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("\n Enter n :"); 
        n = sc.nextInt(); 
        for(i=1;i<=10;i++)
        {
            temp=n*i;
            System.out.print("\n"+temp);
            
        }
        } 
        
    }
    