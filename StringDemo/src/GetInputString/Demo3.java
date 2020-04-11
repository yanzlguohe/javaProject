package GetInputString;


// StringBuilder 可以方便的操作字符串
public class Demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
    }
}
