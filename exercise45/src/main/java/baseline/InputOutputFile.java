package baseline;

public class InputOutputFile {
    private String changeFrom;
    private String changeTo;
    private int occurrences;

    public InputOutputFile(String changeFrom, String changeTo) {
        this.changeFrom = changeFrom;
        this.changeTo = changeTo;
        this.occurrences = 0;
    }

    public String[] readFile() {
        //create a scanner link to the file input .txt

        //loop as long as input doesn't meet end-of-file marker
        //  read input one line at a time
        //  keep appending the string

        //parse the string using split
        //store result as string[]

        //return that string[]
        return null;
    }

    public StringBuilder replaceWords(String[] originalString) {
        //allocate the StringBuilder to store result

        //loop through the string[]
        //check one word at a time (one string at a time)
        //  if the word contains the keyword changeFrom
        //      replace that word
        //      increment the occurrence (class variable)
        //  appends the word to StringBuilder
        //  also append ' ' (one space) to it as separation of the word

        //return the result StringBuilder
        return null;
    }

    public void displayOutput(StringBuilder output) {
        //allocate a BufferedWriter link to the output .txt file
        //write the output to the .txt file
    }
}
