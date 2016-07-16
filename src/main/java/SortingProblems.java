/**
 * Created with IntelliJ IDEA.
 * User: svejella
 * Date: 7/5/16
 * Time: 6:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortingProblems {

    public  int[] bubbleSort (int[] unSorted) {
        for (int j=0; j<unSorted.length-1; j++){

            for (int i=0; i<unSorted.length-1-j; i++){
                int temp;
                if (unSorted[i] > unSorted[i+1]){
                temp = unSorted[i];
                unSorted[i] = unSorted[i+1];
                unSorted[i+1] = temp;
                }

            }
    }
    return  unSorted;
}
//    public static void main (String[] args){
//        int[] unsorted = {5,1,4,2,8};
//        int[] sorted = bubbleSort(unsorted);
//        printArray(sorted);
//    }

    public  void printArray(int[] array){
        for(int x:array){
            System.out.print(x);
            System.out.print(',');
        }
    }
}
