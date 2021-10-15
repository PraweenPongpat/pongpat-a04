/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Locale;
import java.util.Scanner;

public class Solution43 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution43 sol = new Solution43();

        //ask and get nameOfSite and authorOfSite from user as a string
        String nameOfSite = sol.getStringFromUser("Please enter site name: ");
        String authorOfSite = sol.getStringFromUser("Please enter author's name: ");

        //ask the user to get whether needed to make javaScript or CSS or not
        boolean isJS = sol.checkYesOrNo("Do you want a folder for JavaScript? (Y for yes, N for no): ");
        boolean isCSS = sol.checkYesOrNo("Do you want a folder for CSS? (Y for yes, N for no): ");

        //allocate the OutputFile Class
        OutputFile output = new OutputFile(nameOfSite,authorOfSite,isJS,isCSS);

        //call method fileFolderManager to handle with constraints
        output.fileFolderManager();
    }

    private String getStringFromUser(String prompt) {
        //printf prompt
        System.out.print(prompt);
        //read String from user
        //return that string
        return input.nextLine();
    }

    private boolean checkYesOrNo (String prompt) {
        String userInput;
        while(true) {
            //display a prompt to users
            System.out.print(prompt);
            userInput = input.nextLine().toLowerCase(Locale.ROOT);
            //check if the answer is not character, if so, display "please enter Y for yes, N for no"
            //check if the answer is 'Y' or 'y'; if so, return true
            if(userInput.equals("y"))
                return true;
            //check if the answer is 'N' or 'n'; if so, return false
            else if(userInput.equals("n"))
                return false;
            //otherwise, re-ask for the value again
            else
                System.out.println("invalid input, please read carefully: Y for yes, N for no.");
        }
    }
}
