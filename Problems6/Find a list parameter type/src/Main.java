
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Scanner;

class ListParameterInspector {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fieldName = scanner.next();

        ListParameterInspector inspector = new ListParameterInspector();
        inspector.printParameterType(new TestClass(), fieldName);
    }

    public void printParameterType(TestClass obj, String fieldName) throws Exception {
       Field field = TestClass.class.getDeclaredField(fieldName);
       ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
       String str = parameterizedType.getActualTypeArguments()[0].getTypeName();
       System.out.println(str);

    }
}