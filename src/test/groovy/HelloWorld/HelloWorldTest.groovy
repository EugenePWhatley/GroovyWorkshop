package HelloWorld

import org.junit.Test

class HelloWorldTest {
	@Test
	void shouldPrintHelloWithWorld() {
		def hello = new HelloWorld().greet()
		assert hello.contains("Hello World")
	}

	@Test
	void shouldPrintHelloWithName() {
		def hello = new HelloWorld("James").greet()
		assert hello.contains("Hello James")
	}
}
