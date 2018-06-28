enum Beer {
	KF, RC, FO;
}

class EnumSample {
	
	public static void main(String[] args) {
		Beer[] beer = Beer.values();
		
		for(Beer b : beer) {
			System.out.println(b);
		}
	}
}