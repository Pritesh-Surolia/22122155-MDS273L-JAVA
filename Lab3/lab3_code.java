import java.util.*;

public class lab3_code {
    public static void  main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of elements you wish to enter: ");
        int a = obj.nextInt();
        int[] arr = new int[a];
        System.out.println("---------------------------------------");
        System.out.println("You can enter the array elements:");
        for(int i = 0; i<a; i++) {
            arr[i] = obj.nextInt();
            System.out.printf("%d ", arr[i]);
        }
        //Now creating a Menu for mean/median/mode
        System.out.println("Select from the following...");
        System.out.println("-----------------------------------------");
        System.out.println("1. Find the mean: ");
        System.out.println("2. Find the median: ");
        System.out.println("3. Find the mode: ");
        System.out.println("-----------------------------------------");
        int c = obj.nextInt();

        // Creating options for the user to select from
        switch(c){
            case 1:
                double mean = ans_mean(arr);
                System.out.println("The mean is: "+ mean);
                break;
            case 2:
                double median = ans_median(arr);
                System.out.println("The median is: "+median);
                break;
            case 3:
                double mode = ans_mode(arr);
                System.out.println("The mode is: "+ mode);
                break;
            default:
                System.out.println("------------------Your code is terminated-------------------");
        }
    }   
    // Creating the function for mean...
    public static double ans_mean(int[] arr){
         int sum = 0;
        for(int j = 0; j<arr.length; j++){
             sum+=arr[j];
         }
        return (double) sum/arr.length;
    }

    // Now, creating the function for median...
    public static double ans_median(int[] arr) {
        int len = arr.length;
        int m = len/2; // finding the middle index of the array
        if(len%2==0) {
            int left_value = arr[m-1];
            int right_value = arr[m];
            return (double) (left_value+right_value)/2;
        } else {
            // When array element is odd, mid element is the index..
            return (double) arr[m];
        }
    }
    public static double ans_mode(int[] arr) {
        int mode = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }  
        return mode;      
    }
}