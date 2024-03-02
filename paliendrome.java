import java.util.*;
public class paliendrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the text :");
        String original=sc.next();
        String reverse="";
        char ch;
        for(int i=0;i<original.length();i++)
        {
            ch=original.charAt(i);
            reverse=ch+reverse;
            System.out.println(reverse);
        }
        System.out.println("The reverse of the given string is :");
        System.out.println(reverse);
        if(original.equals(reverse))
        System.out.println("The given string is a paliendrome");
        else
        System.out.println("It is not a paliendrome");
        sc.close();
    }
}
