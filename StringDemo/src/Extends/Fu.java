package Extends;

public class Fu {
    public String name;
    public int age;

    public Fu(){
        System.out.println("Fu 无参数 类初始化");
    };
    public Fu(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Fu 有参数 类初始化");
    }
    public void show(){
        System.out.println("Show 方法");
    }
}
