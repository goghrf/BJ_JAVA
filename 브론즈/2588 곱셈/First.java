import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // 곱셈 피 연산 변수 선언
        int A = sc.nextInt();
        int B = sc.nextInt();

        // B를 저장해놓을 변수 C 선언
        int C = B;

        // B가 0이 될 때까지 반복
        while (B!=0){
            // A와 B 나누기 10의 나머지의 곱을 출력
            System.out.println(A*(B%10));
            // B는 B 나누기 10의 몫
            B = B / 10;
        }
        // A와 B의 값을 저장해놓은 C의 곱셈 결과 출력
        System.out.println(A*C);
    }
}
