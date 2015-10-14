import org.junit.Test

class HelloWorldTest {
	@Test
	void shouldPrintHelloWorld() {
		def hello = new HelloWorld("James").greet()
		assert hello.contains("Hello James")
	}	
}
