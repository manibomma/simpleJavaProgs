enum Beer {
	KF, RC, FO;  // List of constants should be on first line
	
	// Enum can have main() method. So enum can be invoked directly from cmd prompt
	/*
	public static void main(String[] args) {
		System.out.println("Enum's main");
	}
	*/
	
	// CORONA, BUDWEISER; // Not accepted! List constants should be on first line
}

class EnumSample {
	
	public static void main(String[] args) {
		Beer[] beer = Beer.values();
		
		for(Beer b : beer) {
			System.out.println(b);
		}
	}
}
