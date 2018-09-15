package Sorting.SimpleSorts;


import Sorting.CommonSortingMethods;

public class SelectionSort
{
    /**
     * Point of this class is to implement the selection sort algorithm
     * https://en.wikipedia.org/wiki/Selection_sort
     * О(n2)
     */
    public static int[] selectionSort(int[] sortingArray){
        //For loop moves split index left of splitIndex is sorted right of it is unsorted
        for(int splitIndex = 0; splitIndex < sortingArray.length - 1; splitIndex++){

            //left index will hold current lowest values index
            int leftIndex = splitIndex;

            //for loop moves right index finding potentially smaller values than whats held in leftIndex
            for(int rightIndex = leftIndex; rightIndex < sortingArray.length; rightIndex++){

                //if we find a smaller value in rightIndex we make left Index equal to right index
                if(sortingArray[leftIndex] > sortingArray[rightIndex]){

                    leftIndex = rightIndex;
                }
            }

            //If we have moved leftIndex that means we found a smaller value and thus need to switch
            if(leftIndex != splitIndex){
                CommonSortingMethods.swapValues(splitIndex, leftIndex, sortingArray);
            }
        }
        return sortingArray;
    }
}
