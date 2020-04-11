package GetInputString;

import java.util.Scanner;

// 计算输入字符串中 大写 小写 数字的个数
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入包涵大小写及数字的字符串");
        String s = scanner.nextLine();

        int bigLetter = 0;
        int smallLetter = 0;
        int number = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                bigLetter ++;
            }else if(ch>='A' && ch<='Z'){
                smallLetter ++;
            }else{
                number ++;
            }
        }
        System.out.println("bigLetter:" + bigLetter);
        System.out.println("smallLetter:" + smallLetter);
        System.out.println("number:" + number);
    }

}
