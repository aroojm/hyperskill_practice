
import java.util.Scanner;
import java.lang.reflect.Method;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws Exception {
        Method method = TestClass.class.getMethod(methodName);
        System.out.println(method.getTypeParameters().length);
    }
}