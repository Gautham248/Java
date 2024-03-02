import java.util.*;
public class Frequency_of_Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String text=sc.nextLine();
        // text=text.toLowerCase();
        System.out.println("Enter the character :");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<text.length();i++)
        {
            if(ch==text.charAt(i))
            count++;
        }
        if(count==0)
        System.out.println("Character not present");
        else
        System.out.println("Frequency of character : "+count);
        sc.close();

    }
}
