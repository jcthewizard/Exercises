
public class Point3 {

		double x;
		double y;
		
		public void Point()
		{
			
		}
		
		public double getX()
		{
			return x;
		}
		
		public double getY()
		{
			return y;
		}
		
		public void setX(double angle, double distance)
		{
			this.x = distance * Math.cos(angle);
		}
		
		public void setY(double angle, double distance)
		{
			this.y = distance * Math.sin(angle);
		}
		
}
