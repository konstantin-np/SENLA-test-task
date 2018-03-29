import java.io.*;
import java.util.*;

public class Fib
{
	public static int fibonacci(int num)
	{
		if (num == 0)
	        return 0;
	    else if (num == 1)
	      return 1;
	   	else
	      return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public static void main(String[] args)
	{
		Console console = System.console();
		
		int n = Integer.parseInt(console.readLine("Input N: "));
		if (n > 1)
		{
			for (int i = 1; i <= n; i++)
			{
				console.writer().println(fibonacci(i));
			}
		}
		else
		{
			console.writer().println("N should be more than 1");
		}
	}
}