import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        String result = "";
        for (int i = 0; i < classNames.length; i++) {
            Class c = Class.forName(classNames[i]);
            Method[] methods = c.getMethods();
            for (int j = 0; j < methods.length; j++) {
                if (methodName.equals(methods[j].getName())) {
                    result = classNames[i];
                    break;
                }
            }
        }
        return result;

    }
}