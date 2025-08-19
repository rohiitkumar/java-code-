import java.util.Scanner; 
 
class Disc { 
    public static void main(String args[]) { 
        float n, d = 0; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("\n Enter n:"); 
        n = sc.nextFloat();

        if(n >= 1 && n <= 1000) {
            d = (n * 5) / 100;
        } else if(n >= 1001 && n <= 5000) {
            d = (n * 10) / 100;
        } else if(n >= 5001) {
            d = (n * 15) / 100;
        } else {
            System.out.println("Invalid input");
        }

        System.out.print("\n Discount d: " + d);
    }
}
