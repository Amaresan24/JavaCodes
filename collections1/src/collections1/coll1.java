package collections1;
import java.util.ArrayList;
public class coll1 {
public static void main(String args[]) {
	 
ArrayList<Integer> nums = new ArrayList<>();

nums.add(69);
nums.add(79);
nums.add(89);
nums.add(59);
nums.add(39);
nums.add(29);

/// set 

nums.set(2 , 90);

// remove
nums.remove(4);

//get

//System.out.println(nums.get(3));
	
	// for loop 
for(int i = 0; i<nums.size(); i++) {
	
	System.out.print(nums.get(i) + " ");
}

// Hance for loop 

for(Integer x : nums) {
	System.out.println(x + " ");
	
}

// for Eeach 

nums.forEach( x -> System.out.print(x + " "));

}	

}
