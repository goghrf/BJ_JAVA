import java.util.Scanner;

public class First {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        // 각 피스들의 개수를 순서대로 정렬해놓은 배열 선언
        int[] objects = {1,1,2,2,2,8};

        // 각 피스 당 부족하거나 많은 개수를 입력 값에 따라 계산
        for (int i =0; i<6; i++){
            int input = sc.nextInt();
            System.out.print(objects[i] - input+ " ");
        }
    }
}
