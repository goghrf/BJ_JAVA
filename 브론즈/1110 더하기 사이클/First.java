import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // 원래의 수로 돌아왔는지 여부
        boolean status = true;
        // 사이클의 길이 변수
        int count = 1;
        // 시작 변수
        int N = sc.nextInt();

        // N이 일의 자리 숫자 혹은 0일 때
        if (N < 10) {
            N *= 10;
        } else if (N == 0) {
            N = 10;
        }

        // 새로운 수가 될 변수. 첫 시작은 N
        int A = N;

        // status가 false가 될 때까지 반복
        while (status) {

            A = (A%10)*10 + ((A/10) + (A%10))%10;


            if (A == N) {       // 새로운 수와 원래의 N이 같아질 경우
                status = false;
            } else {            // 새로운 수와 원래의 N이 다를 경우
                count++;
            }
        }
        System.out.print(count);
    }
}