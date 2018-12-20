
public class Point4 {

		double x;
		double y;
	
		public double getX()
		{
			return x;
		}
		
		public double getY()
		{
			return y;
		}
		
		public double distanceTo(Point4 a)
		{
			double distance = (a.getX() - getX()) * (a.getX() - getX()) + (a.getY() - getY()) * (a.getY() - getY());
			return Math.sqrt(distance);
		}
		
		public double slopeTo(Point4 a)
		{
			double slope = (a.getY() - getY()) / (a.getX() - getX());
			return slope;
		}
		
		public Point4 midpointTo(Point4 a)
		{
			double x = ((a.getX() - getX())/2) + getX();
			double y = ((a.getY() - getY())/2) + getY();
			Point4 point = new Point4();
			point.setActualX(x);
			point.setActualY(y);
			return point;
		}
		
		public int quadrants()
		{
		
			int quad = 0;
			if (getX()>0 && getY()>0)
			{
				quad =1;
			}
			else if (getX()<0 && getY()>0)
			{
				quad = 2;
			}
			else if (getX()>0 && getY()<0)
			{
				quad = 4;
			}
			else if (getX()<0 && getY()<0)
			{
				quad = 3;
			}
			return quad;
		}
		
		public void setX(double angle, double distance)
		{
			this.x = distance * Math.cos(angle);
		}
		
		public void setActualX(double x)
		{
			this.x = x;
		}
		
		public void setActualY(double y)
		{
			this.y = y;
		}
		
		public void setY(double angle, double distance)
		{
			this.y = distance * Math.sin(angle);
		}
		
}
