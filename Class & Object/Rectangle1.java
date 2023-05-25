import java.util.Scanner;
class Rectangle
{
	int length,breadth;
	void get(int x,int y)
	{
		length=x;
		breadth=y;
	}
	void disp()
	{
		System.out.println(length*breadth);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		Rectangle obj=new Rectangle();
		System.out.println("Enter A Length");
		int length=m.nextInt();
		System.out.println("Enter A Breadth");
		int breadth=m.nextInt();
		obj.get(length,breadth);
		obj.disp();
	}
}