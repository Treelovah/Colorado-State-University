package FinalExam;

import java.util.Arrays;
public class FinalArrays {
    public static void main(String[] args) {
        //Declare, allocate, initialize array
        int anArray[] = {5,4,6,1,3};
        
        //First line
        System.out.println(anArray.length - 10);
        
        //Second line
        System.out.println(anArray[ 2 ]);
        
        //Sort array
        Arrays.sort(anArray);
        
        //Third line
        System.out.println(anArray[ 3 ]);
        
        //Transform array
        for(int index = 0; index < anArray.length; index++) {
            anArray[ index ] += 3;
        }
        
        //Fourth line
        System.out.println(anArray[ 4 ] + 1.0);
    }
}