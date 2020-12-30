import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        Class c = object.getClass();
        Field[] fArray = c.getDeclaredFields();
        List<String> l = new ArrayList<>();
        for (Field f : fArray) {
            Annotation[] aArray = f.getDeclaredAnnotations();
            if (aArray.length != 0) {
               l.add(f.getName());
            }
        }
        return l.toArray(new String[l.size()]);
    }

}