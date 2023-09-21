class One {
    String name;

    public One(String name) {
        this.name = name;
    }

    public String toString() {
        return ("Name: " + name);
    }
}

class Two {
    int roll;
    One o;

    public Two(int roll, One o) {
        this.roll = roll;
        this.o = o;
    }

    public String toString() {
        return (this.o + "\nRoll: " + roll);
    }

}

public class Composition {
    public static void main(String[] args) {
        One o = new One("Pocky");
        Two t = new Two(211635, o);
        System.out.println(t);
    }

}
