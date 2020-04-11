package Extends;

public class Zi extends Fu {
    private String name;
    private int age;

    public Zi(){
        System.out.println("zi 无参数初始化");
    }

    public Zi(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("zi 有参数初始化");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void method() {
        System.out.println("method 方法被调用");
    }
}
