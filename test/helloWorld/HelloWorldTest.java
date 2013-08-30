package helloWorld;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import uk.co.placona.helloWorld.HelloWorld;


public class HelloWorldTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Test
	public void testHellowWorld(){
		HelloWorld hello = new HelloWorld();
		assertEquals("A test for Hello World String", "Hello World", hello.sayHello());
	}

	@Test
	public void printsHelloWorld() {
		HelloWorld hello = new HelloWorld();
		hello.printHello();
		assertEquals("Wrong output", "Hello World", log.getLog());
	}
}
