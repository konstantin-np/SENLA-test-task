import java.io.*;
import java.util.*;

public class NumbersRemover
{
	public static String removeNums(String w)
	{
		char[] word = w.toCharArray();
		String result = "";
		for (int i = 0; i < w.length(); i++)
		{
			if (!Character.isDigit(w.charAt(i)))
				result += w.charAt(i);
		}
		return result;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input text: ");
		String s = in.nextLine();
		
		System.out.println(removeNums(s));
	}
}