import java.util.Scanner;

public class First {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = 0;

        // a+b가 0이 아니면 계속 반복
        while((a+b) != 0) {
            a = sc.nextInt();
            b = sc.nextInt();

            // a=0 && b=0 일 때
            if (a+b == 0){
                break;

            } else {
                System.out.println(a+b);
            }
        }
    }
}