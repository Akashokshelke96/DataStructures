package delete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

      int num = 153351;
        System.out.println(ispalindrome(num));
    }
    public static boolean ispalindrome(int n){
        String str = Integer.toString(n);
        boolean result = false;
        for(int i = 0 ; i< str.length()/2 ; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                i++;
                result = true;
            } else {
                result = false;
            }

        }
        return result;
    }


}