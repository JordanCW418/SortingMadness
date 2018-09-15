import Sorting.SimpleSorts.SelectionSort;

public class SelectionSortMain
{

    public static void main(String[] args){
        int[] sortingArray = {3, 7, 4, 9, 5, 2, 6, 1};
        SelectionSort.selectionSort(sortingArray);

        for(int number : sortingArray){
            System.out.print("'"+number+"' ");
        }
    }
}
