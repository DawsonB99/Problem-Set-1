import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Array;
/**
 * Write a description of class Anagram here.
 *
 * @author Dawson Bridger
 * @version Spring 2020
 */
public class Anagram
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);


        String text1 = input.nextLine();
        String text2 = input.nextLine();

        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        char a[] = text1.toCharArray();
        char b[] = text2.toCharArray();

        int indexA = 0;
        int indexB = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0;i < a.length;i++)
        {
            char currChar = Array.getChar(a,i);
            if(Character.isLetter(currChar))
            {
                indexA = i;
                i = a.length;
            }
        }

        for(int i = 0;i < b.length;i++)
        {
            char currChar = Array.getChar(b,i);
            if(Character.isLetter(currChar))
            {
                indexB = i;
                i = b.length;
            }
        }

        char newA[] = Arrays.copyOfRange(a,indexA,a.length - 1);
        char newB[] = Arrays.copyOfRange(b,indexB,b.length - 1);
        System.out.println((Arrays.equals(newA,newB)? "YES" : "NO"));

    }
}
