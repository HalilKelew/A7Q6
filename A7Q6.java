package Assignments;
import java.util.Scanner;


public class A7Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = input.next();
        if (word.length() == 5)
        {
            String reverse = new StringBuffer(word).reverse().toString();
            System.out.println("reverse = " + reverse);
        }
        else if (word.length() > 5)
            System.err.print("too long");
        else
            System.err.print("too short");
    }
}
