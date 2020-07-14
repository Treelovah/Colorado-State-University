

import java.util.Scanner;

public class ArrayReversal {

    public static void reverseValues(int[] arr) {
        int last_item = arr.length -1;
        arr[0] ^= arr[last_item];
        arr[last_item] ^= arr[0];
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] arr = new int[4]; 
        for (int a = 0; a < 4; a++) {
            arr[a] += scnr.nextInt();
        }
        scnr.close();
        int i;
        int tempValue;
        for (i = 0; i < (arr.length); ++i) {
            tempValue = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length - 1 - i] = tempValue;
        }
        for (int a : arr) {
        System.out.println(a);
        }
    }
}