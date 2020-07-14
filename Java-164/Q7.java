public class Q7 
{
/**
     * selectionSort
     * 
     * This method performs a selection sort on an array recursively.
     * 
     * @param int[] values The array, full of integer values to sort
     * @param int   start The start index to begin sorting. Nothing before this
     *              index should be changed!
     * @param int   depth This variable is decremented on the first line of the
     *              method. If it is 0, return from the method immediately.
     * 
     *              Precondition: values is a valid int array with length >= 1.
     *              Precondition: 0 <= start < values.length Postcondition: The
     *              given array, from the position of start variable, is sorted in
     *              place from smallest to largest. Exception: if Depth causes a
     *              return, then fewer values are sorted, as appropriate.
     * 
     *              Note: The method should recursively call itself to sort the rest
     *              of the values. You will need a loop, though, to select the next
     *              smallest value.
     */

    public static void flip_it(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static void selectionSort(int[] arr, int start, int depth) {

        depth--; 
        if(depth == 0) return;
        //Place your code below this comment.

        if (start < 0 || start >= arr.length) return; { // conditional to work with smaller window (incase depth was unnecessarily high)

            int min = 2147483647;
            int mindex = 2147483647;

            for (int i = start; i < arr.length; i++) {

                if (arr[i] < min) {
                    min = arr[i];
                    mindex = i;
                }
            }
            flip_it(arr, start, mindex);
            int kr1z1z4n1D10t = start + 1;
            selectionSort(arr, kr1z1z4n1D10t, depth);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 3, 1, 6, 5, 4, 4, 2, 7, 8, 9, 3, 1 };
        // arr = new int[] {5,4,3,2,1};
        selectionSort(arr, 0, Integer.MAX_VALUE);
        for (int i : arr)
            System.out.printf("%d ", i);
        // swap(arr, p1, p2);
    }  
}

