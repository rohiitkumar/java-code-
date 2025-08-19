

import java.util.Scanner;

public class NumberToWords {
    private static final String[] ONES = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Number to Words Converter (1-99)");
        System.out.println("===============================");
        System.out.print("Enter a number (1-99): ");
        
        int number = scanner.nextInt();
        
        if (number < 1 || number > 99) {
            System.out.println("Error: Please enter a number between 1 and 99.");
        } else {
            String words = convertToWords(number);
            System.out.println("In words: " + words);
        }
        
        scanner.close();
    }
    
    public static String convertToWords(int num) {
        if (num < 20) {
            return ONES[num];
        } else {
            int tensDigit = num / 10;
            int onesDigit = num % 10;
            
            if (onesDigit == 0) {
                return TENS[tensDigit];
            } else {
                return TENS[tensDigit] + " " + ONES[onesDigit];
            }
        }
    }
}
