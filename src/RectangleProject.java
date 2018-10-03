import java.util.Scanner;

public class RectangleProject {
	
	public static void main(String[] args)
	
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length:");
		double length = in.nextInt();
		in.nextLine();
		
		System.out.println("Enter Width");
		double width = in.nextInt();
		in.nextLine();
		double area = length *  width;
		double perimeter = 2 * length + 2 * width;
		double diagonals = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
		System.out.printf("Area:%13.2f \nPerimeter:%8.2f  \nDiagonal:%9.2f", area, perimeter, diagonals);
	}

}

