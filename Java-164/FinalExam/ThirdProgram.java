package FinalExam;
import java.util.Arrays;

public class ThirdProgram {
    public static void init (String[][] sArray)
    {
        for (int row = 0; row < sArray.length; row++)
        {
            for (int col = 0; col < sArray[ row ].length; col++)
            {
                sArray[ row ][ col ] = row + ":" + col;
            }
        }
    }

    public static void main(String[] args) {
        String[][] strings2D = new String[ 2 ][ 3 ];
        System.out.println(strings2D.length);

        init(strings2D);
        System.out.println(strings2D[ 0 ].length);

        System.out.println(strings2D[ 1 ][ 2 ]);

        strings2D[ 0 ][ 1 ] = "Very";
        System.out.println((Arrays.toString(strings2D[0])));

        strings2D[ 1 ][strings2D[ 0 ].length-1] = "Nice";
        System.out.println(Arrays.toString(strings2D[ 1 ]));
    }
}