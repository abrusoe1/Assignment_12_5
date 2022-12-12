
public class SimonGreeter extends Greeter {
	
	public SimonGreeter(String greeting)
	{
		super(greeting);
		this.greeting = greeting;
	}
	
	

	@Override
	public String greet(String name)
	{
		return "Simon says " + '"'  + super.greet(name) + '"'; // Left this way in rather than having to rewrite after figuring out what I was doing wrong in terms of the escape characters
	}
	
}
