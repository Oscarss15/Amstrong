package dev.oscar;

public class Amstrong {

  

   
        public static boolean isNumberAmstrong(int num) {
            int OrigNum;
            int lastDigit;
            double digits; 
            double sum = 0;
            OrigNum = num; 
            digits = Math.floor(Math.log10(num)) + 1; 
            while (num > 0) {
                lastDigit = num % 10; 
                sum = sum + Math.pow(lastDigit, digits);
                num = num / 10; 
            }
            return OrigNum == sum;
        }
    
        public static void main(String args[]) {
            int num = 371;
            if (isNumberAmstrong(num)) {
                System.out.println(num + " is a Amstrong number");
            } else {
                System.out.println(num + " isn't a Amstrong number");
            }
        }
}
