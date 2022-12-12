import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {

	@Test
	void testGreet() {
		Greeter g = new Greeter("Hello");
		assertEquals("Hello, John!", g.greet("John"));
	}
	
	@Test
	void testGreet2() {
		Greeter g = new Greeter("Guten Tag");
		assertEquals("Guten Tag, Hans!", g.greet("Hans"));
	}
	
	@Test
	void testSimonGreeter() {
		Greeter g = new SimonGreeter("Hallå");
		assertEquals("Simon says \"Hallå, Lars!\"", g.greet("Lars"));
	}
	
	@Test
	void testSimonGreeter2() {
		Greeter g = new SimonGreeter("Добридень");
		assertEquals("Simon says \"Добридень, Володимир!\"", g.greet("Володимир"));
	}
	
	@Test
	void testLoudGreeter() {
		LoudGreeter g = new LoudGreeter("Ciao"); // This didn't work when I used the parent class
		g.addVolume();
		g.addVolume();
		assertEquals("Ciao, Giovanni!!!!", g.greet("Giovanni"));
	}
	
	@Test
	void testLoudGreeter2() {
		Greeter g = new LoudGreeter("Hæ hæ");
		assertEquals("Hæ hæ, Þorsteinn!!", g.greet("Þorsteinn"));
	}
	
	@Test
	void testHtmlGreeter() {
		Greeter g = new HtmlGreeter("Hæ hæ");
		assertEquals("<h1>Hæ hæ, Þorsteinn!</h1>", g.greet("Þorsteinn"));
	}
	
	@Test
	void testHtmlGreeter2() {
		HtmlGreeter g = new HtmlGreeter("Hæ hæ");
		g.setTagName("l2");
		assertEquals("<l2>Hæ hæ, Þorsteinn!</l2>", g.greet("Þorsteinn"));
	}

}
