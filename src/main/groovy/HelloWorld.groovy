class HelloWorld {
	String name

	HelloWorld() {
		name = "World"
	}

	HelloWorld(name) {
		this.name = name
	}

	String greet(){
		return "Hello $name"
	}
}