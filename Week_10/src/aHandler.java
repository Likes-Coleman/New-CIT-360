/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
import java.util.HashMap;
import java.util.Scanner;

public class aHandler implements Handler {

    @Override
    public void handleIt(HashMap<String, Object> data) {
        try {
            System.out.println("[Option a was selected.]\n" + "This option calculates the sum of two numbers.\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            Integer firstNum = scanner.nextInt();
            System.out.println("Enter the second number: ");
            Integer secondNum = scanner.nextInt();
            Integer sumResult = firstNum + secondNum;

            // Displays the sum result.
            System.out.println("\nThe sum is: " + sumResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}