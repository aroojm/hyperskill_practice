import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        Class c = object.getClass();
        Field[] fArray = c.getDeclaredFields();
        List<String> result = new ArrayList<>();
        for (Field f : fArray) {
            int modifiers = f.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                result.add(f.getName());
            }
        }
        return result.toArray(new String[result.size()]);
    }

}