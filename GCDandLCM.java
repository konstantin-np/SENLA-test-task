import java.io.*;
import java.util.*;

public class GCDandLCM
{
	public static int getGCD(int n1, int n2)
	{
		if (n2 == 0)
			return n1;
		else
			return getGCD(n2, n1 % n2);
	}

	public static int getLCM(int n1, int n2, int divider)
	{
		if (divider % n1 == 0 && divider % n2 == 0)
			return divider;
		else
			return getLCM(n1, n2, divider + 1);

	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int a = in.nextInt();
		System.out.print("Input second number: ");
		int b = in.nextInt();

		int gcd = getGCD(a, b);
		int lcm = getLCM(a, b, 1);
		System.out.printf("GCD = %d, LCM = %d\n", gcd, lcm);
	}
}