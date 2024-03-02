


//Wrapper class---> provides a way to use primitive data(int, double,char ,bool) types as reference data types(Strings,Interface,Class..etc)
//					reference data types contains useful methods
//					can be used with collections(ex. Array List)
// Each primitive data type has a corresponding wrapper class
// Primitive-----------------Wrapper-----
// int-----------------------Integer
// bool----------------------Boolean
// char----------------------Character
// double--------------------Double

//autoboxing = the automatic conversion that java compiler makes between the primitive data type and their corresponding object wrapper class
//unboxing   = reverse of autoboxing. automatic conversion of wrapper class to primitive
public class WrapperClass {

	public static void main(String[] args) {
		Boolean a= true;
		Character b='@';
		Integer c= 123;
		Double d=3.14;
		String e="Bro";
		//In the above 5 lines we created 5 reference data types
		//Here autoboxing takes place--> the primitive values true,'@',123,Bro are converted to their corresponding wrapper class by autoboxing
		//we can still treat the above reference data types as if it were primitive-->unboxing
		a.booleanValue();
		a.compareTo(a);
		a.getClass();
		a.getBoolean(e);
		//above listed are some methods of the boolean wrapper class
		//all wrapper classes have lots of methods in them but primitive data types dont
		
		//link--> https://www.javatpoint.com/reference-data-types-in-java
		
		//Question--> Can we always use reference data types in place of primitive??
		// primitive data types are more faster than reference data types
	}

}
