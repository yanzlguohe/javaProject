package Extends7;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setName("加菲猫");
        System.out.println(cat.getAge() + ", " + cat.getName());
        cat.eat();

        Cat cat1 = new Cat("懒猫", 4);
        System.out.println(cat1.getAge() + ", " + cat1.getName());
        cat1.eat();
    }
}
