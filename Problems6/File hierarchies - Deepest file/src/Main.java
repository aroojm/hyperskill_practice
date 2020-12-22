/*
Download and unpack the following archive: https://stepik.org/media/attachments/lesson/91426/basedir.zip.

If you open it, you will see a hierarchy of files.

Write a program that finds the deepest file (or a directory) in this hierarchy.

Enter the name of the file you will get.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Application  {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/username/Downloads/filename");
        List<String> array = new ArrayList<String>();
        fillList(array, file);
        int longest = 0;
        String path = "";

        for (String string : array) {
            int len = string.split("\\/").length;
            if (len > longest) {
                longest = len;
                path = string;
            }

        }

        System.out.println(path);
        System.out.println(longest);
    }
    public static void fillList(List<String> array, File file) {
        if (file.isDirectory() && !isEmpty(file)) {
            File[] list = file.listFiles();
            for (File file2 : list) {
                fillList(array, file2);
            }
        }	else {
            array.add(file.getPath());

        }

    }

    public static boolean isEmpty(File file) {
        return file.list().length == 0;

    }
}