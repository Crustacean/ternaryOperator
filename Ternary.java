public class Ternary {
	
	public static void main(String[] args){
		
		String makeOfCar = "Volkswagen";
		boolean isDomestic = makeOfCar == "VolksWagen" ? false : true;
		
		if (isDomestic) {
			System.out.println("This car is domestic to our country");
		}
		
	}
	
}