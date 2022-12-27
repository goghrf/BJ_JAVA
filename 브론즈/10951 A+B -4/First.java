import java.util.Scanner;

public class First {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        // 뒤에 입력값이 있으면 반복
        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }
}