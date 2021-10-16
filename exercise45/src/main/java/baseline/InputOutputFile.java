package baseline;

import java.util.ArrayList;
import java.util.List;

public class InputOutputFile {
    public List<ArrayList<String>> readTextFile() {
        //create a Scanner link to .txt file
        //create a list to Store result
        //loop keep going as long as input is not end-of-file marker
        //      read whole one line at a time
        //      call a parsing method to parse the space out, method should return arrayList of String
        //      add the arrayList of String to the list
        //return the big list
        return null;
    }

    private ArrayList<String> parseBySpace(String wholeLine) {
        //use a split method to parse the string
        //store the result as ArrayList of words
        //if the word contains " in it. break the " off of the word to its own word
        //      mark the side of the " with the - next to it
        //      meaning "word" will turn into ["-,word,-"]
        //return that arrayList
        return null;
    }

    public void outputTextFile(List<ArrayList<String>> parsedInput) {
        //loop through the list (paragraph)
        //  loop through the ArrayList (each line)
        //      check if the word is "-
        //          if so, display " having no space after it (to connect it to original word)
        //      check if the word is -"
        //          if so, display " having no space before it (to connect it to original word)
        //          also put ' '(space) after it
        //      display the word with a ' '(space) after it
    }
}
