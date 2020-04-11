package Extends7;

public class Dog extends Animal {

    public Dog(){
    };
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(this.getAge() + "岁的"+ this.getName() + "看门" );
    }
}