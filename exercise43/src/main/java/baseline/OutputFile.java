package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public record OutputFile(String nameOfSite, String author, boolean isJS, boolean isCSS) {

    //method to manage to create folder/files as needed from the given name
    public void fileFolderManager() {
        //create folder based on nameOfSite: data--->nameOfSite
        File baseFolder = new File("data\\website\\"+nameOfSite);
        if(baseFolder.mkdirs())
            reportFolderFileExisted(baseFolder);
        //call method makeHTMLFile to create .html with proper data init
        File htmlFile = new File(baseFolder+"\\index.html");
        makeHTMLFile(baseFolder.toString());
        reportFolderFileExisted(htmlFile);

        //if isJS is true, create JS folder: data--->nameOfSite--->JS
        File jsFolder = new File(baseFolder+"\\JS");
        if(isJS && jsFolder.mkdirs())
            reportFolderFileExisted(jsFolder);

        //if isCSS is true, create CSS folder: data--->nameOfSite--->CSS
        File cssFolder = new File(baseFolder+"\\CSS");
        if(isCSS && cssFolder.mkdirs())
            reportFolderFileExisted(cssFolder);
    }

    //create an HTML file uses the information of nameOfSite in <title> and author name in <meta>
    private void makeHTMLFile(String basePath) {
        //create HTML file
        File output = new File(basePath+ "\\index.html");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {

                //create content in HTML file
                //write <title>nameOfSite</title> to it
                writer.write("<title>" + nameOfSite + "</title>");
                //write <meta> with author's name in it
                writer.write("<meta name=\"description\" content=\"" + author + "\">");
        } catch (IOException e) {
            System.out.println("HTML files cannot be made...");
        }
    }

    private void reportFolderFileExisted (File file) {
        //check if the file/folder exists
        if(file.exists()) {
            //if so,    display "created."
            //          display the relative path of the file/folder
            System.out.println("created. "+file.getPath());
        }
    }

}
