import java.io.*;
import java.util.*;

public class Intersection
{
	
	public static boolean intersec(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		double x = ((x1*y2 - x2*y1)*(x4-x3) - (x3*y4 - x4*y3)*(x2-x1)) / ((y1-y2)*(x4-x3) - (y3-y4)*(x2-x1));
		double y = ((y3-y4)*x - (x3*y4 - x4*y3)) / (x4-x3);
		if ((x >= x1 && x <= x2 && x >= x3 && x <= x4) || (y >= y1 && y <= y2 && y >= y3 && y <= y4)) //если линия пересечения принадлежит отрезкам (а не прямым)
			return true;
		else
			return false;
	}

	public static void main(String[] args)
	{
		Console console = System.console();
		
		console.writer().println("Input A(x1; y1) and B(x2; y2)");
		double x1 = Double.parseDouble(console.readLine("x1: "));
		double y1 = Double.parseDouble(console.readLine("y1: "));
		double x2 = Double.parseDouble(console.readLine("x2: "));
		double y2 = Double.parseDouble(console.readLine("y2: "));
		console.writer().println("Input C(x3; y3) and D(x4; y4)");
		double x3 = Double.parseDouble(console.readLine("x3: "));
		double y3 = Double.parseDouble(console.readLine("y3: "));
		double x4 = Double.parseDouble(console.readLine("x4: "));
		double y4 = Double.parseDouble(console.readLine("y4: "));

		if (intersec(x1, y1, x2, y2, x3, y3, x4, y4))
		{
			console.writer().println("AB and CD lines HAVE intersection");
		}
		else
		{
			console.writer().println("AB and CD lines HAVE NO intersection");
		}
	}
}