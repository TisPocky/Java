class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String display() {
        return ("Name: " + name);
    }
}

class Info extends Student {
    int roll;

    public Info(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    public String display() {
        return (super.display() + "\nRoll: " + roll);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Info i = new Info("Pocky", 211635);
        System.out.println(i.display());
    }
}
