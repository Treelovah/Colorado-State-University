/*
Define stubs for the methods called by the below main(). Each stub should print "FIXME: Finish methodName()" followed by a newline, and should return -1. Example output:

FIXME: Finish getUserNum()
FIXME: Finish getUserNum()
FIXME: Finish computeAvg()
Avg: -1

*/

import java.util.Scanner;

public class MthdStubsStatistics {

    public static int computeAvg(int userNum1, int userNum2) {
        System.out.printf("FIXME: Finish computeAvg()\n");
        return -1;
    }

    public static int getUserNum() {
        System.out.printf("FIXME: Finish getUserNum()\n");
        return -1;
    }

   public static void main(String [] args) {
      int userNum1;
      int userNum2;
      int avgResult;

      userNum1 = getUserNum();
      userNum2 = getUserNum();

      avgResult = computeAvg(userNum1, userNum2);
      scnr.close();
      System.out.println("Avg: " + avgResult);
   }
}