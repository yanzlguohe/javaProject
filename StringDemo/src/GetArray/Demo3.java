package GetArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        for (int i=0; i<2; i++){
            getStudentList(arrayList);
        }
        System.out.println("++++++++" + "以下为输入结果" + "++++++++");
        for (Student s: arrayList){
            System.out.print("姓名：" + s.getName() + " ");
            System.out.println("年龄：" + s.getAge());
        }
    }

    public static void getStudentList(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.nextLine();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        Student s = new Student(name, age);
        arrayList.add(s);
    }
}
