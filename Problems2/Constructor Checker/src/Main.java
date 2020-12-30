import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 Check whether the class declares public parameterless constructor
 */
class ConstructorChecker {

    public boolean checkPublicParameterlessConstructor(Class<?> clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        boolean flag = false;

        for (Constructor c : constructors) {
            int modifiers = c.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                Class[] params = c.getParameterTypes();
                if (params.length == 0) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

}