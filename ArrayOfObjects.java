
 class Food {
	 String name;
	Food(String name){
		this.name=name;
		
	}
	
}


public class ArrayOfObjects {

	public static void main(String[] args) {
		int[] numbers =new int[3];
		char[] characters = new char[4];
		
		Food[] ref=new Food[3];
		
		Food food1=new Food("Pizza");
		Food food2=new Food("Ham");
		Food food3=new Food("Hotdog");
		
		
		ref[0]=food1;
		ref[1]=food2;
		ref[2]=food3;
		
		System.out.println(ref[1].name);
		
	}

}
