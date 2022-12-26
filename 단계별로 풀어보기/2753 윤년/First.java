import java.util.Scanner;

public class First {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 연도를 입력받음
        int year = sc.nextInt();

        // 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때 윤년
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
}
