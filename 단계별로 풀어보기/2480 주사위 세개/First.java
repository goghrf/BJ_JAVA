import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // 주사위의 눈금 변수
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 상금 변수 0으로 초기화
        int money = 0;

        // 주사위 중 가장 큰 눈금을 저장할 변수
        int max = a;

        if (b >= a) {       // b가 a보다 크거나 같고
            if (b>=c){      // b가 c보다 크거나 같으면
                max = b;    // max는 b
            } else {        // b가 c보다 작으면
                max = c;    // max는 c
            }
        } else {            // b가 a보다 작고
            if (a>=c) {     // a가 c보다 크거나 같으면
                max = a;    // max는 a
            } else {        // a가 c보다 작으면
                max = c;    // max는 c
            }
        }
        if ((a==b) && (a==c)) {                         // 세 주사위가 모두 같을 때
            money = 10000 + a*1000;
        } else if ((a==b) && (a!=c)) {                  // 두 주사위가 같고 하나가 다를 때
            money = 1000 + a*100;
        } else if ((b==c) && (b != a)) {
            money = 1000 + b*100;
        }  else if ((a==c) && (a!=b)) {
            money = 1000 + a*100;
        } else if ((a != b) && (b != c) && (a != c)) {  // 세 주사위가 모두 다를 때
            money = max * 100;
        }
        System.out.print(money);
    }
}
