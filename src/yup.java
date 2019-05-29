import java.lang.reflect.*;
public class yup {

    public String methodName(int i) {
        return "Hello World: " + i;
    }

    public static void main(String... args) throws Exception {
        yup t = new yup();
        Method m = yup.class.getMethod("methodName", int.class);
        String returnVal = (String) m.invoke(t, 5);
        System.out.println(returnVal);
    }
}