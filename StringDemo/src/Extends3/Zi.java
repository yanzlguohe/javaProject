package Extends3;


// 子类初始化之前一定要完成父类的初始化，
// 如果父类没有无参的构造方法，则可以通过 super 关键字去显示的调用父类的带参构造方法
public class Zi extends Fu{
    public String name;
    public int age;

    public Zi(){
        super("fsdf", 30);
        System.out.println("zi 无参数构造方法被调用");
    };

    public Zi(String name, int age){
        super("fsdf", 30);
        System.out.println("zi 有参数构造方法被调用");
    }

}
