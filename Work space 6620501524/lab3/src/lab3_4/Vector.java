package lab3_4;

public class Vector {
	
	public double x;
	public double y;
	public double z;
	
	public Vector() 
	{
		x=0;
		y=0;
		z=0;
	}
	
	public Vector(double p1, double p2, double p3) 
	{
		this.x=p1;
		this.y=p2;
		this.z=p3;
	}
	
	public void printVector()
	{
		System.out.println("(" + (int)x + ',' + (int)y + ',' + (int)z + ')');
	}

}
