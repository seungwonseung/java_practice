package mypack;

public class DataType {
    public static void main(String[] args) {
        byte a = 3;

        byte b = 5;
//        byte c = 130;             // 데이터의 크기가 안 맞음. byte는 1byte의 크기
        int c = 130;                // 그럴 땐 int형으로 int형은 4byte의 크기
//        byte d = a + b;           // byte + byte는 int 형으로 되기 때문에 int로 선언
        int d = a + b;              // int 형으로 선언 후 연산 대입

        long e = 100;

//        float f = 3.5; // float는 4byte, double은 8byte 값 뒤에 f를 붙이지 않음 -> double로 인식
//        데이터크기가 8byte인 double은 4byte인 float라는 그릇에 들어갈 수 없음

        // 1. float 라고 선언한 뒤 f를 붙임.
        float f = 3.5f;

        // 2. 선언할 때 double로 선언함.
        double g = 3.5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);



        // 자료형 변환을 통한 연산 후 출력값 알아보기
        System.out.println("자료형 변환을 통한 연산 후 출력값 알아보기");
        System.out.println((int)5.6 + 3.5);
        System.out.println((int)5.6 + (int)3.5);
        System.out.println((int)(5.6 + 3.5));
        System.out.println(7 / 4);
        System.out.println((double)3 / 2);
        System.out.println((double)(3 / 2));

    }
}
