package mypack;

public class ConState {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++) {
            if(i != 3){
                System.out.println(i);
            }
            scoreFound(i);
        }
    }


    public static void scoreFound(Integer args) { // 연습문제 - 학점 계산기
        int score = args;

        if(score >= 90){
            System.out.println("A");
        } else if(score >= 80){
            System.out.println("B");
        } else if(score >= 70){
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
