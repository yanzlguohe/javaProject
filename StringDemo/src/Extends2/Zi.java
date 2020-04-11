package Extends2;

public class Zi extends Fu {
    public int age = 30;

    public void method(){
        int age = 20;
        // 访问方法中的变量
        System.out.println(age);
        // 访问本类中的成员变量
        System.out.println(this.age);
        // 访问父类中的成员变量
        System.out.println(super.age);
    }
}
