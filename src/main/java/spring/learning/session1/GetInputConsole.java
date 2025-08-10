package spring.learning.session1;

import java.util.Scanner;

public class GetInputConsole {
    public static void main(String[] args) {
        System.out.println("Give me String: ");
        Scanner scanner = new Scanner(System.in);
        //int inputInt = scanner.nextInt();
        String inputString = scanner.nextLine();
        //System.out.println("the input you just type: " + inputInt);
        System.out.println("the string you just type: " + inputString);
    }
}
