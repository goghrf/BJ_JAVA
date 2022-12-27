import java.util.Scanner;
public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //숫자를 저장할 배열 선언
        int[] list = new int[n];
        // 입력받은 숫자의 반복 횟수를 저장할 변수 선언
        int count = 0;

        for (int i = 0; i<n;i++){
            list[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        // 배열의 길이만큼 반복
        for(int i = 0; i< list.length; i++){
            // 입력받은 숫자와 배열의 요소가 같다면 카운트 +1
            if (list[i] == v) {
                count++;
            }
        }
        System.out.println(count);

    }
}



