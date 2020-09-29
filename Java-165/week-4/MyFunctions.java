import java.util.*;
public class MyFunctions implements TestingFunctions {

	@Override
	public int greatestCommonDivisor(int a, int b) {
		// TODO Auto-generated method stub
		int gcd = 1;
		
		if (a < 0 || b < 0) return -1;
		if (a == 0 || b == 0) return 0;
		
		for (int i = 1; i <= a && i <= b; i++)
		{
			gcd = i;
		}
		return gcd;
	}

	@Override
	public void reverseWindow(int[] arr, int index1, int index2) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		/**
		 * This method reverses the subsection of the passed array defined by index1 
		 * and index2. index2 is non-inclusive and will not be swapped with index1. If
		 * index1 > index2 then the two indexes will be swapped before they are checked
		 * for validity.
		 * @param arr - the array to reverse
		 * @param index1 - the first index of the subsection
		 * @param index2 - the non-inclusive upper bound of the subsection, 
		 * last element swapped will be at the index (index2 - 1)
		 * @throws IndexOutOfBoundsException if index1 or (index2-1) are not valid indexes of arr
		 */
		
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

}
