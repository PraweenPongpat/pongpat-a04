package baseline;

import java.io.File;

public record OutputFile(String nameOfSite, String author, boolean isJS, boolean isCSS) {

    //method to manage to create folder/files as needed from the given name
    private void fileFolderManager() {
        //create folder based on nameOfSite: data--->nameOfSite

        //call method makeHTMLFile to create .html with proper data init

        //if isJS is true, create JS folder: data--->nameOfSite--->JS

        //if isCSS is true, create CSS folder: data--->nameOfSite--->CSS

        //call method reportFolderFileExisted passing Files object to check
    }

    //create an HTML file uses the information of nameOfSite in <title> and author name in <meta>
    private void makeHTMLFile() {
        //create HTML file

        //create content in HTML file
        //write <title>nameOfSite</title> to it
        //write <meta> with author's name in it
        //close writer
    }

    private void reportFolderFileExisted (File fileName) {

        //check if the file/folder exists
        //if so,    display "created."
        //          display the relative path of the file/folder

    }

}
