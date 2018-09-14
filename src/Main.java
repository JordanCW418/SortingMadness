public class Main {

    public static void main(String[] args){
        int[] sortingArray = {3, 7, 4, 9, 5, 2, 6, 1};
        InsertionSort.insertionSort(sortingArray);

        for(int number : sortingArray){
            System.out.print("'"+number+"' ");
        }
    }
}
