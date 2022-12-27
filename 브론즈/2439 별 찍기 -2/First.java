import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // 출력 줄 개수(마지막 줄 별 개수) 변수
        int N = sc.nextInt();

        // N만큼 반복
        for (int i = 1; i<=N; i++){
            // 공백을 N-i만큼 반복 출력
            for (int k = N-i; k>0; k--){
                System.out.print(" ");
            }
            // 별을 i 만큼 반복 출력
            for (int j=1; j<=i; j++){
                System.out.print("*");
                // 줄바꿈 출력
                if (j==i){
                    System.out.println("");
                }
            }
        }
    }
}