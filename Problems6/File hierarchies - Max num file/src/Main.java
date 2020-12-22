/*
Download and unpack the following archive: https://stepik.org/media/attachments/lesson/91404/basedir.zip.

If you unpack and open it, you will see a lot of directories containing files.

You must write a program that finds a directory with the maximum number of files.

Enter the name of the directory and the number of files in it separated by one space.
 */
import java.io.File;

public class Application  {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/username/Downloads/filename");
        File[] array = file.listFiles();
        int count = 0;
        String name = "";

        for (File file2 : array) {
            int len = file2.listFiles().length;
            if (len > count) {
                count = len;
                name = file2.getName();
            }
        }

        System.out.println(name);
        System.out.println(count);

    }
}