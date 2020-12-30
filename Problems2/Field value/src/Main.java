import java.lang.reflect.Field;
/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */
class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        Class c = object.getClass();
        try {
            Field f = c.getField(fieldName);
            return f.get(object);
        } catch (NoSuchFieldException e) {
            return null;
        }

    }

}