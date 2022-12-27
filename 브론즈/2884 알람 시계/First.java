import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        // 시, 분 입력받을 변수 선언
        int H = sc.nextInt();
        int M = sc.nextInt();


        if ((M-45) < 0) {   // M-45가 0보다 작을 경우
            M += 15;

            if (H==0) {     // H가 0일 때 H에 23 대입
                H=23;
            } else {        // H가 0이 아닐 때 -1
                H-=1;
            }
        } else {            // M-45가 0보다 클 경우
            M -= 45;
        }
        System.out.print(H + " " + M);
    }
}
