class Main {
	static void main(args){
		def helloWorld = new HelloWorld(args[0])
		println helloWorld.greet()
	}
}