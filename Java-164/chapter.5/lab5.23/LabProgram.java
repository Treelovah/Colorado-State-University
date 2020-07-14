import java.util.Scanner; 

public class LabProgram {
   
    public static int largestNumber(int num1, int num2, int num3) {
            if (num1 > num2) {
                if (num1 > num3) {
                return num1;
                } else {
                return num3;
                }
            } else if(num2 > num1) {
                if (num2 > num3) {
                    return num2;
                } else {
                    return num3;
                }
            } else {
                return 0;
            }
        }
        public static int smallestNumber(int num1, int num2, int num3) {
            if (num1 < num2) {
                if (num1 < num3) {
                return num1;
                } else {
                return num3;
                }
            } else if(num2 < num1) {
                if (num2 < num3) {
                    return num2;
                } else {
                    return num3;
                }
            } else {
                return 0;
            }
        }
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   int a = scnr.nextInt();
   int b = scnr.nextInt();
   int c = scnr.nextInt();
   scnr.close();
   System.out.printf("largest: %d\n",largestNumber(a,b,c));
   System.out.printf("smallest: %d\n",smallestNumber(a,b,c));
   
   }
}
