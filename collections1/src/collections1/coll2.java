package collections1;

import java.util.ArrayList;

public class coll2 {
public static void main(String args[]) {
	
	
	
ArrayList <String> nums = new ArrayList<>();

nums.add("india");
nums.add("japan");
nums.add("italy");
nums.add("america");
nums.add("china");
nums.add("pakistan");
nums.add("afganisthan");
nums.add("brazil");
nums.add("aurstila");
nums.add("africa");

/// set 

nums.set(2 , " north America");

// remove
//nums.remove(4);

//get

//System.out.println(nums.get(3));
	
	// for loop 
for(int i = nums.size()-1; i>0; i--) {
	
	//System.out.print(nums.get(i) + " ");
}


// Hance for loop 

for(String x : nums) {
	if(x.endsWith("a")) {
		//System.out.println(x + " ");
	}
	
	}





// for Eeach  

nums.forEach(x -> {
	
if(x.startsWith("a")){
System.out.println(x + " ");
}

});	
	

}
}
