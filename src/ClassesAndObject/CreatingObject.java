package ClassesAndObject;

public class CreatingObject {
    public static void main(String[] args) {
    }
    public void test() {
        System.out.println("Hi");
    }
}
class B {
    public static void main(String args[ ]) {
        CreatingObject  obj = new CreatingObject();
        obj.test();
    }

}