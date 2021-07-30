import java.util.Random;
import java.util.*;

public class linearSearch {

    public static int linearSearch(int[] randNums, int key){
        int value = 0;
        for(int i=0; i<randNums.length; i++){
            if(randNums[i] == key) {
                value = i;
            break;}
            else{
                value = -1;
            }
        }
        return value;
        
    }

    public static int[] genRandObj(int[] randNums){
        Random objGenerator = new Random();
        for(int i = 0; i < randNums.length; i++){
            randNums[i] = objGenerator.nextInt(100000000);
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
    public static void main(String[] args) {

        int[] randNums = new int[1000000];
        

        randNums = genRandObj(randNums);
        int key = prompt();
      
        
        System.out.println(key);
     
       
        int result = linearSearch(randNums, key);

        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+ result); 
    }
}

