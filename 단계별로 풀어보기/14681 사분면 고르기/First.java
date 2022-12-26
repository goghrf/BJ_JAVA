import java.util.Scanner;

public class First{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 좌표를 입력받을 두 변수 선언
        int x = sc.nextInt();
        int y = sc.nextInt();

        // x가 양수이면서
        if (x > 0)
            // y가 양수일 때
            if (y>0)
                System.out.print("1");
            // 그렇지 않을 때 (y가 음수일 때)
            else
                System.out.print("4");
        // x가 음수이면서
        else
            // y가 양수일 때
            if(y>0)
                System.out.print("2");
            // y가 음수일 때
            else
                System.out.print("3");
    }
}

