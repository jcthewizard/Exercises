import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in the angle for the first point");
		double x1 = scan.nextInt();
		System.out.println("Type in the distance of the first point");
		double y1 = scan.nextInt();
		Point3 point = new Point3();
		point.setX(x1, y1);
		point.setY(y1, y1);
		
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Type in a the angle for the second point");
		int x2 = scan.nextInt();
		System.out.println("Type in the distance for the second point");
		int y2 = scan.nextInt();
		Point3 point2 = new Point3();               
		point2.setX(x2, y2);
		point2.setY(x2, y2);
		
		findDistance(point, point2);
		
	}
	
	public static void findDistance (Point3 first, Point3 second)
	{
		double distance = (second.getX() - first.getX()) * (second.getX() - first.getX()) + (second.getY() - first.getY()) * (second.getY() - first.getY());
		System.out.println("The distance between the points is approximately " + Math.sqrt(distance));
	}

}
