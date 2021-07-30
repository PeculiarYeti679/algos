import java.util.Random;
import java.util.*;

class BinarySearch{
    static int binarySearch(int[] randNums, int first, int last, int key){
        //System.out.println(Arrays.toString(randNums));
        //System.out.println(first);
        //System.out.println(last);
        //System.out.println(key);
 
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (randNums[mid] == key){  
            return mid;  
            }  
            if (randNums[mid] > key){  
            return binarySearch(randNums, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(randNums, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }

    public static int[] genRandObj(int[] randNums){
        Random objGenerator = new Random();
        for(int i = 0; i < randNums.length; i++){
            randNums[i] = objGenerator.nextInt(10000000);
        }
        Arrays.sort(randNums);
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

        int[] randNums = new int[100000];
        int key = 0;
        int last = 0;
        
        //int[] arr = {10,12,34,35,50,60};
        //int last = arr.length - 1;

        randNums = genRandObj(randNums);
        //System.out.println(Arrays.toString(randNums));
        key = prompt();
        last = randNums.length - 1;
     
        //binarySearch(arr, 0, last, key);
        int result = binarySearch(randNums, 0, last, key);

        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result); 
    }
}