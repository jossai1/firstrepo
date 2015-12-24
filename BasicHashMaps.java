import java.util.HashMap;


public class BasicHashMaps {

	
	
	
	
	
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> gradebook= new HashMap<String,Integer>();
		//hash map is a key and a value..value something that u want and a key is what you wil use to get that value
		//an array can only store one value type but a hashmap can store two types
		gradebook.put("Jane", 100);
		gradebook.put("kevin", 76);
		gradebook.put("harry", 45);
		gradebook.put("walter", 78);
		gradebook.put("jinky", 90);
		
		int markofjane= gradebook.get("Jane");
		System.out.println(gradebook);
		
		System.out.println("Marks of Jane are: "+ markofjane);
		
		gradebook.remove("jinky");
	}

}
