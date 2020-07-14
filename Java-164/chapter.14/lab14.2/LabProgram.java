import java.util.Scanner;
import java.util.Arrays;

public class LabProgram {
    public static void sortArray(int[] myArr, int arrSize)
    {
        Arrays.sort(myArr);
        for (int num : myArr) System.out.printf("%d ",num);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int arrSize = scnr.nextInt();
        int[] myArr = new int[arrSize];
        
        for (int i = 0; i < arrSize; i++)
        {
            myArr[i] = scnr.nextInt();
        }
        sortArray(myArr, arrSize);
        scnr.close();
    }
}