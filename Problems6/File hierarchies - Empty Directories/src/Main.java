/*
Download and unpack the following archive: https://stepik.org/media/attachments/lesson/91407/basedir.zip.

If you open it, you will see a lot of directories containing subdirectories or/and files. A subdirectory may be empty or may contain some files.

Your task is to write a program that finds all empty subdirectories in this hierarchy.

Enter the names of the directories separated by spaces in any order
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Application  {

    public static void main(String[] args) throws Exception {
        File file = new File("/Users/username/Downloads/filename");
        File[] list = file.listFiles();
        for (File file2 : list) {
            File[] list2 = file2.listFiles();
            for (File file3 : list2) {
                if (file3.isDirectory() && file3.list().length == 0) {
                    System.out.print(file3.getName() + " ");
		  }
	}
}

    }

}