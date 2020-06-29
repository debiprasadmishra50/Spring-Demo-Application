package SpringFormatDemoApp;

public class MainClass 
{
	public static void main(String[] args) 
	{
		B b = new BImpl();
		A a = new AImpl(b);
		// Above two lines are can be achieved by xml file
		System.out.println(a.show());
		System.out.println(a.display());
	}
}
