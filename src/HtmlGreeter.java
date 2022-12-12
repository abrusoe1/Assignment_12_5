
public class HtmlGreeter extends Greeter {
	private String tagName;
	
	public HtmlGreeter (String greeting)
	{
		super (greeting);
		this.greeting = greeting;
		tagName = "h1";
	}
	
	public HtmlGreeter (String greeting, String tagName)
	{
		super (greeting);
		this.greeting = greeting;
		this.tagName = tagName;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
	@Override
	public String greet(String name)
	{
		return "<" + tagName + ">" + super.greet(name) + "</" + tagName + ">";
	}

}
