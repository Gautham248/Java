import java.util.*;

// 2D arrayList--> dynamic list of lists
// you can change the size of list during runtime

public class TwoDimensionalArrayList {

	public static void main(String[] args) {
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic Bread");
		bakeryList.add("Donuts");
		
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("Tomato");
		produceList.add("Zucchini");
		produceList.add("Pepper");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("Zoda");
		drinksList.add("Coffee");
	
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);//prints the entire list
		System.out.println(groceryList.get(0));// prints the first list
		System.out.println(groceryList.get(0).get(0));//prints first element of the first list
		System.out.println(groceryList.get(2).get(1));//prints second element of thied list
		
	}

}
