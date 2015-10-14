class HelloWorld {
	String name

	HelloWorld(name) {
		this.name = name
	}

	String greet(){
		return "Hello $name"
	}
}