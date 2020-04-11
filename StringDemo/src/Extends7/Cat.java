package Extends7;

public class Cat extends Animal {

    public Cat(){
    };

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println(this.getAge() + "岁的" + this.getName() + "抓老鼠" );
    }
}
