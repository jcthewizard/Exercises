import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a value for the first X");
		int x1 = scan.nextInt();
		System.out.println("Type in a value for the first Y");
		int y1 = scan.nextInt();
		Point2 point = new Point2();
		point.setX(x1);
		point.setY(y1);
		
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Type in a value for the first X");
		int x2 = scan.nextInt();
		System.out.println("Type in a value for the first Y");
		int y2 = scan.nextInt();
		Point2 point2 = new Point2();
		point2.setX(x2);
		point2.setY(y2);
		
		findDistance(point, point2);
		
	}
	
	public static void findDistance (Point2 first, Point2 second)
	{
		int distance = (second.getX() - first.getX()) * (second.getX() - first.getX()) + (second.getY() - first.getY()) * (second.getY() - first.getY());
		System.out.println(Math.sqrt(distance));
	}

}
