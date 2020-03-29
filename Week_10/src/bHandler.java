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

public class bHandler implements Handler {

    @Override
    public void handleIt(HashMap<String, Object> data) {
        try {
            System.out.println(
                    "[Option b was selected.]\n" + "This option calculates the multiplication of two numbers.\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            Integer firstNum = scanner.nextInt();
            System.out.println("Enter the second number: ");
            Integer secondNum = scanner.nextInt();
            Integer mulResult = firstNum * secondNum;

            // Displays the multiplication result.
            System.out.println("\nThe multiplication result is: " + mulResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
