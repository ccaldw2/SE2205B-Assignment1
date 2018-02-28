package sortings;

/**
 *
 * @author cjcal
 */
public class MergeSort implements SortingStrategy {
    
    @Override
    public void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }
    
    private void mergeSort(int[] arr, int first, int last){
        if (first<last){
            int mid = (first + last)/2;
            mergeSort(arr, first, mid);
            mergeSort(arr, mid+1, last);
            merge(arr,first, mid, mid+1, last);
        }
    }
    
    private void merge (int[] arr, int first1, int last1, int first2, int last2){
        
        int sz1 = last1-first1 + 1;
        int sz2 = last2-first2 +1;
        
        int[] arr1 = new int[sz1];
        int[] arr2 = new int[sz2];
     
        for (int i = 0; i < sz1; i++) arr1[i] = arr[first1 + i];
        for (int i = 0; i < sz2; i++) arr2[i] = arr[first2 + i];
        
        for (int ix1 = 0, ix2 = 0, dest = first1; dest<=last2; dest++){
            if (ix1>=sz1) arr[dest]=arr2[ix2++];
            else if (ix2>=sz2) arr[dest]=arr1[ix1++];
            else if (arr1[ix1]<arr2[ix2]) arr[dest] = arr1[ix1++];
            else arr[dest] = arr2[ix2++];
        }
    }      
}
