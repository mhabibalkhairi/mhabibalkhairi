package MoreOnClasses;

public class interfces {
    interface Animal{
        public void eat();
    }
    class Cat implements Animal{
        public void eat(){
            System.out.println(("Cat eats"));
        }
    }
}