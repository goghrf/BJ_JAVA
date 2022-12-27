import java.util.Scanner;

public class First {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 총 금액
        int total = sc.nextInt();
        // 구매한 물건 종류
        int count = sc.nextInt();
        // 구매한 물건들의 금액 합
        int sum = 0;

        for (int i = 0; i<count; i++){  // 물건 종류 수만큼 반복
            int a = sc.nextInt();   // 물건 가격
            int b = sc.nextInt();   // 구매한 물건 개수
            sum += a*b;             // 종류별로 금액의 합에 더함
        }
        if (total == sum){
            System.out.print("Yes");
        } else
            System.out.print("No");

    }
}
