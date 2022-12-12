import java.util.*;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Choose a greeting: ");
		String greeting = scnr.nextLine();
		Greeter g1 = new Greeter(greeting);
//		g1.setGreeting(greeting);
		
//		System.out.println();
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		
		System.out.print("How much volume to add? (0 to 10): ");
		int vol = scnr.nextInt();
		
		System.out.println(g1.greet(name));
		
		SimonGreeter g2 = new SimonGreeter(greeting);
		System.out.println(g2.greet(name));
		
		LoudGreeter g3 = new LoudGreeter(greeting);

		for (int i = 0; i < vol; i++)
		{
			g3.addVolume();
		}
		System.out.println(g3.greet(name));
		
		HtmlGreeter g4 = new HtmlGreeter(greeting);
		System.out.println(g4.greet(name));
		
		HtmlGreeter g5 = new HtmlGreeter(greeting, "a5");
		System.out.println(g5.greet(name));
		
		scnr.close();
	}

}
