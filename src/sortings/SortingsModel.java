package sortings;

/**
 *
 * @author cjcal
 */

public class SortingsModel {
    
    private int[] intArray;
    private int arraySize;
    
    public void reset(int size){
        setArraySize(size);
        intArray = new int[size];
        
        for (int i = 0; i < size; i++){
            intArray[i] = i+1;
        }
        
        for (int i = 0; i < size - 1; i++){
            int temp = 0;
            int randomIndex = (int)(Math.random()*size);
            temp = intArray[i];
            intArray[i] = intArray[randomIndex];
            intArray[randomIndex] = temp;
        }
            
    };
    
    public int[] getUnsortedList() {
        return intArray;
    };
    
    private int getArraySize(){
        return arraySize;
    };
    
    private void setArraySize(int size){
        arraySize = size;
    };
}
