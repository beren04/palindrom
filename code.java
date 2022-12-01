package first;

import java.util.Scanner;

public class palindrom {

    static boolean isPalindrom(int a) {
        int temp=a;
        int reverseNumber=0;
        int lastNumber;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp /= 10;
        }
        if(a==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(48));
    }
}
