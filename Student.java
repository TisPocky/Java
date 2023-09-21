class Test {
    int roll;

    public Test(int roll) throws SemesterException {
        if (roll < 0) {
            throw new SemesterException("Invalid roll");
        }
        this.roll = roll;
    }
}

class Student {
    public static void main(String[] args) {
        try {
            Test s = new Test(-1);
        } catch (SemesterException e) {
            System.out.println(e.getMessage());
        }
    }
}
