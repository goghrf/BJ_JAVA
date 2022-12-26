import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // 시와 분을 입력받을 변수
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 요리에 걸리는 시간 입력 변수
        int cook = sc.nextInt();

        // 조건문에서 시간 계산을 간편화할 변수
        int h = H+(M+cook)/60;
        int m = (M+cook)%60;

        if ((M+cook)<60) {
            System.out.print(H+ " "+(M+cook));
        } else {
            if (h>23){
                System.out.print((h-24) + " " + m);
            } else {
                System.out.print(h + " " + m);
            }
        }
    }
}
