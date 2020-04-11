package GetArray;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Student {
    private String name;
    private int age;

    public Student(){};

    public Student(String name, int age){
        this.name = name;
        this.age = age;
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

    public void goSchool(){
        System.out.println("Go to school");
    }
}
