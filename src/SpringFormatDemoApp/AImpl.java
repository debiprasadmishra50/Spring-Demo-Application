package SpringFormatDemoApp;

public class AImpl implements  A
{
	private B b;
	
	public AImpl(B b) {
		this.b = b;
	}

	@Override
	public String show() {
		return "show() in AImpl";
	}
	
	@Override
	public String display()
	{
		return b.see();
	}

}
