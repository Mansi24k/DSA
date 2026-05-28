import java.util.*;;

public class Array1 {
    //1 Array as argument

    //update function to change array value
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
            System.out.println(marks[i]);
        }
    }

    //2 linear search in array
    public static int linearSearch(int num[], int key){
        for(int i =0; i<num.length; i++){
            if (num[i] == key ) {
                return i;
        }
        }
        return -1;
    }

    //3. menu search using linear search
    public static int SelectLinearSearch(String menu[], int final_value){
        
        for(int i=0; i<menu.length; i++){
            if (i == final_value) {
                return i;
            }
        }
        return -1;
    }

    //4. to find largest and smallest element int array using interger.MIN-VALUE and  interger.MAX-VALUE
    public static void Find_Num(int number[]){
        int largest =   Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            //for largest number
            if (largest<number[i]) {
                largest = number[i];
            }
            //for smallest number
            if(smallest > number[i]){
                smallest = number[i];
            }
                }
                System.out.println("Largest number is: "+largest);
                System.out.println("Smallest number is: "+smallest);
    }

    //5. binary search
    public static int binarySearch(int numbers[], int key){
            //start and end
            int start=0, end = numbers.length-1;

            //compare
            while(start <= end){
                //mid value
                int mid = (start+end)/2;

                if(numbers[mid] == key){
                    return mid;
                }
                if(numbers[mid] < key){
                    start = mid+1;
                }
                if (numbers[mid] >key) {
                    end = mid-1;
                }
            }
            return -1;
    }

    //6. reverse array
    public static void reverse(int  numtwo[]){
        int first = 0, Last = numtwo.length-1;

        while (first < Last) {
            int temp =  numtwo[Last];
            numtwo[Last] = numtwo[first];
            numtwo[first] = temp;

            first++;
            Last--;
        }
    }

    //7. pairs in an array
    public static void printpairs(int numthree[]){
        //to count total pairs
        int tp =0;
        for(int i=0; i< numthree.length; i++){
            int current = numthree[i];
            for(int j=i+1; j<numthree.length; j++){
                System.out.print("("+current+","+numthree[j]+")"+ " ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs= "+tp);
    }

    //8.print subarrays of given array
    public static void printsubarray(int arrayfour[]){
    // to find total pairs
        int tp =0;
        //to find sum of each subarray
        int sum =0;

        for(int i=0; i<arrayfour.length; i++){
            int start = i;
            sum = arrayfour[i];
            for(int j=i; j<arrayfour.length; j++){
                int end =j;
                for(int k=start ;k<=end; k++){
                    System.out.print(arrayfour[k]+ " ");   
                }
                tp++;
                
                if (arrayfour[start] == arrayfour[end]) {
                    System.out.print("sum "+sum); 
                }else{
                    sum = sum + arrayfour[end]; 
                    System.out.print("sum "+sum);  
                }
               
                System.out.println();
            }
            
            System.out.println();
        }
        System.out.println("total pairs= "+tp);
    }

    //. 9. to find maxsum of an subarray -- brute forece (basic solution to find)
    public static void maxsubarraysum(int arrayfour[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i=0; i < arrayfour.length ; i++){
            int start = i;
            for(int j=i; j<arrayfour.length;j++){
                int end = j;
                currsum=0;
                for(int k=start; k<=end ; k++){
                    //sum of subarrray
                    currsum += arrayfour[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum= "+ maxsum);
    }



    public static void main(String args[]){
        //for array as argument
        //int marks[]={91,92,93};
        //call update function and passing array into function
        //update(marks);

        //for linear search
        // int num[] ={2,4,5,10,11,5,6};
        // int key = 10;

        // int index = linearSearch(num , key);

        // if(index == -1){
        //     System.err.println("Not Found");
        // }else{
        //     System.out.println("key is at index: "+index);
        // }

        //for menu using linear search
        // String menu[] = {"1. dosa", "2. sandwich", "3. coke", "4. fruti", "5. Samosa"} ;
        // for(int i=0; i< menu.length; i++){
        //     System.out.println(menu[i]);
        // }

        // System.out.println();
        // System.out.println("What is your order number of food: ");

        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();
        // int final_value = choice-1;

        // int finalch = SelectLinearSearch(menu, final_value);
       
        // if(finalch == -1){
        //     System.out.println("Not in menu select from menu");
        // }else{
        //     System.out.println("Here is your order: " + menu[finalch]);
        // }

        //for largest and smallest number in array
        // int number[] ={1,2,6,3,5};
        // Find_Num( number);

        //for binary search
        // int numbers[] = {2,4,5,6,7,8,9,10,11};
        // int key = 8;
        // System.out.println("the index of key is: "+ binarySearch( numbers,  key) );

        //for reverse array
    //     int  numtwo[] = {2,5,6,8,10};
        
    //     reverse( numtwo);
    //     for(int i=0; i<numtwo.length; i++){
    //         System.out.print(numtwo[i]+" ");
    //     }

    //for pairs in an array
    // int numthree[] = {2,4,5,6,8,10};
    // printpairs(numthree);

    //for subarrays of given array
    int arrayfour[] = {2,4,6,8,10};
    //printsubarray(arrayfour);

    //for maxsum of subarray
    maxsubarraysum(arrayfour);


     }
}
