package Extends5;

public class PhoneNew extends Phone {

    @Override
    public void call(String name) {
        super.call(name);
        System.out.println("开启视频功能打电话给：" + name);
    }
}
