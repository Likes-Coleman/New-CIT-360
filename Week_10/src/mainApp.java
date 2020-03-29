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

public class mainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter \"a\" to calculate the sum of two numbers"
                + " or enter \"b\" to calculate the multiplication of two numbers: ");
        String selection = scanner.next();

        // Creates the control handlers.
        appController myController = new appController();
        myController.mapCommand("a", new aHandler());
        myController.mapCommand("b", new bHandler());

        // Creates the hashmap and controll handler request.
        HashMap selectionMap = new HashMap();
        myController.handleRequest(selection, selectionMap);

    }
}