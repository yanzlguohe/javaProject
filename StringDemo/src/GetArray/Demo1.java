package GetArray;

import java.util.ArrayList;


// 数组与集合的区别， 数据是有固定大小，一旦创建了就不可以改变，而集合是可以动态扩容的
// 数组存放的数据只能是一种类型，而集合存放的类型可以不是一种
// char 是字符，使用单引号，只能存储一个字符， string 是字符串，可以存储多个字符
public class Demo1 {
    public static void main(String[] args) {
        int[] k = {1, 2, 3};
        String[] l = {"a we are family", "b"};
        System.out.println(k[0]);
        System.out.println(l[0]);
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(arrayList);
        arrayList.add("hello");
        System.out.println(arrayList);
        int asize = arrayList.size();
        System.out.println(asize);
        arrayList.set(0, "您好");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);
        for (String s : arrayList) {
            System.out.println(s);
        }
        for (int p: k ){
            System.out.println(p);
        }
    }
}
