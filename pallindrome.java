import java.util.Scanner;

class  pallin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,remainder,rNum=0, oNum;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        oNum = n;

        while (n != 0) {
            remainder = n % 10;
            rNum = rNum * 10 + remainder;
            n /= 10;
        }

        if (oNum == rNum) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }
}
