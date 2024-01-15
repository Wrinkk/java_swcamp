import java.util.Scanner;

public class printStarPractice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        /*          *
         *         ***
         *        *****
         *         ***
         *          *
        * */
        System.out.println("숫자 입력");
        int num= scanner.nextInt();

        for (int i = 0; i <= num/2+1; i++) {
            for (int a = num; a > i; a--) {
                System.out.print(" ");

            }

            for (int j = 0;j < i; j++ ) {
                System.out.print("*");
                if (j >= 1){
                    System.out.print("*");
                }
            }
            System.out.println();
        } //윗부분 출력

        for (int i = 0; i <= num/2+1; i++) {
            for (int a = num-2; a > i; a--) {
                System.out.print(" ");
                if (i==1){
                    System.out.print(" ");
                }

            }

            for (int j = num-3 ;j > i; j-- ) {
                System.out.print("*");
                if (j <= 1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }// 아랫부분 출력... 5넣었을떄밖에 안나와요..
    }
}
