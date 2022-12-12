
public class LoudGreeter extends Greeter {
	private String extra = "!";
//	int vol = 0;
	public LoudGreeter (String greeting)
	{
		super (greeting);
		this.greeting = greeting;
	}
	
	public void addVolume()
	{
		extra += "!";
//		vol++;
	}
	
	@Override
	public String greet(String name)
	{
//		for (int i = 0; i < vol; i++)
//		{
//			extra += "!";
//		}
		return super.greet(name) + extra;  
	}
}
	
	

