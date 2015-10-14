import org.junit.Test

class HelloWorldTest {
	@Test
	void shouldPrintHelloWorld() {
		def hello = new HelloWorld().greet()
		assert hello.contains("Hello World")
	}	
}
