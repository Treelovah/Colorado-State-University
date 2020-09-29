import java.io.IOError;

public class TestingFunctions {
    
    public static void reverseWindow(int[] arr, int index1, int index2) throws IndexOutOfBoundsException
    {
        if (index1 > index2)
        {
            int tmp = index1;
            index1 = index2;
            index2 = tmp;
        }
        int pos = index2-1;
        for (int i = index1; i < pos; i++)
        {
            int tmp = arr[i];
            arr[i] = arr[index2-1];
            arr[index2-1] = tmp;
            index2--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = i+1;
        
        int index1 = 2, index2 = 0;

        reverseWindow(arr, index1, index2);

    }
}
