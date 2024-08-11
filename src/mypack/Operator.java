package mypack;

public class Operator {
    public static void main(String[] args) {
        // 전위형
        int a = 3;          // a = 3 선언
        int b = ++a;        // a에 1 더함 -> b에 대입
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        // 후위형
        int c = 3;
        int d = c++;  //  d에 c를 대입  -> c는 1이 더해짐
        System.out.println(c);
        System.out.println(d);
    }
}
