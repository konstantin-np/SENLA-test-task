import java.io.*;
import java.util.*;

public class PrimeNumbers
{
	public static boolean isPrime(int num)
	{
		if (num > 1)
		{
			for (int i = 2; i <= (int)(num / 2); i++)
			{
				if (num % i == 0)
					return false;
			}
		}	
		return true;
	}

	public static void main(String[] args)
	{
		Console console = System.console();
		
		int n = Integer.parseInt(console.readLine("Input N: "));
		if (n > 1)
		{
			for (int i = 1; i <= n; i++)
			{
				if (isPrime(i))
					console.writer().println(i);
			}
		}
		else
		{
			console.writer().println("N should be more than 1");
		}
	}
}