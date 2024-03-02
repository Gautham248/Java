import java.util.*;

// ArrayList-->resizable array
// elements can be added/ removed after compilation phase(cant be done using normal array)
// NOTE-->they only store reference data types.If we need to store primitive data types, use their corresponding wrapper class
// 
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> food= new ArrayList<String>();
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		// some useful methods of ArrayList
		food.set(0,"Sushi"); //replaces the element at the 0th index
		food.remove(2);//removes Hamburger
		food.clear();//deletes the arrayList
		for(int i=0;i<food.size();i++) {
			// i<food.size()--> in case of normal arrays we use food.length
			// for arraylist we use food.size();
			System.out.println(food.get(i));
		}
	}
}
