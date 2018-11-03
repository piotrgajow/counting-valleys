package com.webappcraft.examples.valleys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This program is solving the Counting Valleys problem");
        System.out.print("Please specify the path: ");
        Scanner lr = new Scanner(System.in);
        String inputText = lr.nextLine();
        Integer valleyCount = valleyCounting(inputText);
        System.out.println("Number of valleys is equal to " + valleyCount);
    }

    static Integer valleyCounting(String inputText) {
        if (textValidation(inputText)) {
            return 0;
        }
        if (inputText.matches("[D,U]*")) {
            Integer level = 0;
            Integer valleyCount = 0;
            Boolean potentialValley = false;
            for (int i = 0; i < inputText.length(); i++) {
                if (inputText.charAt(i) == 'D') {
                    if (level == 0) {
                        potentialValley = true;
                    }
                    level--;
                } else if (inputText.charAt(i) == 'U') {
                    level++;
                    if (level == 0 && potentialValley) {
                        valleyCount++;
                    }
                }
            }
            return valleyCount;
        } else {
            throw new RuntimeException("Niepoprawny tekst");
        }
    }

    private static boolean textValidation(String inputText) {
        if (inputText == null) {
            return true;
        }
        if (inputText.matches("[D]*") || inputText.matches("[U]*")) {
            return true;
        }
        return false;
    }


}
