package baseline;

import java.util.Scanner;

public class Solution43 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution43 sol = new Solution43();

        //ask and get nameOfSite and authorOfSite from user as a string
        String nameOfSite = sol.getStringFromUser("");
        String authorOfSite = sol.getStringFromUser("");

        //ask the user to get whether needed to make javaScript or CSS or not
        boolean isJS = sol.checkYesOrNo("");
        boolean isCSS = sol.checkYesOrNo("");

        //allocate the OutputFile Class
        OutputFile output = new OutputFile("","",false,false);

        //call method fileFolderManager to handle with constraints
    }

    private String getStringFromUser(String prompt) {
        //printf prompt
        //read String from user
        //return that string
        return "";
    }

    private boolean checkYesOrNo (String prompt) {
        //display a prompt to user
        //check if the answer is not character, if so, display "please enter Y for yes, N for no"
        //check if the answer is 'Y' or 'y'; if so, return true
        //check if the answer is 'N' or 'n'; if so, return false
        //otherwise, re-ask for the value again
        return false;
    }
}
