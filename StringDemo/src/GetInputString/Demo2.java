package GetInputString;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String news = reverse(s);
        System.out.println(news);
    }

    public static String reverse(String s){
        String news = "";
        for (int i=s.length()-1; i>=0; i--){
            // s.charAt(i) 返回指定索引处的字符值
            news += s.charAt(i);
        }
        return news;
    }

}
