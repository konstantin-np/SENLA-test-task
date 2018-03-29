import java.io.*;
import java.util.*;

public class Palindrome
{
	public static boolean plndr(String w)
	{
		char[] word = w.toCharArray();
		for (int i = 0; i < (int) word.length / 2; i++)
		{
			if (word[i] != word[word.length - i - 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input word: ");
		String s = in.nextLine();
		
		if (plndr(s))
			System.out.printf("%s is palindrome\n", s);
		else
			System.out.printf("%s isn't palindrome\n", s);
	}
}