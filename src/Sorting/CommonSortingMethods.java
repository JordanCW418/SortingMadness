package Sorting;

public class CommonSortingMethods
{
	public static int[] swapValues(int indexLeft, int indexRight, int[] array){

		//keeping left index array value
		int leftValue = array[indexLeft];
		//assigning array at left index to the value in right index
		array[indexLeft] = array[indexRight];
		//assigning array at right index to the value we stored in leftValue
		array[indexRight] = leftValue;
		//return the array
		return array;
	}
}
