import java.util.Random;
import java.util.*;

class BinarySearch{
    static int binarySearch(int[] randNums, int l, int r, int x){
        //System.out.println(Arrays.toString(randNums));
        //System.out.println(first);
        //System.out.println(last);
        //System.out.println(key);
 
        if (r>=l)
        {
            int mid = l + (r - l)/2;
   
            // If the element is present at the 
            // middle itself
            if (randNums[mid] == x)
               return mid;
   
            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (randNums[mid] > x)
               return binarySearch(randNums, l, mid-1, x);
   
            // Else the element can only be present
            // in right subarray
            return binarySearch(randNums, mid+1, r, x);
        }
   
        // We reach here when element is not present
        //  in array
        return -1;

    }

    public static int[] genRandObj(int[] randNums){
        Random objGenerator = new Random();
        for(int i = 0; i < randNums.length; i++){
            randNums[i] = objGenerator.nextInt(1000);
        }
        System.out.println(Arrays.toString(randNums));
        return randNums;
    }
   
    public static int prompt(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Pls enter a number to search for: ");
        int value = scan.nextInt();
        scan.close();
        return value;
    }



    public static void main(String[] args){

        int[] randNums = new int[1000];
        int key = 0;
        int last = 0;
        
        //int[] arr = {10,12,34,35,50,60};
        //int last = arr.length - 1;

        randNums = genRandObj(randNums);
        //System.out.println(Arrays.toString(randNums));
        key = prompt();
        last = randNums.length - 1;
        
        System.out.println(key);
     
        //binarySearch(arr, 0, last, key);
        int result = binarySearch(randNums, 0, last, key);
        System.out.println(last);

        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result); 
    }
}