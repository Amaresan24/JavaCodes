package practicesquestions;

public class ques7 {
public static void main(String args[]) {
//7. Implement a Java program to find the largest and smallest elements in an array.
    int[] num = {16, 5, 7,};
     if(num[0]>num[1] && num[0]>num[2]) {
    	 
    	 System.out.println("This Largest Number is  Array"+ num[0]);
    	 }
     else if(num[1]>num[0] && num[1]>num[3]) {
    	 
    	 System.out.println("This Largest Number is  Array"+ num[1]); 
    	 
     }
     else if(num[2]>num[0] && num[2]>num[1]) {
    	 System.out.println("This Largest Number is  Array"+ num[2]); 
    	 
     }
     else if (num[0]<num[1] && num[0]<num[2]) {
    	 System.out.println("This Smallest Number is  Array"+ num[0]);  
    	 
     }
     
     
     /*
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 5, 7, 3, 15, 9};
        
        // Find the largest and smallest elements
        int largest = findLargest(numbers);
        int smallest = findSmallest(numbers);
        
        // Display the result
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
    
    // Method to find the largest element in an array
    public static int findLargest(int[] arr) {
        int largest = arr[0]; // Initialize with the first element
        
        // Iterate through the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        return largest;
    }
    
    // Method to find the smallest element in an array
    public static int findSmallest(int[] arr) {
        int smallest = arr[0]; // Initialize with the first element
        
        // Iterate through the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        return smallest;
    }

*/
     
     
}

}
