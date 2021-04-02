package MoreOnClasses;

public class AnonymousClasses {
    public static void main(String[] args) {
    }
    class Machine{
        Machine m = new Machine();{

        }
    }
    public void start(){
    }
    static{
        System.out.print("Hi");
    }
}