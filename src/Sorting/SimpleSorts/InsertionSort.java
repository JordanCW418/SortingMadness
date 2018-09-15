package Sorting.SimpleSorts;

import Sorting.CommonSortingMethods;

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
                CommonSortingMethods.swapValues(index, index + 1, sortingArray);

                //If statement decides if the swapped number needs to be inserted further left in the array
                if(index != 0 && sortingArray[index-1] > sortingArray[index]) {

                    int tempIndex = index;

                    //While loop moves tempIndex left until number is inserted in the proper place in the array
                    while (tempIndex != 0 && sortingArray[tempIndex - 1] > sortingArray[tempIndex] ) {
                        CommonSortingMethods.swapValues(tempIndex - 1, tempIndex, sortingArray);
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
}
