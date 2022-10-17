package reverseStringPackage;

import java.util.Scanner;

public class ReverseStringClass {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String reverse = "";
        String userInput;

        System.out.println("Enter a word");
        userInput = scn.nextLine();

        for (int i = userInput.length() - 1; i >= 0; i--) {

            reverse = reverse + userInput.charAt(i);

        }

        System.out.println(reverse);
    }
}















