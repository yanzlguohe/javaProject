package Extends;

public class Demo1 {
    public static void main(String[] args) {
        Zi z = new Zi("林轩", 30);
        z.method();
        z.show();
        System.out.println(z.getAge());
        System.out.println(z.getName());
    }
}
