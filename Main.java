import java.util.Arrays;
import java.lang.*;

public class Main{
    
    private static void bubbleSort(int[] arr){
       int loops = arr.length - 1 ;
       while(loops > 0){
          for(int i=0; i<loops; i++){
               if(arr[i] > arr[i+1]){
                  arr = swap(arr,i,(i+1));
               }
          }
          loops--;//Decrement the loop counter
       }
        
        //print the result
        printInfo(arr);
    }
    
    private static int partition(int[] arr, int left, int right){
        
        System.out.println("left:"+left);
        System.out.println("Right:"+right);
        
        //set the boundary indices
        int i = left; int j = right;
        
        //calculate the pivot
        int pivot_index = (int) Math.floor((double) (left + right)/2.0);
        //System.out.println("WHAT IS GOING ON: "+ pivot_indexf);
        //int pivot_index = (left+right)/2;
        //System.out.println("FUCK: "+Math.ceil(2.0));
        //System.out.println("FUC2: "+Math.ceil(left+right/2));
        System.out.println("pIndex: "+pivot_index);
        int pivot = arr[pivot_index];
        //System.out.println("Pivot: "+pivot);
        
        //while the left pointer is on the left side and right pointer on the right
        while(i <= j){
            
            //skip all correctly partitioned values in the array, and get pointed to an incorrectly partioned value
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            
            //swap the two incorrect values
            if(i <= j){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               
               //keep the loop going
               i++;
               j--;
            }
        }
        
        
        return i;
        
    }
    
    private static void quicksort(int[] arr, int left, int right){
        int index = partition(arr,left,right);
        if(left<index-1){
            quicksort(arr,left,index-1);
        }
        if(index<right){
            quicksort(arr,index,right);
        }
        printInfo(arr);
    }
    
    private static int fibonacci(int n){
        
        //Knock these out because the first two numbers are 0 and 1, by definition
        if(n == 1){
            return 0;
        } else if (n == 2){
            return 1;
        } else {  //we got a live one!
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    //swaps the values
    private static int[] swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
        return arr;
    }
    
    //prints the array
    private static void printInfo(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args){
        /*
        //perform a bubble sort
        int[] arr = {3,5,2,1,4};
        System.out.print("Bubble Sort: ");
        bubbleSort(arr);
        
        //perform a fibonacci sequence to the nth number
        for(int n = 1; n <= Integer.parseInt(args[0]); n++){
           int nthFibNumber = fibonacci(n);
           System.out.println("Fibonacci Number " + (n-1) + ":  " + nthFibNumber);
        }
        
        //Talk about dogs!
        Dog munson = new Dog("Munson",40,4,"Ruff!");
        munson.printName();
        munson.printWeight();
        munson.speak();
        */
        
        //perform a quick sort
        int[] arr = {3,5,7,1,4};
        // 1,5,2,3,4
        //1,2,5,3,4
        int left = 0;
        int right = arr.length - 1;
        System.out.println("qLeft "+left);
        System.out.println("qRight " + right);
        quicksort(arr,left,right);
    }
}