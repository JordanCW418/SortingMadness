package SimpleSorts;

public class InsertionSort {
    /**
     * Point of this class is to implement the insertion sort algorithm
     * https://en.wikipedia.org/wiki/Insertion_sort
     * О(n2)
     */

    public static int[] insertionSort(int[] sortingArray){
        int index = 0;

        //While loop that loops over the entire array
        while(index != sortingArray.length - 1){

            //If Statement finds out of place numbers
            if(sortingArray[index] > sortingArray[index + 1]){

                //Swaps Index and index +1 numbers since we found out of place number
                swapValues(index, index + 1, sortingArray);

                //If statement decides if the swapped number needs to be inserted further left in the array
                if(index != 0 && sortingArray[index-1] > sortingArray[index]) {

                    int tempIndex = index;

                    //While loop moves tempIndex left until number is inserted in the proper place in the array
                    while (tempIndex != 0 && sortingArray[tempIndex - 1] > sortingArray[tempIndex] ) {
                        swapValues(tempIndex - 1, tempIndex, sortingArray);
                        tempIndex--;
                    }
                }
            }
            //Incrementing index so that we move forward in the array
            index++;
        }
        //return the sorted array
        return sortingArray;
    }

    private static int[] swapValues(int indexLeft, int indexRight, int[] array){

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
