import java.util.Scanner;

public class First{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 성적을 입력받을 변수
        int score = sc.nextInt();

        if (score >= 90) {          // 성적이 90점 이상이라면 A
            System.out.print("A");
        } else if (score >= 80){    // 성적이 80점 이상이고 90점 이하라면 B
            System.out.print("B");
        } else if (score >= 70) {   // 성적이 70점 이상이고 80점 이하라면 C
            System.out.print("C");
        } else if (score >= 60) {   // 성적이 60점 이상이고 70점 이하라면 D
            System.out.print("D");
        } else {                    // 성적이 60점 이하라면 F
            System.out.print("F");
        }
    }
}
