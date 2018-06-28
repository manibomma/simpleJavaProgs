enum Beer {
	KF, RC, FO;  // List of constants should be on first line
	
	// Enum can have contructor. This constructor will be executed for 
	// every enum constant separately at the time of loading class
	Beer() {
		System.out.println("Enum's Constructor");
	}
	// Enum can have main() method. So enum can be invoked directly from cmd prompt
	/*
	public static void main(String[] args) {
		System.out.println("Enum's main");
	}
	*/
	
	// CORONA, BUDWEISER; // List constants should be on first line
}

class EnumSample {
	
	public static void main(String[] args) {
		Beer[] beer = Beer.values();
		
		for(Beer b : beer) {
			System.out.println(b);
		}
	}
}


/* OUTPUT :
******************************************************************************************
******************************************************************************************
***				Enum's Constructor													   ***
***				Enum's Constructor													   ***
***				Enum's Constructor													   ***
***				KF																	   ***
***				RC																	   ***
***				FO																	   ***
******************************************************************************************
******************************************************************************************
*/