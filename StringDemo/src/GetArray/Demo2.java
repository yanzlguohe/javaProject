package GetArray;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<Student>();
        Student sd1 = new Student("林轩", 30);
        Student sd2 = new Student("簟轩", 30);
        st.add(sd1);
        st.add(sd2);
        for (Student k: st){
            System.out.println(k.getName()+ "：" +  " " + k.getAge());
        }
    }
}
