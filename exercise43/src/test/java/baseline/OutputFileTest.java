package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class OutputFileTest {
    //*******************The first run of test may not be accurate, depends on the initial state of folders existed
    //*******************reliable result will be at second run and after

    @Test
    void fileFolderManagerTest1() {
        OutputFile createOnlyHTML = new OutputFile("awesomeco","james",false,false);
        createOnlyHTML.fileFolderManager();

        File baseFolderTest1 = new File("data\\website\\awesomeco");
        boolean resBaseFolder1 = baseFolderTest1.exists();

        File htmlFileTest1 = new File("data\\website\\awesomeco\\index.html");
        boolean resHtmlFile1 = htmlFileTest1.exists();

        File jsFolderTest1 = new File("data\\website\\awesomeco\\JS");
        boolean resJsFile1 = jsFolderTest1.exists();

        File cssFolderTest1 = new File("data\\website\\awesomeco\\CSS");
        boolean resCssFile1 = cssFolderTest1.exists();

        assertEquals(true,resBaseFolder1);
        assertEquals(true,resHtmlFile1);
        assertEquals(false,resJsFile1);
        assertEquals(false,resCssFile1);

        //manually delete directories for other tests
        htmlFileTest1.delete();
        baseFolderTest1.delete();
        File dataWebsiteDir = new File("data\\website");
        dataWebsiteDir.delete();
        //at this point of finishing test1, leaving only blank dir 'data'
    }
    @Test
    void fileFolderManagerTest2() {
        //testing if files/folders exists
        OutputFile createAll = new OutputFile("awesomeco","james",true,true);
        createAll.fileFolderManager();

        File baseFolderTest2 = new File("data\\website\\awesomeco");
        boolean resBaseFolder2 = baseFolderTest2.exists();

        File htmlFileTest2 = new File("data\\website\\awesomeco\\index.html");
        boolean resHtmlFile2 = htmlFileTest2.exists();

        File jsFolderTest2 = new File("data\\website\\awesomeco\\JS");
        boolean resJsFile2 = jsFolderTest2.exists();

        File cssFolderTest2 = new File("data\\website\\awesomeco\\CSS");
        boolean resCssFile2 = cssFolderTest2.exists();

        assertEquals(true,resBaseFolder2);
        assertEquals(true,resHtmlFile2);
        assertEquals(true,resJsFile2);
        assertEquals(true,resCssFile2);

        //manually delete directories for other tests
        htmlFileTest2.delete();
        jsFolderTest2.delete();
        cssFolderTest2.delete();
        baseFolderTest2.delete();
        File dataWebsiteDir = new File("data\\website");
        dataWebsiteDir.delete();
        //at this point of finishing test1, leaving only blank dir 'data'
    }
}