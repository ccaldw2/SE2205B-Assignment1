package sortings;

/**
 *
 * @author cjcal
 */
public class SelectionSort implements SortingStrategy {
    
    @Override
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[smallestIndex]) smallestIndex = j;
            }
        int temp = arr[i];
        arr[i] = arr[smallestIndex];
        arr[smallestIndex] = temp;   
        try{
                Thread.sleep(50);
            } catch (InterruptedException ex) {}
        }
    }
}
