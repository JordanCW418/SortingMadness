public class InsertionSort {
    /**
     * Point of this class is to implement the insertion sort algorithm
     * https://en.wikipedia.org/wiki/Insertion_sort
     * О(n2)
     */

    public static int[] insertionSort(int[] sortingArray){
        int index = 0;

        while(index != sortingArray.length - 1){
            if(sortingArray[index] > sortingArray[index + 1]){
                swapValues(index, index + 1, sortingArray);
                if(index != 0 && sortingArray[index-1] > sortingArray[index]) {
                    int tempIndex = index;
                    while (tempIndex != 0 && sortingArray[tempIndex - 1] > sortingArray[tempIndex] ) {
                        swapValues(tempIndex - 1, tempIndex, sortingArray);
                        tempIndex--;
                    }
                }
            }
            index++;
        }
        return sortingArray;
    }

    private static int[] swapValues(int indexLeft, int indexRight, int[] array){
        int leftValue = array[indexLeft];
        array[indexLeft] = array[indexRight];
        array[indexRight] = leftValue;
        return array;
    }
}
