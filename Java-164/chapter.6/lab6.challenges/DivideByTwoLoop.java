import java.util.Scanner;

public class DivideByTwoLoop {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int user_num = scnr.nextInt();

        System.out.printf("%d ",user_num);
        while (user_num > 1) {
            user_num = user_num / 2;
            System.out.printf("%d ",user_num);
        }
        scnr.close();
        System.out.println("");
    }
}