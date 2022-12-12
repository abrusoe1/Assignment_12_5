
public class Greeter {
	protected String greeting; // Instructions don't say must be private

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
//	public Greeter()	// Instructions say don't have this one; left commented out to prevent later thinking I forgot it
//	{
//		
//	}
	
	public Greeter (String greeting)
	{
		this.greeting = greeting;
	}
	
	public String greet(String name)
	{
		return (greeting + ", " + name + "!"); 
	}

}
