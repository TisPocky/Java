import java.lang.reflect.*;

public class Sample {
    int value;

    public Sample() {
        this.value = 10;
    }

    public void publicMethod() {
        System.out.println(this.value);
    }

    public void privateMethod() {
        System.out.println("This is a private method");
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception {
        Sample s = new Sample();
        Class<?> cls = s.getClass();
        System.out.println("Class Name: " + cls.getName());
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        Field f = cls.getDeclaredField("value");
        f.setAccessible(true);
        f.set(s, 100);
        Method pubM = cls.getDeclaredMethod("publicMethod");
        pubM.invoke(s);
        Method privM = cls.getDeclaredMethod("privateMethod");
        privM.setAccessible(true);
        privM.invoke(s);
    }
}
