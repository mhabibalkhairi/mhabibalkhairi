package ClassesAndObject;

public class ReferenceType {
    public static void main(String[ ] args) {
        Person p = new Person();
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());
    }
    static void change(Person p) {
        p.setAge(10);
    }
    private static class Person {
        public void setAge(int i) {
        }
        public int getAge() {
            return 10;
        }
    }
}