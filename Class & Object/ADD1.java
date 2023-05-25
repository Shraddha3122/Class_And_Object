class ADD
{
	int a,b;
	void get(int x,int y)
	{
		a=x;
		b=y;
	}
	void disp()
	{
		System.out.println(a+b);
	}
}
class ADD1

{
	
	public static void main(String args[])
	{
		ADD obj=new ADD();
		obj.get(2,5);
		obj.disp();
	}
}