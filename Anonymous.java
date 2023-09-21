interface Animal {
    default void sound() {
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void sound() {
                System.out.println("Bark!");
            }
        };
        a.sound();
    }
}
