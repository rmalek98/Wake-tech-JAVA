import java.util.ArrayList;

public class ArrayUtil {
    // array field
    int [] intArray;

    // counstructor
    ArrayUtil(int [] arr){
        this.intArray = arr;
    }
ArrayUtil(){
        this.intArray = null;
    }
    // accessor
    int [] getArr(){
        return intArray;
    }

    // Modifier
    void setIntArray(int [] arr){
        this.intArray = arr;
    }

    // function for finding minium
    int minValue(){
        if(intArray.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]<min){
                min = intArray[i];
            }
        }
        return min;
    }

    // function for finding maximum
    int maxValue(){
        if(intArray.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<intArray.length; i++){
            if(intArray[i]>max){
                max = intArray[i];
            }
        }
        return max;
    }

    // function for counting unique integers in array and return the count
    int countUniqueIntegers(){
        if(intArray.length == 0)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0; i<intArray.length; i++){
            if(list.contains(intArray[i])==false){
                list.add(intArray[i]);
                count++;
            }
        }
        return count;
    }

    //bonus part

    void swap(int i, int j){
        int temp = intArray[i];
       intArray[i] = intArray[j];
       intArray[j] = temp;
    }

    boolean isSorted(boolean flag){
        // flag = true descending
        if(flag==true){
            for(int i=1; i<intArray.length; i++){
                if(intArray[i]>intArray[i-1])
                    return false;
            }
            return true;
        }else{
            for(int i=1; i<intArray.length; i++){
                if(intArray[i]<intArray[i-1])
                    return false;
            }
            return true;
        }
    }

    int [] removeDuplicates(){
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0; i<intArray.length; i++){
            if(list.contains(intArray[i])==false){
                list.add(intArray[i]);
                count++;
            }
        }
        int [] unique = new int[count];
        int i=0;
        for(int num: list){
            unique[i] = num;
            i++;
        }
        return unique;
    }
}