import java.util.*;
public class RandomNumbers {

	public static void main(String[] args) {
		
		Random random= new Random();
		int x= random.nextInt();// range= -2Billion to 2Billion
		int y=random.nextInt(6)+1;
		double a=random.nextDouble();
		boolean z= random.nextBoolean();
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(z);
	}

}
