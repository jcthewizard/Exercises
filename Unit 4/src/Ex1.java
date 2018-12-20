import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a value for the first X");
		int x1 = scan.nextInt();
		System.out.println("Type in a value for the first Y");
		int y1 = scan.nextInt();
		Point point = new Point(x1, y1); 
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Type in a value for the first X");
		int x2 = scan.nextInt();
		System.out.println("Type in a value for the first Y");
		int y2 = scan.nextInt();
		Point point2 = new Point(x2, y2); 
		
		findDistance(point, point2);
		
	}
	
	public static void findDistance (Point first, Point second)
	{
		int distance = (second.getX() - first.getX()) * (second.getX() - first.getX()) + (second.getY() - first.getY()) * (second.getY() - first.getY());
		System.out.println(Math.sqrt(distance));
	}

}
