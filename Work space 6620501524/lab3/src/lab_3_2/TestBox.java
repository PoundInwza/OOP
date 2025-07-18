package lab_3_2;

public class TestBox {
	

	public static void main(String[] args)
	{
		Box box1 = new Box(3,4,5);
		
		System.out.println(box1.getVolume());
		
		box1.resizeBox(box1, 2);
		System.out.println(box1.getVolume());
		
	}
	

}
